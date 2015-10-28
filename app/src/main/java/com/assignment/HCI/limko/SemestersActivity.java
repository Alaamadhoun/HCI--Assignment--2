package com.assignment.HCI.limko;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class SemestersActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semesters);
        TextView Semester1 = (TextView)findViewById(R.id.Semester1);
        TextView Semester2 = (TextView)findViewById(R.id.Semester2);
        TextView Semester3 = (TextView)findViewById(R.id.Semester3);
        TextView Semester4 = (TextView)findViewById(R.id.Semester4);
        TextView Semester5 = (TextView)findViewById(R.id.Semester5);
        TextView Semester6 = (TextView)findViewById(R.id.Semester6);

        Semester1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent semesetr1 = new Intent(SemestersActivity.this, Semester1_activity.class);
                startActivity(semesetr1);
            }
        });

        Semester2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent semesetr2 = new Intent(SemestersActivity.this, Semester2Activity.class);
                startActivity(semesetr2);
            }
        });

        Semester3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent semesetr3 = new Intent(SemestersActivity.this, Semester3Activity.class);
                startActivity(semesetr3);
            }
        });

        Semester4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent semesetr4 = new Intent(SemestersActivity.this, Semester4Activity.class);
                startActivity(semesetr4);
            }
        });

        Semester5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent semesetr5 = new Intent(SemestersActivity.this, Semester5Activity.class);
                startActivity(semesetr5);
            }
        });

        Semester6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                Intent semesetr6 = new Intent(SemestersActivity.this, Semester6Activity.class);
                startActivity(semesetr6);
            }
        });

    }


}
