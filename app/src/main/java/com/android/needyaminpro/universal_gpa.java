package com.android.needyaminpro;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class universal_gpa extends Activity {
    WebView webView;
    ProgressBar progressBar;
    String URL = "https://universalgpa.blogspot.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universal_gpa);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        webView = (WebView)findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);

        //loading progressbar
        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress)
            {
                progressBar.setProgress(progress);

                if (progress == 100) {
                    progressBar.setVisibility(View.GONE);

                } else {
                    progressBar.setVisibility(View.VISIBLE);

                }
            }
        });

        webView.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
                view.loadUrl(url);
                return true;
            }
        });

        //check internet connection start
        if (isOnline()) {
            webView.loadUrl(URL);
            Toast.makeText(getApplicationContext(), "Internet Connected", Toast.LENGTH_SHORT).show();

        } else {
            try {
                new AlertDialog.Builder(universal_gpa.this)
                        .setTitle("Error")
                        .setMessage("Internet not available, Cross check your internet connectivity and try again later...")
                        .setCancelable(false)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                finish();

                            }
                        }).show();
            } catch (Exception e) {
                //Log.d(Constants.TAG, "Show Dialog: " + e.getMessage());
            }
        }
        //check internet connection end

    }

    //enabling back button to go to previous page
    public boolean isOnline() {
        ConnectivityManager conMgr = (ConnectivityManager) getApplicationContext()
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = conMgr.getActiveNetworkInfo();

        if(netInfo == null || !netInfo.isConnected() || !netInfo.isAvailable()){
            return false;
        }
        return true;
    }


    //enabling back button to go to previous page
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (webView.canGoBack()) {
                        webView.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }
}