/*Android telephony manager  class provides info about telephony services like subscriber id , sim serial no,phone network type,etc*/

package com.example.appp29;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity29 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity29);
        
        TextView tv=(TextView)findViewById(R.id.textView1);
        
        TelephonyManager tm=(TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
       
        String imei=tm.getDeviceId();
        String subscriberid=tm.getDeviceId();
        String simserialno=tm.getSimSerialNumber();
        String networkcountryiso=tm.getNetworkCountryIso();
        String simcountryiso=tm.getSimCountryIso();
        String networkoperator=tm.getNetworkOperator();
       String opname=tm.getNetworkOperatorName();
        String softwareversion=tm.getDeviceSoftwareVersion();
        String voicemail=tm.getVoiceMailNumber();
       // CellLocation location=tm.getCellLocation();
       // int networktype=tm.getNetworkType();
       
       String strphntype="";
    int phntype=tm.getPhoneType();
    
    switch(phntype)
    {
    case(TelephonyManager.PHONE_TYPE_CDMA):
    	strphntype="CDMA";
    break;
    case(TelephonyManager.PHONE_TYPE_GSM):
    	strphntype="GSM";
    break; case(TelephonyManager.PHONE_TYPE_NONE):
    	strphntype="NONE";
    break;
    }
    boolean roam=tm.isNetworkRoaming();
    
    //Putting all result in one string and printing it at last
    String info="\nPhone Details:\n";
    info+="\nImei no="+imei;
    info+="\nSubscriber id="+subscriberid;
    info+="\nPhone type="+strphntype;
    info+="\nSim Serial no="+simserialno;
    info+="\nNetwork Country iso="+networkcountryiso;
    info+="\nSim Country iso="+simcountryiso;
    info+="\nNetwork operator id="+networkoperator;
    info+="\nNetwork operator Name="+opname;
    info+="\nSoftware version="+softwareversion;
    info+="\nVoice mail no="+voicemail;
    info+="\nIs Roaming?="+roam;
    
    tv.setText(info);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity29, menu);
        return true;
    }
    
}
