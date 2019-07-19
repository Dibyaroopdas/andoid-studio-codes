package com.example.appp49gps;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity49 extends Activity implements LocationListener{ //USE HERE LOCATION LISTENEWR
    
	TextView ln,lt;
	LocationManager lm;
	String provider;
	Location l;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity49);
        
        ln=(TextView)findViewById(R.id.textView4);
        lt=(TextView)findViewById(R.id.textView3);
        ln.setText("");
        lt.setText("");
        
        //get location service
        lm=(LocationManager)this.getSystemService(Context.LOCATION_SERVICE);
        Criteria c=new Criteria();
      //criteria object will select best service based on
      //Accuracy, power consumption, response, bearing and monetary cost
      //set false to use best service otherwise it will select the default Sim network
      //and give the location based on sim network 
      //now it will first check satellite than Internet than Sim network location
        provider=lm.getBestProvider(c, false);
      //now you have best provider
      //get location
        l=lm.getLastKnownLocation(provider);
        if(l!=null)
        {
        //get latitude and longitude of the location
        double lng=l.getLongitude();
        double lat=l.getLatitude();
        //display on text view
             ln.setText(""+lng);
             lt.setText(""+lat);
        }
        else
        {
            ln.setText("No Provider");
            lt.setText("No Provider");
        }
        }
  //If you want location on changing place also than use below method
  //otherwise remove all below methods and don't implement location listener



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity49, menu);
        return true;
    }
	@Override
	public void onLocationChanged(Location location) {
		// TODO Auto-generated method stub
		double lng=l.getLongitude();
		double lat=l.getLatitude();
		    ln.setText(""+lng);
		    lt.setText(""+lat);
		
	}
	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
		
	}
    
}
