package com.example.rajat.p_jatayu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by JATIN on 16-12-2016.
 */
public class Legacy extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.legacy);
        WebView webView=(WebView)findViewById(R.id.legacy);
        webView.loadUrl("http://www.jatayumotorsports.in/history.html");
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings= webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
