package com.example.covid;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SampleClass {
    @SerializedName("statewise")
    private List<statewise> statewiseList;




    public List<statewise> getStatewiseList() {
        return statewiseList;
    }

    public void setStatewiseList(List<statewise> statewiseList) {
        this.statewiseList = statewiseList;
    }
}
