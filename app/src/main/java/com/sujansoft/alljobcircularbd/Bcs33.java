package com.sujansoft.alljobcircularbd;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.airbnb.lottie.LottieAnimationView;

public class Bcs33 extends AppCompatActivity {

    LottieAnimationView loding;
    WebView web;
    String USER_AGENT_ = "Mozilla/5.0 (Linux; Android 4.1.1; Galaxy Nexus Build/JRO03C) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bcs33);

        web= findViewById(R.id.web);
        loding=findViewById(R.id.loding);

        // Enabling some setting so that browser can work properly

        web.getSettings().setUserAgentString(USER_AGENT_);
        web.getSettings().setLoadsImagesAutomatically(true);
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setAppCacheEnabled(true);
        web.getSettings().setAllowFileAccess(true);
        web.getSettings().setLoadWithOverviewMode(true);
        web.getSettings().setUseWideViewPort(true);

        //-------------------new setting
        web.getSettings().setBlockNetworkLoads (false);
        web.getSettings().setMediaPlaybackRequiresUserGesture(false);
        web.getSettings().setDomStorageEnabled(true);
        web.getSettings().setSupportZoom(true);
        web.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                loding.setVisibility(View.INVISIBLE);


            }
            @Override public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                loding.setVisibility(View.GONE);
                web.setVisibility(View.VISIBLE);


            }

        });

        if (Build.VERSION.SDK_INT >= 19) {
            web.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        }
        web.loadUrl("https://jobtestbd.com/4633/");



    }

    @Override
    public void onBackPressed() {
        if (web.canGoBack()) {
            web.goBack();
        }
        else
            finish();

    }


}


