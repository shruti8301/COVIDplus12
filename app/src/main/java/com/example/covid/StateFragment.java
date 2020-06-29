package com.example.covid;

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


/**
 * A simple {@link Fragment} subclass.
 */
public class StateFragment extends Fragment {

    TextView b1;
    TextView b2;
    TextView b3;

    TextView b4;
    TextView b5;
    TextView b6;

    TextView b7;
    TextView b8;
    TextView b9;

    TextView b10;
    TextView b11;
    TextView b12;

    TextView b13;
    TextView b14;
    TextView b15;

    TextView b16;
    TextView b17;
    TextView b18;

    TextView b19;
    TextView b20;
    TextView b21;

    TextView b22;
    TextView b23;
    TextView b24;

    TextView b25;
    TextView b26;
    TextView b27;

    TextView b28;
    TextView b29;
    TextView b30;

    TextView b31;
    TextView b32;
    TextView b33;

    TextView b34;
    TextView b35;
    TextView b36;

    TextView b37;
    TextView b38;
    TextView b39;

    TextView b40;
    TextView b41;
    TextView b42;

    TextView b43;
    TextView b44;
    TextView b45;

    TextView b46;
    TextView b47;
    TextView b48;

    TextView b49;
    TextView b50;
    TextView b51;

    TextView b52;
    TextView b53;
    TextView b54;

    TextView b55;
    TextView b56;
    TextView b57;

    TextView b58;
    TextView b59;
    TextView b60;

    TextView b61;
    TextView b62;
    TextView b63;

    TextView b64;
    TextView b65;
    TextView b66;

    TextView b67;
    TextView b68;
    TextView b69;

    TextView b70;
    TextView b71;
    TextView b72;

    TextView b73;
    TextView b74;
    TextView b75;

    TextView b76;
    TextView b77;
    TextView b78;

    TextView b103;
    TextView b104;
    TextView b105;

    TextView b79;
    TextView b80;
    TextView b81;

    TextView b82;
    TextView b83;
    TextView b84;

    TextView b85;
    TextView b86;
    TextView b87;

    TextView b88;
    TextView b89;
    TextView b90;

    TextView b91;
    TextView b92;
    TextView b93;

    TextView b94;
    TextView b95;
    TextView b96;

    TextView b97;
    TextView b98;
    TextView b99;

    TextView b100;
    TextView b101;
    TextView b102;




    public StateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View s=inflater.inflate(R.layout.fragment_state, container, false);
        b1=s.findViewById(R.id.b1);
        b2=s.findViewById(R.id.b2);
        b3=s.findViewById(R.id.b3);

        b4=s.findViewById(R.id.b4);
        b5=s.findViewById(R.id.b5);
        b6=s.findViewById(R.id.b6);

        b7=s.findViewById(R.id.b7);
        b8=s.findViewById(R.id.b8);
        b9=s.findViewById(R.id.b9);

        b10=s.findViewById(R.id.b10);
        b11=s.findViewById(R.id.b11);
        b12=s.findViewById(R.id.b12);

        b13=s.findViewById(R.id.b13);
        b14=s.findViewById(R.id.b14);
        b15=s.findViewById(R.id.b15);

        b16=s.findViewById(R.id.b16);
        b17=s.findViewById(R.id.b17);
        b18=s.findViewById(R.id.b18);

        b19=s.findViewById(R.id.b19);
        b20=s.findViewById(R.id.b20);
        b21=s.findViewById(R.id.b21);

        b22=s.findViewById(R.id.b22);
        b23=s.findViewById(R.id.b23);
        b24=s.findViewById(R.id.b24);

        b25=s.findViewById(R.id.b25);
        b26=s.findViewById(R.id.b26);
        b27=s.findViewById(R.id.b27);

        b28=s.findViewById(R.id.b28);
        b29=s.findViewById(R.id.b29);
        b30=s.findViewById(R.id.b30);

        b31=s.findViewById(R.id.b31);
        b32=s.findViewById(R.id.b32);
        b33=s.findViewById(R.id.b33);

        b34=s.findViewById(R.id.b34);
        b35=s.findViewById(R.id.b35);
        b36=s.findViewById(R.id.b36);

        b37=s.findViewById(R.id.b37);
        b38=s.findViewById(R.id.b38);
        b39=s.findViewById(R.id.b39);

        b40=s.findViewById(R.id.b40);
        b41=s.findViewById(R.id.b41);
        b42=s.findViewById(R.id.b42);

        b43=s.findViewById(R.id.b43);
        b44=s.findViewById(R.id.b44);
        b45=s.findViewById(R.id.b45);

        b46=s.findViewById(R.id.b46);
        b47=s.findViewById(R.id.b47);
        b48=s.findViewById(R.id.b48);

        b49=s.findViewById(R.id.b49);
        b50=s.findViewById(R.id.b50);
        b51=s.findViewById(R.id.b51);

        b52=s.findViewById(R.id.b52);
        b53=s.findViewById(R.id.b53);
        b54=s.findViewById(R.id.b54);

        b55=s.findViewById(R.id.b55);
        b56=s.findViewById(R.id.b56);
        b57=s.findViewById(R.id.b57);

        b58=s.findViewById(R.id.b58);
        b59=s.findViewById(R.id.b59);
        b60=s.findViewById(R.id.b60);

        b61=s.findViewById(R.id.b61);
        b62=s.findViewById(R.id.b62);
        b63=s.findViewById(R.id.b63);

        b64=s.findViewById(R.id.b64);
        b65=s.findViewById(R.id.b65);
        b66=s.findViewById(R.id.b66);

        b67=s.findViewById(R.id.b67);
        b68=s.findViewById(R.id.b68);
        b69=s.findViewById(R.id.b69);

        b70=s.findViewById(R.id.b70);
        b71=s.findViewById(R.id.b71);
        b72=s.findViewById(R.id.b72);

        b73=s.findViewById(R.id.b73);
        b74=s.findViewById(R.id.b74);
        b75=s.findViewById(R.id.b75);

        b76=s.findViewById(R.id.b76);
        b77=s.findViewById(R.id.b77);
        b78=s.findViewById(R.id.b78);

        b103=s.findViewById(R.id.b103);
        b104=s.findViewById(R.id.b104);
        b105=s.findViewById(R.id.b105);


        b79=s.findViewById(R.id.b79);
        b80=s.findViewById(R.id.b80);
        b81=s.findViewById(R.id.b81);

        b82=s.findViewById(R.id.b82);
        b83=s.findViewById(R.id.b83);
        b84=s.findViewById(R.id.b84);

        b85=s.findViewById(R.id.b85);
        b86=s.findViewById(R.id.b86);
        b87=s.findViewById(R.id.b87);

        b88=s.findViewById(R.id.b88);
        b89=s.findViewById(R.id.b89);
        b90=s.findViewById(R.id.b90);

        b91=s.findViewById(R.id.b91);
        b92=s.findViewById(R.id.b92);
        b93=s.findViewById(R.id.b93);

        b94=s.findViewById(R.id.b94);
        b95=s.findViewById(R.id.b95);
        b96=s.findViewById(R.id.b96);

        b97=s.findViewById(R.id.b97);
        b98=s.findViewById(R.id.b98);
        b99=s.findViewById(R.id.b99);

        b100=s.findViewById(R.id.b100);
        b101=s.findViewById(R.id.b101);
        b102=s.findViewById(R.id.b102);





        DownloadTask1 task = new DownloadTask1();
        task.execute("https://api.covid19india.org/v3/data.json");


        return s;
    }
    public class DownloadTask1 extends AsyncTask<String,Void,String>
    {

        @Override
        protected String doInBackground(String... urls) {

            String result1="";
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
                    result1 += current;
                    data = reader.read();


                }
                return result1;


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


            return null;
        }

        @Override
        protected void onPostExecute(String result1) {
            super.onPostExecute(result1);
            try {

                String g1="";
                String g2="";

                String g3="";
                String g4="";
                String g5="";

                String g6="";
                String g7="";
                String g8="";

                String g9="";
                String g10="";
                String g11="";

                String g12="";
                String g13="";
                String g14="";

                String g15="";
                String g16="";
                String g17="";

                String g18="";
                String g19="";
                String g20="";

                String g21="";
                String g22="";
                String g23="";

                String g24="";
                String g25="";

                String g26="";
                String g27="";
                String g28="";

                String g29="";
                String g30="";
                String g31="";

                String g32="";
                String g33="";
                String g34="";

                String g35="";
                String g36="";
                String g37="";

                String g38="";
                String g39="";
                String g40="";

                String g41="";
                String g42="";
                String g43="";

                String g44="";
                String g45="";
                String g46="";

                String g47="";
                String g48="";
                String g49="";

                String g50="";
                String g51="";
                String g52="";

                String g53="";
                String g54="";
                String g55="";

                String g56="";
                String g57="";
                String g58="";

                String g59="";
                String g60="";

                String g61="";
                String g62="";
                String g63="";

                String g64="";
                String g65="";

                String g66="";
                String g67="";

                String g68="";
                String g69="";
                String g70="";

                String g71="";
                String g72="";
                String g73="";

                String g98="";
                String g99="";
                String g100="";

                String g74="";
                String g75="";
                String g76="";

                String g77="";
                String g78="";


                String g80="";
                String g81="";
                String g82="";

                String g83="";
                String g84="";
                String g85="";

                String g86="";
                String g87="";
                String g88="";

                String g89="";
                String g90="";
                String g91="";

                String g92="";
                String g93="";
                String g94="";

                String g95="";
                String g96="";
                String g97="";







                JSONObject jsonObject = new JSONObject(result1);

                //AndamanAndNicobar

                String cases1 = jsonObject.getString("AN");
                JSONObject total=new JSONObject(cases1);
                String conf=total.getString("total");
                JSONObject confirmed=new JSONObject(conf);
                String state1confirmedcases=confirmed.getString("confirmed");
                Log.i("CONFIRMED",state1confirmedcases);
                String  recoveredstate1cases=confirmed.getString("recovered");
                Log.i("RECOVERED",recoveredstate1cases);


                if(state1confirmedcases!="" &&  recoveredstate1cases!="" )
                {
                            g1+=state1confirmedcases;
                            g2+=recoveredstate1cases;
                }

                if(g1!="")
                {
                    b1.setText(g1);
                }
                if(g2!="")
                {
                    b2.setText(g2);
                }

                   b3.setText("0");

                //AndhraPradesh


                String cases2 = jsonObject.getString("AP");
                JSONObject total1=new JSONObject(cases2);
                String conf1=total1.getString("total");
                JSONObject confirmed1=new JSONObject(conf1);
                String state2confirmedcases=confirmed1.getString("confirmed");
                Log.i("CONFIRMED",state2confirmedcases);
                String  recoveredstate2cases=confirmed1.getString("recovered");
                Log.i("RECOVERED",recoveredstate2cases);
                String state2deathcases=confirmed1.getString("deceased");
                Log.i("DEATHS",state2deathcases);

                if(state2confirmedcases!="" &&  recoveredstate2cases!="" && state2deathcases!="")
                {
                    g3+=state2confirmedcases;
                    g4+=recoveredstate2cases;
                    g5+=state2deathcases;
                }

                if(g3!="")
                {
                    b4.setText(g3);
                }
                if(g4!="")
                {
                    b5.setText(g4);
                }
                if(g5!="")
                {
                    b6.setText(g5);
                }

                //ArunachalPradesh

                String cases3 = jsonObject.getString("AR");
                JSONObject total2=new JSONObject(cases3);
                String conf2=total2.getString("total");
                JSONObject confirmed2=new JSONObject(conf2);
                String state3confirmedcases=confirmed2.getString("confirmed");
                Log.i("CONFIRMED",state3confirmedcases);
                String  recoveredstate3cases=confirmed2.getString("recovered");
                Log.i("RECOVERED",recoveredstate3cases);
                String state3deathcases=confirmed2.getString("deceased");
                Log.i("DEATHS",state3deathcases);

                if(state3confirmedcases!="" &&  recoveredstate3cases!="" && state3deathcases!="")
                {
                    g6+=state3confirmedcases;
                    g7+=recoveredstate3cases;
                    g8+=state3deathcases;
                }

                if(g6!="")
                {
                    b7.setText(g6);
                }
                if(g7!="")
                {
                    b8.setText(g7);
                }
                if(g8!="")
                {
                    b9.setText(g8);
                }

                //Assam

                String cases4 = jsonObject.getString("AS");
                JSONObject total3=new JSONObject(cases4);
                String conf3=total3.getString("total");
                JSONObject confirmed3=new JSONObject(conf3);
                String state4confirmedcases=confirmed3.getString("confirmed");
                Log.i("CONFIRMED",state4confirmedcases);
                String  recoveredstate4cases=confirmed3.getString("recovered");
                Log.i("RECOVERED",recoveredstate4cases);
                String state4deathcases=confirmed3.getString("deceased");
                Log.i("DEATHS",state4deathcases);

                if(state4confirmedcases!="" &&  recoveredstate4cases!="" && state4deathcases!="")
                {
                    g9+=state4confirmedcases;
                    g10+=recoveredstate4cases;
                    g11+=state4deathcases;
                }

                if(g9!="")
                {
                    b10.setText(g9);
                }
                if(g10!="")
                {
                    b11.setText(g10);
                }
                if(g11!="")
                {
                    b12.setText(g11);
                }

                //Bihar

                String cases5 = jsonObject.getString("BR");
                JSONObject total4=new JSONObject(cases5);
                String conf4=total4.getString("total");
                JSONObject confirmed4=new JSONObject(conf4);
                String state5confirmedcases=confirmed4.getString("confirmed");
                Log.i("CONFIRMED",state5confirmedcases);
                String  recoveredstate5cases=confirmed4.getString("recovered");
                Log.i("RECOVERED",recoveredstate5cases);
                String state5deathcases=confirmed4.getString("deceased");
                Log.i("DEATHS",state5deathcases);

                if(state5confirmedcases!="" &&  recoveredstate5cases!="" && state5deathcases!="")
                {
                    g12+=state5confirmedcases;
                    g13+=recoveredstate5cases;
                    g14+=state5deathcases;
                }

                if(g12!="")
                {
                    b13.setText(g12);
                }
                if(g13!="")
                {
                    b14.setText(g13);
                }
                if(g14!="")
                {
                    b15.setText(g14);
                }

                //Chandigarh

                String cases6 = jsonObject.getString("CH");
                JSONObject total5=new JSONObject(cases6);
                String conf5=total5.getString("total");
                JSONObject confirmed5=new JSONObject(conf5);
                String state6confirmedcases=confirmed5.getString("confirmed");
                Log.i("CONFIRMED",state6confirmedcases);
                String  recoveredstate6cases=confirmed5.getString("recovered");
                Log.i("RECOVERED",recoveredstate6cases);
                String state6deathcases=confirmed5.getString("deceased");
                Log.i("DEATHS",state6deathcases);

                if(state6confirmedcases!="" &&  recoveredstate6cases!="" && state6deathcases!="")
                {
                    g15+=state6confirmedcases;
                    g16+=recoveredstate6cases;
                    g17+=state6deathcases;
                }

                if(g15!="")
                {
                    b16.setText(g15);
                }
                if(g16!="")
                {
                    b17.setText(g16);
                }
                if(g17!="")
                {
                    b18.setText(g17);
                }

                //Chhattisgarh

                String cases7 = jsonObject.getString("CT");
                JSONObject total6=new JSONObject(cases7);
                String conf6=total6.getString("total");
                JSONObject confirmed6=new JSONObject(conf6);
                String state7confirmedcases=confirmed6.getString("confirmed");
                Log.i("CONFIRMED",state7confirmedcases);
                String  recoveredstate7cases=confirmed6.getString("recovered");
                Log.i("RECOVERED",recoveredstate7cases);
                String state7deathcases=confirmed6.getString("deceased");
                Log.i("DEATHS",state7deathcases);

                if(state7confirmedcases!="" &&  recoveredstate7cases!="" && state7deathcases!="")
                {
                    g18+=state7confirmedcases;
                    g19+=recoveredstate7cases;
                    g20+=state7deathcases;
                }

                if(g18!="")
                {
                    b19.setText(g18);
                }
                if(g19!="")
                {
                    b20.setText(g19);
                }
                if(g20!="")
                {
                    b21.setText(g20);
                }

                //DELHI
                String cases8 = jsonObject.getString("DL");
                JSONObject total7=new JSONObject(cases8);
                String conf7=total7.getString("total");
                JSONObject confirmed7=new JSONObject(conf7);
                String state8confirmedcases=confirmed7.getString("confirmed");
                Log.i("CONFIRMED",state8confirmedcases);
                String  recoveredstate8cases=confirmed7.getString("recovered");
                Log.i("RECOVERED",recoveredstate8cases);
                String state8deathcases=confirmed7.getString("deceased");
                Log.i("DEATHS",state8deathcases);

                if(state8confirmedcases!="" &&  recoveredstate8cases!="" && state8deathcases!="")
                {
                    g21+=state8confirmedcases;
                    g22+=recoveredstate8cases;
                    g23+=state8deathcases;
                }

                if(g21!="")
                {
                    b22.setText(g21);
                }
                if(g22!="")
                {
                    b23.setText(g22);
                }
                if(g23!="")
                {
                    b24.setText(g23);
                }
                //DAMAN DADAR

                String cases9 = jsonObject.getString("DN");
                JSONObject total8=new JSONObject(cases9);
                String conf8=total8.getString("total");
                JSONObject confirmed8=new JSONObject(conf8);
                String state9confirmedcases=confirmed8.getString("confirmed");
                Log.i("CONFIRMED",state9confirmedcases);
                String  recoveredstate9cases=confirmed8.getString("recovered");
                Log.i("RECOVERED",recoveredstate9cases);


                if(state9confirmedcases!="" &&  recoveredstate9cases!="")
                {
                    g24+=state9confirmedcases;
                    g25+=recoveredstate9cases;

                }

                if(g24!="")
                {
                    b25.setText(g24);
                }
                if(g25!="")
                {
                    b26.setText(g25);
                }

                    b27.setText("0");

                //GOA

                String cases10 = jsonObject.getString("GA");
                JSONObject total9=new JSONObject(cases10);
                String conf9=total9.getString("total");
                JSONObject confirmed9=new JSONObject(conf9);
                String state10confirmedcases=confirmed9.getString("confirmed");
                Log.i("CONFIRMED",state9confirmedcases);
                String  recoveredstate10cases=confirmed9.getString("recovered");
                Log.i("RECOVERED",recoveredstate10cases);
                String state10deathcases=confirmed9.getString("deceased");
                Log.i("DEATHS",state10deathcases);

                if(state10confirmedcases!="" &&  recoveredstate10cases!="" && state10deathcases!="")
                {
                    g26+=state10confirmedcases;
                    g27+=recoveredstate10cases;
                    g28+=state10deathcases;
                }

                if(g26!="")
                {
                    b28.setText(g26);
                }
                if(g27!="")
                {
                    b29.setText(g27);
                }
                if(g28!="")
                {
                    b30.setText(g28);
                }

                //GUJARAT

                String cases11 = jsonObject.getString("GJ");
                JSONObject total10=new JSONObject(cases11);
                String conf10=total10.getString("total");
                JSONObject confirmed10=new JSONObject(conf10);
                String state11confirmedcases=confirmed10.getString("confirmed");
                Log.i("CONFIRMED",state11confirmedcases);
                String  recoveredstate11cases=confirmed10.getString("recovered");
                Log.i("RECOVERED",recoveredstate11cases);
                String state11deathcases=confirmed10.getString("deceased");
                Log.i("DEATHS",state11deathcases);

                if(state11confirmedcases!="" &&  recoveredstate11cases!="" && state11deathcases!="")
                {
                    g29+=state11confirmedcases;
                    g30+=recoveredstate11cases;
                    g31+=state11deathcases;
                }

                if(g29!="")
                {
                    b31.setText(g29);
                }
                if(g30!="")
                {
                    b32.setText(g30);
                }
                if(g31!="")
                {
                    b33.setText(g31);
                }

                //HIMACHAL PRADESH

                String cases12 = jsonObject.getString("HP");
                JSONObject total11=new JSONObject(cases12);
                String conf11=total11.getString("total");
                JSONObject confirmed11=new JSONObject(conf11);
                String state12confirmedcases=confirmed11.getString("confirmed");
                Log.i("CONFIRMED",state12confirmedcases);
                String  recoveredstate12cases=confirmed11.getString("recovered");
                Log.i("RECOVERED",recoveredstate12cases);
                String state12deathcases=confirmed11.getString("deceased");
                Log.i("DEATHS",state12deathcases);

                if(state12confirmedcases!="" &&  recoveredstate12cases!="" && state12deathcases!="")
                {
                    g32+=state12confirmedcases;
                    g33+=recoveredstate12cases;
                    g34+=state12deathcases;
                }

                if(g32!="")
                {
                    b34.setText(g32);
                }
                if(g33!="")
                {
                    b35.setText(g33);
                }
                if(g34!="")
                {
                    b36.setText(g34);
                }



                //HARYANA
                String cases13 = jsonObject.getString("HR");
                JSONObject total12=new JSONObject(cases13);
                String conf12=total12.getString("total");
                JSONObject confirmed12=new JSONObject(conf12);
                String state13confirmedcases=confirmed12.getString("confirmed");
                Log.i("CONFIRMED",state13confirmedcases);
                String  recoveredstate13cases=confirmed12.getString("recovered");
                Log.i("RECOVERED",recoveredstate13cases);
                String state13deathcases=confirmed12.getString("deceased");
                Log.i("DEATHS",state13deathcases);

                if(state13confirmedcases!="" &&  recoveredstate13cases!="" && state13deathcases!="")
                {
                    g35+=state13confirmedcases;
                    g36+=recoveredstate13cases;
                    g37+=state13deathcases;
                }

                if(g35!="")
                {
                    b37.setText(g35);
                }
                if(g36!="")
                {
                    b38.setText(g36);
                }
                if(g37!="")
                {
                    b39.setText(g37);
                }

                //JHARKHAND
                String cases14 = jsonObject.getString("JH");
                JSONObject total13=new JSONObject(cases14);
                String conf13=total13.getString("total");
                JSONObject confirmed13=new JSONObject(conf13);
                String state14confirmedcases=confirmed13.getString("confirmed");
                Log.i("CONFIRMED",state14confirmedcases);
                String  recoveredstate14cases=confirmed13.getString("recovered");
                Log.i("RECOVERED",recoveredstate14cases);
                String state14deathcases=confirmed13.getString("deceased");
                Log.i("DEATHS",state14deathcases);

                if(state14confirmedcases!="" &&  recoveredstate14cases!="" && state14deathcases!="")
                {
                    g38+=state14confirmedcases;
                    g39+=recoveredstate14cases;
                    g40+=state14deathcases;
                }

                if(g38!="")
                {
                    b40.setText(g38);
                }
                if(g39!="")
                {
                    b41.setText(g39);
                }
                if(g40!="")
                {
                    b42.setText(g40);
                }

                //JAMMU AND KASHMIR
                String cases15 = jsonObject.getString("JK");
                JSONObject total14=new JSONObject(cases15);
                String conf14=total14.getString("total");
                JSONObject confirmed14=new JSONObject(conf14);
                String state15confirmedcases=confirmed14.getString("confirmed");
                Log.i("CONFIRMED",state15confirmedcases);
                String  recoveredstate15cases=confirmed14.getString("recovered");
                Log.i("RECOVERED",recoveredstate15cases);
                String state15deathcases=confirmed14.getString("deceased");
                Log.i("DEATHS",state15deathcases);

                if(state15confirmedcases!="" &&  recoveredstate15cases!="" && state15deathcases!="")
                {
                    g41+=state15confirmedcases;
                    g42+=recoveredstate15cases;
                    g43+=state15deathcases;
                }

                if(g41!="")
                {
                    b43.setText(g41);
                }
                if(g42!="")
                {
                    b44.setText(g42);
                }
                if(g40!="")
                {
                    b45.setText(g43);
                }

                //KARNATAKA

                String cases16 = jsonObject.getString("KA");
                JSONObject total15=new JSONObject(cases16);
                String conf15=total15.getString("total");
                JSONObject confirmed15=new JSONObject(conf15);
                String state16confirmedcases=confirmed15.getString("confirmed");
                Log.i("CONFIRMED",state16confirmedcases);
                String  recoveredstate16cases=confirmed15.getString("recovered");
                Log.i("RECOVERED",recoveredstate16cases);
                String state16deathcases=confirmed15.getString("deceased");
                Log.i("DEATHS",state16deathcases);

                if(state16confirmedcases!="" &&  recoveredstate16cases!="" && state16deathcases!="")
                {
                    g44+=state16confirmedcases;
                    g45+=recoveredstate16cases;
                    g46+=state16deathcases;
                }

                if(g44!="")
                {
                    b46.setText(g44);
                }
                if(g45!="")
                {
                    b47.setText(g45);
                }
                if(g46!="")
                {
                    b48.setText(g46);
                }

                //KERALA
                String cases17 = jsonObject.getString("KL");
                JSONObject total16=new JSONObject(cases17);
                String conf16=total16.getString("total");
                JSONObject confirmed16=new JSONObject(conf16);
                String state17confirmedcases=confirmed16.getString("confirmed");
                Log.i("CONFIRMED",state17confirmedcases);
                String  recoveredstate17cases=confirmed16.getString("recovered");
                Log.i("RECOVERED",recoveredstate17cases);
                String state17deathcases=confirmed16.getString("deceased");
                Log.i("DEATHS",state17deathcases);

                if(state17confirmedcases!="" &&  recoveredstate17cases!="" && state17deathcases!="")
                {
                    g47+=state17confirmedcases;
                    g48+=recoveredstate17cases;
                    g49+=state17deathcases;
                }

                if(g47!="")
                {
                    b49.setText(g47);
                }
                if(g48!="")
                {
                    b50.setText(g48);
                }
                if(g49!="")
                {
                    b51.setText(g49);
                }

                //LADAKH
                String cases18 = jsonObject.getString("LA");
                JSONObject total17=new JSONObject(cases18);
                String conf17=total17.getString("total");
                JSONObject confirmed17=new JSONObject(conf17);
                String state18confirmedcases=confirmed17.getString("confirmed");
                Log.i("CONFIRMED",state18confirmedcases);
                String  recoveredstate18cases=confirmed17.getString("recovered");
                Log.i("RECOVERED",recoveredstate18cases);
                String state18deathcases=confirmed17.getString("deceased");
                Log.i("DEATHS",state18deathcases);

                if(state18confirmedcases!="" &&  recoveredstate18cases!="" && state18deathcases!="")
                {
                    g50+=state18confirmedcases;
                    g51+=recoveredstate18cases;
                    g52+=state18deathcases;
                }

                if(g50!="")
                {
                    b52.setText(g50);
                }
                if(g51!="")
                {
                    b53.setText(g51);
                }
                if(g52!="")
                {
                    b54.setText(g52);
                }

                //MAHARASHTRA

                String cases19 = jsonObject.getString("MH");
                JSONObject total18=new JSONObject(cases19);
                String conf18=total18.getString("total");
                JSONObject confirmed18=new JSONObject(conf18);
                String state19confirmedcases=confirmed18.getString("confirmed");
                Log.i("CONFIRMED",state19confirmedcases);
                String  recoveredstate19cases=confirmed18.getString("recovered");
                Log.i("RECOVERED",recoveredstate18cases);
                String state19deathcases=confirmed18.getString("deceased");
                Log.i("DEATHS",state19deathcases);

                if(state19confirmedcases!="" &&  recoveredstate19cases!="" && state19deathcases!="")
                {
                    g53+=state19confirmedcases;
                    g54+=recoveredstate19cases;
                    g55+=state19deathcases;
                }

                if(g53!="")
                {
                    b55.setText(g53);
                }
                if(g54!="")
                {
                    b56.setText(g54);
                }
                if(g55!="")
                {
                    b57.setText(g55);
                }

                //MEGHALAYA
                String cases20 = jsonObject.getString("ML");
                JSONObject total19=new JSONObject(cases20);
                String conf19=total19.getString("total");
                JSONObject confirmed19=new JSONObject(conf19);
                String state20confirmedcases=confirmed19.getString("confirmed");
                Log.i("CONFIRMED",state20confirmedcases);
                String  recoveredstate20cases=confirmed19.getString("recovered");
                Log.i("RECOVERED",recoveredstate20cases);
                String state20deathcases=confirmed19.getString("deceased");
                Log.i("DEATHS",state20deathcases);

                if(state20confirmedcases!="" &&  recoveredstate20cases!="" && state20deathcases!="")
                {
                    g56+=state20confirmedcases;
                    g57+=recoveredstate20cases;
                    g58+=state20deathcases;
                }

                if(g56!="")
                {
                    b58.setText(g56);
                }
                if(g57!="")
                {
                    b59.setText(g57);
                }
                if(g58!="")
                {
                    b60.setText(g58);
                }

                //MANIPUR
                String cases21 = jsonObject.getString("MN");
                JSONObject total20=new JSONObject(cases21);
                String conf20=total20.getString("total");
                JSONObject confirmed20=new JSONObject(conf20);
                String state21confirmedcases=confirmed20.getString("confirmed");
                Log.i("CONFIRMED",state21confirmedcases);
                String  recoveredstate21cases=confirmed20.getString("recovered");
                Log.i("RECOVERED",recoveredstate21cases);


                if(state21confirmedcases!="" &&  recoveredstate21cases!="" )
                {
                    g59+=state21confirmedcases;
                    g60+=recoveredstate21cases;

                }

                if(g59!="")
                {
                    b61.setText(g59);
                }
                if(g60!="")
                {
                    b62.setText(g60);
                }

                    b63.setText("0");

                //MADHYA PRADESH

                String cases22 = jsonObject.getString("MP");
                JSONObject total21=new JSONObject(cases22);
                String conf21=total21.getString("total");
                JSONObject confirmed21=new JSONObject(conf21);
                String state22confirmedcases=confirmed21.getString("confirmed");
                Log.i("CONFIRMED",state22confirmedcases);
                String  recoveredstate22cases=confirmed21.getString("recovered");
                Log.i("RECOVERED",recoveredstate22cases);
                String state22deathcases=confirmed21.getString("deceased");
                Log.i("DEATHS",state22deathcases);

                if(state22confirmedcases!="" &&  recoveredstate22cases!="" && state22deathcases!="")
                {
                    g61+=state22confirmedcases;
                    g62+=recoveredstate22cases;
                    g63+=state22deathcases;
                }

                if(g61!="")
                {
                    b64.setText(g61);
                }
                if(g62!="")
                {
                    b65.setText(g62);
                }
                if(g63!="")
                {
                    b66.setText(g63);
                }

                //MIZORAM
                String cases23 = jsonObject.getString("MZ");
                JSONObject total22=new JSONObject(cases23);
                String conf22=total22.getString("total");
                JSONObject confirmed22=new JSONObject(conf22);
                String state23confirmedcases=confirmed22.getString("confirmed");
                Log.i("CONFIRMED",state23confirmedcases);
                String  recoveredstate23cases=confirmed22.getString("recovered");
                Log.i("RECOVERED",recoveredstate23cases);

                if(state23confirmedcases!="" &&  recoveredstate23cases!="")
                {
                    g64+=state23confirmedcases;
                    g65+=recoveredstate23cases;

                }

                if(g64!="")
                {
                    b67.setText(g64);
                }
                if(g65!="")
                {
                    b68.setText(g65);
                }
                    b69.setText("0");

                //NAGALAND

                String cases24 = jsonObject.getString("NL");
                JSONObject total23=new JSONObject(cases24);
                String conf23=total23.getString("total");
                JSONObject confirmed23=new JSONObject(conf23);
                String state24confirmedcases=confirmed23.getString("confirmed");
                Log.i("CONFIRMED",state24confirmedcases);
                String  recoveredstate24cases=confirmed23.getString("recovered");
                Log.i("RECOVERED",recoveredstate24cases);

                if(state24confirmedcases!="" &&  recoveredstate24cases!="")
                {
                    g66+=state24confirmedcases;
                    g67+=recoveredstate24cases;

                }

                if(g66!="")
                {
                    b70.setText(g66);
                }
                if(g67!="")
                {
                    b71.setText(g67);
                }
                b72.setText("0");

                //ODISHA

                String cases25 = jsonObject.getString("OR");
                JSONObject total24=new JSONObject(cases25);
                String conf24=total24.getString("total");
                JSONObject confirmed24=new JSONObject(conf24);
                String state25confirmedcases=confirmed24.getString("confirmed");
                Log.i("CONFIRMED",state25confirmedcases);
                String  recoveredstate25cases=confirmed24.getString("recovered");
                Log.i("RECOVERED",recoveredstate25cases);
                String state25deathcases=confirmed24.getString("deceased");
                Log.i("DEATHS",state25deathcases);

                if(state25confirmedcases!="" &&  recoveredstate25cases!="" && state25deathcases!="")
                {
                    g68+=state25confirmedcases;
                    g69+=recoveredstate25cases;
                    g70+=state25deathcases;
                }

                if(g68!="")
                {
                    b73.setText(g68);
                }
                if(g69!="")
                {
                    b74.setText(g69);
                }
                if(g70!="")
                {
                    b75.setText(g70);
                }

                //PUNJAB

                String cases26 = jsonObject.getString("PB");
                JSONObject total25=new JSONObject(cases26);
                String conf25=total25.getString("total");
                JSONObject confirmed25=new JSONObject(conf25);
                String state26confirmedcases=confirmed25.getString("confirmed");
                Log.i("CONFIRMED",state26confirmedcases);
                String  recoveredstate26cases=confirmed25.getString("recovered");
                Log.i("RECOVERED",recoveredstate26cases);
                String state26deathcases=confirmed25.getString("deceased");
                Log.i("DEATHS",state26deathcases);

                if(state26confirmedcases!="" &&  recoveredstate26cases!="" && state26deathcases!="")
                {
                    g71+=state26confirmedcases;
                    g72+=recoveredstate26cases;
                    g73+=state26deathcases;
                }

                if(g71!="")
                {
                    b76.setText(g71);
                }
                if(g72!="")
                {
                    b77.setText(g72);
                }
                if(g73!="")
                {
                    b78.setText(g73);
                }

                //PONDICHERRY

                String cases28 = jsonObject.getString("PY");
                JSONObject total27=new JSONObject(cases28);
                String conf27=total27.getString("total");
                JSONObject confirmed27=new JSONObject(conf27);
                String state28confirmedcases=confirmed27.getString("confirmed");
                Log.i("CONFIRMED",state28confirmedcases);
                String  recoveredstate28cases=confirmed27.getString("recovered");
                Log.i("RECOVERED",recoveredstate28cases);
                String state28deathcases=confirmed27.getString("deceased");
                Log.i("DEATHS",state28deathcases);

                if(state28confirmedcases!="" &&  recoveredstate28cases!="" && state28deathcases!="")
                {
                    g98+=state28confirmedcases;
                    g99+=recoveredstate28cases;
                    g100+=state28deathcases;
                }

                if(g98!="")
                {
                    b103.setText(g98);
                }
                if(g99!="")
                {
                    b104.setText(g99);
                }
                if(g100!="")
                {
                    b105.setText(g100);
                }



                //RAJASTHAN

                String cases27 = jsonObject.getString("RJ");
                JSONObject total26=new JSONObject(cases27);
                String conf26=total26.getString("total");
                JSONObject confirmed26=new JSONObject(conf26);
                String state27confirmedcases=confirmed26.getString("confirmed");
                Log.i("CONFIRMED",state27confirmedcases);
                String  recoveredstate27cases=confirmed26.getString("recovered");
                Log.i("RECOVERED",recoveredstate27cases);
                String state27deathcases=confirmed26.getString("deceased");
                Log.i("DEATHS",state27deathcases);

                if(state27confirmedcases!="" &&  recoveredstate27cases!="" && state27deathcases!="")
                {
                    g74+=state27confirmedcases;
                    g75+=recoveredstate27cases;
                    g76+=state27deathcases;
                }

                if(g74!="")
                {
                    b79.setText(g74);
                }
                if(g75!="")
                {
                    b80.setText(g75);
                }
                if(g76!="")
                {
                    b81.setText(g76);
                }



                //SIKKIM
                String cases29 = jsonObject.getString("SK");
                JSONObject total28=new JSONObject(cases29);
                String conf28=total28.getString("total");
                JSONObject confirmed28=new JSONObject(conf28);
                String state29confirmedcases=confirmed28.getString("confirmed");
                Log.i("CONFIRMED",state29confirmedcases);
                String  recoveredstate29cases=confirmed28.getString("recovered");
                Log.i("RECOVERED",recoveredstate29cases);


                if(state29confirmedcases!="" &&  recoveredstate29cases!="")
                {
                    g77+=state29confirmedcases;
                    g78+=recoveredstate29cases;

                }

                if(g77!="")
                {
                    b82.setText(g77);
                }
                if(g78!="")
                {
                    b83.setText(g78);
                }

                    b84.setText("0");


                //TELANGANA

                String cases30 = jsonObject.getString("TG");
                JSONObject total29=new JSONObject(cases30);
                String conf29=total29.getString("total");
                JSONObject confirmed29=new JSONObject(conf29);
                String state30confirmedcases=confirmed29.getString("confirmed");
                Log.i("CONFIRMED",state30confirmedcases);
                String  recoveredstate30cases=confirmed29.getString("recovered");
                Log.i("RECOVERED",recoveredstate30cases);
                String state30deathcases=confirmed29.getString("deceased");
                Log.i("DEATHS",state30deathcases);

                if(state30confirmedcases!="" &&  recoveredstate30cases!="" && state30deathcases!="")
                {
                    g80+=state30confirmedcases;
                    g81+=recoveredstate30cases;
                    g82+=state30deathcases;
                }

                if(g80!="")
                {
                    b85.setText(g80);
                }
                if(g81!="")
                {
                    b86.setText(g81);
                }
                if(g82!="")
                {
                    b87.setText(g82);
                }

                //TAMIL NADU

                String cases31 = jsonObject.getString("TN");
                JSONObject total30=new JSONObject(cases31);
                String conf30=total30.getString("total");
                JSONObject confirmed30=new JSONObject(conf30);
                String state31confirmedcases=confirmed30.getString("confirmed");
                Log.i("CONFIRMED",state31confirmedcases);
                String  recoveredstate31cases=confirmed30.getString("recovered");
                Log.i("RECOVERED",recoveredstate31cases);
                String state31deathcases=confirmed30.getString("deceased");
                Log.i("DEATHS",state31deathcases);

                if(state31confirmedcases!="" &&  recoveredstate31cases!="" && state31deathcases!="")
                {
                    g83+=state31confirmedcases;
                    g84+=recoveredstate31cases;
                    g85+=state31deathcases;
                }

                if(g83!="")
                {
                    b88.setText(g83);
                }
                if(g84!="")
                {
                    b89.setText(g84);
                }
                if(g85!="")
                {
                    b90.setText(g85);
                }

                //TRIPURA

                String cases32 = jsonObject.getString("TR");
                JSONObject total31=new JSONObject(cases32);
                String conf31=total31.getString("total");
                JSONObject confirmed31=new JSONObject(conf31);
                String state32confirmedcases=confirmed31.getString("confirmed");
                Log.i("CONFIRMED",state32confirmedcases);
                String  recoveredstate32cases=confirmed31.getString("recovered");
                Log.i("RECOVERED",recoveredstate32cases);
                String state32deathcases=confirmed31.getString("deceased");
                Log.i("DEATHS",state32deathcases);

                if(state32confirmedcases!="" &&  recoveredstate32cases!="" && state32deathcases!="")
                {
                    g86+=state32confirmedcases;
                    g87+=recoveredstate32cases;
                    g88+=state32deathcases;
                }

                if(g86!="")
                {
                    b91.setText(g86);
                }
                if(g87!="")
                {
                    b92.setText(g87);
                }
                if(g88!="")
                {
                    b93.setText(g88);
                }

                //UTTAR PRADESH

                String cases33 = jsonObject.getString("UP");
                JSONObject total32=new JSONObject(cases33);
                String conf32=total32.getString("total");
                JSONObject confirmed32=new JSONObject(conf32);
                String state33confirmedcases=confirmed32.getString("confirmed");
                Log.i("CONFIRMED",state33confirmedcases);
                String  recoveredstate33cases=confirmed32.getString("recovered");
                Log.i("RECOVERED",recoveredstate33cases);
                String state33deathcases=confirmed32.getString("deceased");
                Log.i("DEATHS",state33deathcases);

                if(state33confirmedcases!="" &&  recoveredstate33cases!="" && state33deathcases!="")
                {
                    g89+=state33confirmedcases;
                    g90+=recoveredstate33cases;
                    g91+=state33deathcases;
                }

                if(g89!="")
                {
                    b94.setText(g89);
                }
                if(g90!="")
                {
                    b95.setText(g90);
                }
                if(g91!="")
                {
                    b96.setText(g91);
                }

                //UTTARAKHAND

                String cases34 = jsonObject.getString("UT");
                JSONObject total33=new JSONObject(cases34);
                String conf33=total33.getString("total");
                JSONObject confirmed33=new JSONObject(conf33);
                String state34confirmedcases=confirmed33.getString("confirmed");
                Log.i("CONFIRMED",state34confirmedcases);
                String  recoveredstate34cases=confirmed33.getString("recovered");
                Log.i("RECOVERED",recoveredstate34cases);
                String state34deathcases=confirmed33.getString("deceased");
                Log.i("DEATHS",state34deathcases);

                if(state34confirmedcases!="" &&  recoveredstate34cases!="" && state34deathcases!="")
                {
                    g92+=state34confirmedcases;
                    g93+=recoveredstate34cases;
                    g94+=state34deathcases;
                }

                if(g92!="")
                {
                    b97.setText(g92);
                }
                if(g93!="")
                {
                    b98.setText(g93);
                }
                if(g94!="")
                {
                    b99.setText(g94);
                }

                //WEST BENGAL
                String cases35 = jsonObject.getString("WB");
                JSONObject total34=new JSONObject(cases35);
                String conf34=total34.getString("total");
                JSONObject confirmed34=new JSONObject(conf34);
                String state35confirmedcases=confirmed34.getString("confirmed");
                Log.i("CONFIRMED",state35confirmedcases);
                String  recoveredstate35cases=confirmed34.getString("recovered");
                Log.i("RECOVERED",recoveredstate35cases);
                String state35deathcases=confirmed34.getString("deceased");
                Log.i("DEATHS",state35deathcases);

                if(state35confirmedcases!="" &&  recoveredstate35cases!="" && state35deathcases!="")
                {
                    g95+=state35confirmedcases;
                    g96+=recoveredstate35cases;
                    g97+=state35deathcases;
                }

                if(g95!="")
                {
                    b100.setText(g95);
                }
                if(g96!="")
                {
                    b101.setText(g96);
                }
                if(g97!="")
                {
                    b102.setText(g97);
                }

            } catch (JSONException e) {
                e.printStackTrace();
            }



        }


    }

}