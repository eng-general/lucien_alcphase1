package com.example.alc4phase1;

import android.net.http.SslError;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;

import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.helloworld.R;

public class Activity2 extends AppCompatActivity {

    // WebView abt_alc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        WebView abt_alc = findViewById(R.id.webview);
        WebSettings webSettings = abt_alc.getSettings();
        abt_alc.setWebViewClient(new WebViewClient());
        //abt_alc.loadUrl("http://andela.com/alc/");
        abt_alc.getSettings().setJavaScriptEnabled(true);
        abt_alc.getSettings().setDomStorageEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setLoadsImagesAutomatically(true);


        abt_alc.setWebViewClient(
                new SSLTolerantWebViewClient()
        );
        abt_alc.loadUrl("https://www.andela.com/alc/");

    }
}

        class SSLTolerantWebViewClient extends WebViewClient {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed(); // Ignore SSL certificate errors

    }
}
