package com.example.appp19;

import com.example.appp19.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class MainActivitynew extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activitynew);
		TextView tv1=(TextView)findViewById(R.id.textView1);
		
		StringBuilder str= new StringBuilder();
		
		Intent in=getIntent();
		Bundle b=in.getExtras();
		if(b!=null)
		{
			
			
			String h1=b.getString("h1");    
			String h2=b.getString("h2"); 
			String h3=b.getString("h3");
			String h4=b.getString("h4");
			str.append("\nHobbies:");
			if(h1!=null)
			{
				str.append("\n\t\t\t\t\t"+h1);
			}
			if(h2!=null)
			{
				str.append("\n\t\t\t\t\t"+h2);
			}
			if(h3!=null)
			{
				str.append("\n\t\t\t\t\t"+h3);
			}
			if(h4!=null)
			{
				str.append("\n\t\t\t\t\t"+h4);
			}
			Double m1=b.getDouble("m1");
			Double m2=b.getDouble("m2");
			Double m3=b.getDouble("m3");
			Double m4=b.getDouble("m4");
			Double m5=b.getDouble("m5");
			Double m6=b.getDouble("m6");
			Double sum=b.getDouble("sum");
			Double avg=b.getDouble("avg");
			tv1.setText("Name:"+b.getString("name")+"\n"+"Address:"+b.getString("add")+"\n"+"Gender:"+b.getString("gen")+str+"\n\n"+"\t\t\t\t\tMarks:\nEnglish:  "+m1+"\nMaths:   "+m2+"\nPhysics:   "+m3+"\nChemistry:   "+m4
			+"\nComputer:   "+m5+"\nHindi:   "+m6+"\nTotal:   "+sum+"\nPercentage:   "+avg+"%"+"\n");
			
	}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activitynew, menu);
		return true;
	}

}
