package com.example.covid;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorldFragment extends Fragment {
    TextView newtotal;
    TextView total;
    TextView recovered;
    TextView active;
    TextView newdeaths;
    TextView deaths;



    public WorldFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_world, container, false);
        newtotal=v.findViewById(R.id.newTotal);
        total=v.findViewById(R.id.worldTotal);
        recovered=v.findViewById(R.id.worldRecovered);
        active=v.findViewById(R.id.worldActive);
        newdeaths=v.findViewById(R.id.newDeaths);
        deaths=v.findViewById(R.id.worldDeaths);
        DownloadTask task = new DownloadTask();
        task.execute("https://api.thevirustracker.com/free-api?global=stats");

        setRetainInstance(true);

         return v;
    }
    public class DownloadTask extends AsyncTask<String,Void,String>
    {

        @Override
        protected String doInBackground(String... urls) {
            String result="";
            URL url;
            HttpURLConnection urlConnection=null;
            try {
                url = new URL(urls[0]);
                urlConnection = (HttpURLConnection) url.openConnection();
                InputStream in = urlConnection.getInputStream();
                InputStreamReader reader = new InputStreamReader(in);
                int data = reader.read();
                while (data != -1) {
                    char current = (char) data;
                    result += current;
                    data = reader.read();


                }
                return result;


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            try {

                String t1="";
                String t2="";
                String t3="";
                String t4="";
                String t5="";
                String t6="";

                JSONObject jsonObject = new JSONObject(result);
                String cases = jsonObject.getString("results");
                Log.i("CONTENT", cases);
                JSONArray jsonArray=new JSONArray(cases);
                for(int i=0;i<jsonArray.length();i++){
                    JSONObject jsonPart=jsonArray.getJSONObject(i);


                    String newtotalcases="";
                    String totalcases="";
                    String recov="";
                    String activecases="";
                    String newdeathcases="";
                    String deathcases="";

                    newtotalcases=jsonPart.getString("total_new_cases_today");
                    totalcases=jsonPart.getString("total_cases");
                     recov=jsonPart.getString("total_recovered");
                     activecases=jsonPart.getString("total_serious_cases");
                     newdeathcases=jsonPart.getString("total_new_deaths_today");
                     deathcases=jsonPart.getString("total_deaths");


                    if(newtotalcases!="" && totalcases!="" && recov!="" && activecases!="" && newdeathcases!="" && deathcases!="")
                    {

                        t1+=newtotalcases;
                        t2+=totalcases;
                        t3+=recov;
                        t4+=activecases;
                        t5+=newdeathcases;
                        t6+=deathcases;

                    }

                }
                if(t1!="")
                {
                    newtotal.setText(t1);
                }
                if(t2!="")
                {
                    total.setText(t2);
                }
                if(t3!="")
                {
                    recovered.setText(t3);
                }
                if(t4!="")
                {
                    active.setText(t4);
                }
                if(t5!="")
                {
                    newdeaths.setText(t5);
                }
                if(t6!="")
                {
                    deaths.setText(t6);
                }



            } catch (JSONException e) {
                e.printStackTrace();
            }

        }



    }}
