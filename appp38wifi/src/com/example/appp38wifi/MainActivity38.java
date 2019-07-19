package com.example.appp38wifi;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity38 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity38);
        Button btn1=(Button)findViewById(R.id.button1);
        Button btn2=(Button)findViewById(R.id.button2);
        
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				WifiManager wifi=(WifiManager)getSystemService(Context.WIFI_SERVICE);
				wifi.setWifiEnabled(true);
				
			}
		});
        btn2.setOnClickListener(new View.OnClickListener() {
			
   			@Override
   			public void onClick(View v) {
   				// TODO Auto-generated method stub
   				WifiManager wifi=(WifiManager)getSystemService(Context.WIFI_SERVICE);
   				wifi.setWifiEnabled(false);
   				
   				
   			}
   		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity38, menu);
        return true;
    }
    
}
