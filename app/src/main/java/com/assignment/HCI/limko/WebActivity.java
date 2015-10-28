package com.assignment.HCI.limko;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;


public class WebActivity extends Activity {

    WebView Limkokwing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Limkokwing = (WebView)findViewById(R.id.webView);

        Limkokwing.setWebViewClient(new myWebClient());
        Limkokwing.getSettings().setJavaScriptEnabled(true);
        Limkokwing.loadUrl("https://limkokwing.net/m");
    }

    public class myWebClient extends WebViewClient
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
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode == KeyEvent.KEYCODE_BACK) && Limkokwing.canGoBack())
        {
            Limkokwing.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}