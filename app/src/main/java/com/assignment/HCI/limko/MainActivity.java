package com.assignment.HCI.limko;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.btn1);
        button1.setOnClickListener(this);
    }

    private void btn1click() {

        Intent i = new Intent(MainActivity.this, Activity1.class);
        startActivity(i);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn1) {
            btn1click();
            finish();
        }

    }
}
