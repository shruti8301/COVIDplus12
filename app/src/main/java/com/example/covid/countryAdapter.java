package com.example.covid;

import android.content.Context;
import android.media.Image;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class countryAdapter extends RecyclerView.Adapter<countryAdapter.MyViewHolder> {

    private Context mCtx;
    private List<mainclass> mainclasses;
    public countryAdapter(Context mCtx, List<mainclass> mainclasses) {
        this.mCtx = mCtx;
        this.mainclasses = mainclasses;
    }

    @NonNull
    @Override
    public countryAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.worldcountrieslayout,null);


        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull countryAdapter.MyViewHolder holder, int position) {
        mainclass sts=mainclasses.get(position);
        holder.stateName.setText(sts.getCountry());
        holder.totalTextView.setText(sts.getCases());
        holder.recoveredTextView.setText(sts.getRecovered());
        holder.deathsTextView.setText(sts.getDeaths());
        holder.ActiveTextView.setText(sts.getActive());
        mainclass image = mainclasses.get(position);


    }

    @Override
    public int getItemCount() {
        return mainclasses.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView total;
        ImageView recovered;
        ImageView deaths;
        ImageView active;
        TextView totalTextView,recoveredTextView,deathsTextView,stateName,ActiveTextView;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            total=itemView.findViewById(R.id.total);
            recovered=itemView.findViewById(R.id.recov);
            deaths=itemView.findViewById(R.id.death);
            active=itemView.findViewById(R.id.active);
            totalTextView=itemView.findViewById(R.id.totalCountryCount);
            recoveredTextView=itemView.findViewById(R.id.recoveredTextView);
            deathsTextView=itemView.findViewById(R.id.DeathsTextView);
            stateName=itemView.findViewById(R.id.countryTextView);
            ActiveTextView=itemView.findViewById(R.id.ActiveTextView);
        }
    }
}
