package com.assignment.HCI.limko;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class coursesActivity extends Activity {

    WebView courses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        courses = (WebView)findViewById(R.id.chrome);

        courses.setWebViewClient(new myWebClient());
        courses.getSettings().setJavaScriptEnabled(true);
        courses.loadUrl("file:///android_asset/limko_courses/courses.html");
    }

    public class myWebClient extends WebViewClient // to define our browser client and and only show the page when it is fully loaded
    {
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)// allows to go to the previous page and not exiting the app
    {
        if((keyCode == KeyEvent.KEYCODE_BACK) && courses.canGoBack())
        {
            courses.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
