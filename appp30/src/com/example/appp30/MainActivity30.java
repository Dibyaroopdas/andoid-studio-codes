/*This app shows what is the current call state like phone is ringing or busy or ideal.*/
package com.example.appp30;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity30 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity30);
        TelephonyManager tm=(TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
       try{ PhoneStateListener callStateListener=new PhoneStateListener(){
        	public void onCallStateChanged(int state,String incomingNumber){
        		if(state==TelephonyManager.CALL_STATE_RINGING)
        		{
        			Toast.makeText(getApplicationContext(), "Phone is Ringing", Toast.LENGTH_LONG).show();
        		}
        		if(state==TelephonyManager.CALL_STATE_OFFHOOK)
        		{
        			Toast.makeText(getApplicationContext(), "Phone is Busy", Toast.LENGTH_LONG).show();
        		}
        		if(state==TelephonyManager.CALL_STATE_IDLE)
        		{
        			Toast.makeText(getApplicationContext(), "Phone is Idle", Toast.LENGTH_LONG).show();
        		}
        	}
        };
       
       tm.listen(callStateListener,PhoneStateListener.LISTEN_CALL_STATE);
    }catch(Exception e){e.printStackTrace();}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity30, menu);
        return true;
    }
    
}
