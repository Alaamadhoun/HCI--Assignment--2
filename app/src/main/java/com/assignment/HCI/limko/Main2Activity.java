package com.assignment.HCI.limko;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

import com.assignment.HCI.limko.R;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView w=(WebView) findViewById(R.id.wb);
        w.loadUrl("file:///assets/index.html");
    }

}
