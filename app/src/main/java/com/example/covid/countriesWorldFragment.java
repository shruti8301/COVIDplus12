package com.example.covid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class countriesWorldFragment extends Fragment {
    RecyclerView recyclerView1;
    Context mCtx;
    public countriesWorldFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View t=inflater.inflate(R.layout.fragment_countriesworld, container, false);


         recyclerView1 = t.findViewById(R.id.recyclerView1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity()));


        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://corona.lmao.ninja/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
       final countriesInterface requestInterface1=retrofit.create(countriesInterface.class);
        Call<List<mainclass>> call1=requestInterface1.Getcountries();
        call1.enqueue(new Callback<List<mainclass>>() {
            @Override
            public void onResponse(Call<List<mainclass>> call, Response<List<mainclass>> response1) {
                List<mainclass> mainclasses=response1.body();


                Log.i("RESULT:",String.valueOf(mainclasses.get(0).getCountryInfo().getFlag()));

                for(mainclass mainclass1:mainclasses) {
                    String result="";
                    result+=mainclass1.getCountry()+"\n";
                    result+=mainclass1.getCases()+"\n";
                    result+=mainclass1.getCountryInfo().getFlag()+"\n";
                    result+=mainclass1.getDeaths()+"\n";
                    result+=mainclass1.getRecovered()+"\n";
                    result+=mainclass1.getActive()+"\n";
                    Log.i("MAIN",result);
                }

                recyclerView1.setAdapter(new countryAdapter(getContext(),mainclasses));
          }

            @Override
            public void onFailure(Call<List<mainclass>> call, Throwable t) {

            }
        });

        return t;
    }
}
