package com.example.covid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder> {

    private Context mCtx;
    private List<statewise> statewises;

    public DataAdapter(Context mCtx, List<statewise> statewises) {
        this.mCtx = mCtx;
        this.statewises = statewises;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.listitem,null);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        statewise sts=statewises.get(position);
        holder.stateName.setText(sts.getState());
        holder.totalTextView.setText(sts.getConfirmed());
        holder.recoveredTextView.setText(sts.getRecovered());
        holder.deathsTextView.setText(sts.getDeaths());
        holder.ActiveTextView.setText(sts.getActive());
    }

    @Override
    public int getItemCount() {
        return statewises.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

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
            totalTextView=itemView.findViewById(R.id.totalStateCount);
            recoveredTextView=itemView.findViewById(R.id.recoveredTextView);
            deathsTextView=itemView.findViewById(R.id.DeathsTextView);
            stateName=itemView.findViewById(R.id.stateTextView);
            ActiveTextView=itemView.findViewById(R.id.ActiveTextView);
        }
    }
}

