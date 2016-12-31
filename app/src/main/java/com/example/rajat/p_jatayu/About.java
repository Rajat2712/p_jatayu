package com.example.rajat.p_jatayu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by JATIN on 15-12-2016.
 */
public class About extends AppCompatActivity {
    private WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        webView2=(WebView)findViewById(R.id.web2);
        webView2.setWebViewClient(new WebViewClient());
        webView2.loadUrl("http://www.jatayumotorsports.in/about.html");
        WebSettings webSettings= webView2.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
