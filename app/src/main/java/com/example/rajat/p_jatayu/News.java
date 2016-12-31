package com.example.rajat.p_jatayu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by JATIN on 15-12-2016.
 */
public class News extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news);
        webView=(WebView)findViewById(R.id.web1);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.auatv.com/section/atvnews");
    }
}
