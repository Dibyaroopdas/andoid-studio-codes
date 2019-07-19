package com.example.appp14;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class MainActivitysecond extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activitysecond);
		
		TextView tv1=(TextView)findViewById(R.id.textView1);
		TextView tv2=(TextView)findViewById(R.id.textView2);
		
		Intent in=getIntent();
		Bundle b=in.getExtras();
		if(b!=null)
		{
			tv1.setText("Name:"+b.getString("name")+"\n");
			tv2.setText("Address:"+b.getString("add"));
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activitysecond, menu);
		return true;
	}

}
