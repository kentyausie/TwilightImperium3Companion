package com.myapps.kent.ti3_stats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

import unit.Unit;

public class Stat_Screen extends AppCompatActivity {

    MainData data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stat__screen);

        data = new MainData("arborec");
        System.out.println(data.getUnitStats().size());
        setStatsTable();
        setRaceAbilities();

    }

    public void setRaceAbilities(){
        LinearLayout raceAbilities = (LinearLayout) findViewById(R.id.raceAbilities);
        for(int i = 0; i<data.getRaceAbilities().size(); i++){
            TextView t = new TextView(this);
            t.setText(data.getRaceAbilities().get(i));
            raceAbilities.addView(t);
        }

    }

    public void setStatsTable() {
        ArrayList<Unit> units = data.getUnitStats();
        TableLayout stk = (TableLayout) findViewById(R.id.stats);

        TableRow tbrow0 = new TableRow(this);
        tbrow0.setWeightSum(10);
        TextView tv0 = new TextView(this);
        tv0.setText("UNIT");
        tv0.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 2));
        tbrow0.addView(tv0);
        TextView tv1 = new TextView(this);
        tv1.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1));
        tv1.setText("COST");
        tbrow0.addView(tv1);
        TextView tv2 = new TextView(this);
        tv2.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1));
        tv2.setText("BATTLE");
        tbrow0.addView(tv2);
        TextView tv3 = new TextView(this);
        tv3.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1));
        tv3.setText("MVMT");
        tbrow0.addView(tv3);
        TextView tv4 = new TextView(this);
        tv4.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 5));
        tv4.setText("SPECIAL");
        tbrow0.addView(tv4);
        stk.addView(tbrow0);
        for (int i = 0; i < data.getUnitStats().size(); i++) {
            System.out.println(i);
            TableRow tbrow = new TableRow(this);
            tbrow.setWeightSum(10);
            TextView t0v = new TextView(this);
            t0v.setText(data.getUnitStats().get(i).getStyleName());
            t0v.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 2));
            tbrow.addView(t0v);
            TextView t1v = new TextView(this);
            t1v.setText(""+data.getUnitStats().get(i).getCost());
            t1v.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1));
            tbrow.addView(t1v);
            TextView t2v = new TextView(this);
            t2v.setText(data.getUnitStats().get(i).getBattleString());
            t2v.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1));
            tbrow.addView(t2v);
            TextView t3v = new TextView(this);
            t3v.setText(""+data.getUnitStats().get(i).getMovement());
            t3v.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1));
            tbrow.addView(t3v);
            TextView t4v = new TextView(this);
            t4v.setText(data.getUnitStats().get(i).getSpecialAttributeString());
            t4v.setLayoutParams(new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 5));
            tbrow.addView(t4v);
            stk.addView(tbrow);

        }
    }
}
