package com.example.appp18;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class MainActivitysecond1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activitysecond1);
		TextView tv1=(TextView)findViewById(R.id.textView1);
		TextView tv2=(TextView)findViewById(R.id.textView2);
		StringBuilder str= new StringBuilder();
		
		Intent in=getIntent();
		Bundle b=in.getExtras();
		if(b!=null)
		{
			tv1.setText("Name:"+b.getString("name")+"\n"+"Address:"+b.getString("add")+"\n"+"Gender:"+b.getString("gen")+"\n");
			
			String h1=b.getString("h1");    
			String h2=b.getString("h2"); 
			String h3=b.getString("h3");
			String h4=b.getString("h4");
			if(h1!=null)
			{
				str.append("Hobbies:"+h1);
			}
			if(h2!=null)
			{
				str.append("\n"+h2);
			}
			if(h3!=null)
			{
				str.append("\n"+h3);
			}
			if(h4!=null)
			{
				str.append("\n"+h4);
			}
			Double m1=b.getDouble("m1");
			Double m2=b.getDouble("m2");
			Double m3=b.getDouble("m3");
			Double sum=b.getDouble("sum");
			Double avg=b.getDouble("avg");
			tv2.setText(str+"\n"+"marks:  "+m1+"   "+m2+"   "+m3+"   "+sum+"   "+avg+"\n");
	}
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activitysecond1, menu);
		return true;
	}

}



