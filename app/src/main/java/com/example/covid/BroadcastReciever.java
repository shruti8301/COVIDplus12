package com.example.covid;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BroadcastReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        DownloadTask task = new DownloadTask();
        task.execute("https://api.thevirustracker.com/free-api?countryTotal=IN");
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "notifyupdate")
                .setSmallIcon(R.drawable.coronatrackerappicon1)
                .setContentTitle("COVID+")
                .setContentText("Successfully Updated")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
        notificationManager.notify(200, builder.build());


    }

    public class DownloadTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... urls) {
            String indiaresult = "";
            URL url;
            HttpURLConnection urlConnection = null;
            try {
                url = new URL(urls[0]);
                urlConnection = (HttpURLConnection) url.openConnection();
                InputStream in = urlConnection.getInputStream();
                InputStreamReader reader = new InputStreamReader(in);
                int data = reader.read();
                while (data != -1) {
                    char current = (char) data;
                    indiaresult += current;
                    data = reader.read();


                }
                return indiaresult;


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String indiaResult) {
            super.onPostExecute(indiaResult);
            try {

                String n1="";


                JSONObject jsonObject = new JSONObject(indiaResult);
                String casesindia = jsonObject.getString("countrydata");
                Log.i("CASES", casesindia);
                JSONArray jsonArray=new JSONArray(casesindia);
                for(int i=0;i<jsonArray.length();i++){
                    JSONObject jsonPart=jsonArray.getJSONObject(i);


                    String newindiatotalcases="";


                    newindiatotalcases=jsonPart.getString("total_new_cases_today");

                    if(newindiatotalcases!="" )
                    {

                        n1+=newindiatotalcases;


                    }

                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}