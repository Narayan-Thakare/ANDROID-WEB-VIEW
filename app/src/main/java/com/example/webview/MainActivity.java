package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        webView = findViewById(R.id.webView);

        webView.loadUrl("https://www.yahoo.com/");

       webView.setWebViewClient(new WebViewClient(){


           @Override
           public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
               return super.shouldOverrideUrlLoading(view, request);
           }
       });


    }


    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}