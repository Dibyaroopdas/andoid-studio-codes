package com.example.appp15;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity15 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity15);
        WebView webView = (WebView) findViewById(R.id.webView1);
        webView.setWebViewClient(new Callback());
        WebSettings webSettings = webView.getSettings();
        webSettings.setBuiltInZoomControls(true);
        //---Part 1---
      //---Part 3---
        webView.loadUrl("file:///android_asset/form.php");
    }
    private class Callback extends WebViewClient {
    	@Override
    	public boolean shouldOverrideUrlLoading(WebView view,
    	String url) {
    	return (false);
    	}
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity15, menu);
        return true;
    }
    
}

