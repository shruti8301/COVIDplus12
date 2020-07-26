package com.example.covid;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

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
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class StateFragment extends Fragment {


    RecyclerView recyclerView;
    Context mCtx;


    public StateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View s = inflater.inflate(R.layout.fragment_state, container, false);

        recyclerView=s.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://api.covid19india.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RequestInterface requestInterface=retrofit.create(RequestInterface.class);
        Call<SampleClass> call=requestInterface.GetStates();
        call.enqueue(new Callback<SampleClass>() {
            @Override
            public void onResponse(Call<SampleClass> call, Response<SampleClass> response) {
                List<statewise> statewises=response.body().getStatewiseList();


                Log.i("state count: ", String.valueOf(statewises.size()));

                for(statewise statewise:statewises)
                {
                    String content="";
                    content+= "ACTIVE:"+statewise.getActive()+"\n";
                    content+= "CONFIRMED:"+statewise.getConfirmed()+"\n";
                    content+= "DEATHS:"+statewise.getDeaths()+"\n";
                    content+= "STATE:"+statewise.getState()+"\n";
                    content+= "RECOVERED:"+statewise.getRecovered()+"\n";
                    content+= "todayconfirmed:"+statewise.getDeltaconfirmed()+"\n";
                    content+= "todayRECOVERED:"+statewise.getDeltarecovered()+"\n";
                    content+= "todayDEATHS:"+statewise.getDeltadeaths()+"\n";
                    Log.i("DATA:",content);

                }
                recyclerView.setAdapter(new DataAdapter(getContext(),statewises));


            }

            @Override
            public void onFailure(Call<SampleClass> call, Throwable t) {


                Log.i("Failure",t.toString());

            }
        });
        return s;
    }}

