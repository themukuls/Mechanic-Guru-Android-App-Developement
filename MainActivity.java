package com.android.mechanicguru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.content.Intent;
import android.net.Uri;


public class MainActivity extends AppCompatActivity {
    private WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebView = (WebView)findViewById(R.id.webview);
        WebSettings webSettings = mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("https://www.mechanicguru.org");
        //Link for opening links in App itself
        mywebView.setWebViewClient(new WebViewClient());
    }

    //Code for Back Button
    @Override
    public void onBackPressed() {
        if (mywebView.canGoBack())
        {
            mywebView.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}


