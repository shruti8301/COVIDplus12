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
public class CountryFragment extends Fragment {

    TextView newIndiaTotal;
    TextView IndiaTotal;
    TextView IndiaRecovered;
    TextView IndiaActive;
    TextView newIndiaDeaths;
    TextView IndiaDeaths;

    public CountryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r= inflater.inflate(R.layout.fragment_country, container, false);
        newIndiaTotal=r.findViewById(R.id.newIndiaTotal);
        IndiaTotal=r.findViewById(R.id.IndiaTotal);
        IndiaRecovered=r.findViewById(R.id.IndiaRecovered);
        IndiaActive=r.findViewById(R.id.IndiaActive);
        newIndiaDeaths=r.findViewById(R.id.newIndiaDeaths);
        IndiaDeaths=r.findViewById(R.id.IndiaDeaths);

        DownloadTask task = new DownloadTask();
        task.execute("https://api.thevirustracker.com/free-api?countryTotal=IN");



        return r;
    }

    public class DownloadTask extends AsyncTask<String,Void,String>
    {

        @Override
        protected String doInBackground(String... urls) {
            String indiaresult="";
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
        protected void onPostExecute(String indiaresult) {
            super.onPostExecute(indiaresult);
            try {

                String d1="";
                String d2="";
                String d3="";
                String d4="";
                String d5="";
                String d6="";

                JSONObject jsonObject = new JSONObject(indiaresult);
                String casesindia = jsonObject.getString("countrydata");
                Log.i("CASES", casesindia);
                JSONArray jsonArray=new JSONArray(casesindia);
                for(int i=0;i<jsonArray.length();i++){
                    JSONObject jsonPart=jsonArray.getJSONObject(i);


                    String newindiatotalcases="";
                    String totalindiacases="";
                    String indiarecov="";
                    String activeindiacases="";
                    String newindiadeathcases="";
                    String indiadeathcases="";

                    newindiatotalcases=jsonPart.getString("total_new_cases_today");
                    totalindiacases=jsonPart.getString("total_cases");
                    indiarecov=jsonPart.getString("total_recovered");
                    activeindiacases=jsonPart.getString("total_serious_cases");
                    newindiadeathcases=jsonPart.getString("total_new_deaths_today");
                    indiadeathcases=jsonPart.getString("total_deaths");


                    if(newindiatotalcases!="" && totalindiacases!="" && indiarecov!="" && activeindiacases!="" && newindiadeathcases!="" && indiadeathcases!="")
                    {

                        d1+=newindiatotalcases;
                        d2+=totalindiacases;
                        d3+=indiarecov;
                        d4+=activeindiacases;
                        d5+=newindiadeathcases;
                        d6+=indiadeathcases;

                    }

                }
                if(d1!="")
                {
                    newIndiaTotal.setText(d1);
                }
                if(d2!="")
                {
                    IndiaTotal.setText(d2);
                }
                if(d3!="")
                {
                    IndiaRecovered.setText(d3);
                }
                if(d4!="")
                {
                   IndiaActive.setText(d4);
                }
                if(d5!="")
                {
                    newIndiaDeaths.setText(d5);
                }
                if(d6!="")
                {
                    IndiaDeaths.setText(d6);
                }



            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

}}
