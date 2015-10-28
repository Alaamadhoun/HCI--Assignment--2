package com.assignment.HCI.limko;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class WebActivity2 extends Activity {

    WebView loc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web2);
        loc = (WebView)findViewById(R.id.webView);

        loc.setWebViewClient(new myWebClient());
        loc.getSettings().setJavaScriptEnabled(true);
        loc.loadUrl("https://www.google.com/maps/d/u/0/embed?mid=zrPdNoA6ReWc.kkpjJ09pOWHs&source=embed&hl=en&geocode&ie=UTF8&msa=0&t=m&ll=2.940298%2C101.661816&spn=0.030001%2C0.036478&z=14&output=embed");
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
        if((keyCode == KeyEvent.KEYCODE_BACK) && loc.canGoBack())
        {
            loc.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}