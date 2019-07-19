package com.example.appp20;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity20 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity20);
        final Spinner s1=(Spinner)findViewById(R.id.spinner1);
        final String[] nm={"Batman","Superman","Captain america","Hulk","Ramlal","Shaktimaan"};
        ArrayAdapter<String> ad= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, nm);
        
        s1.setAdapter(ad);  //assign the ArrayAdapter object to the Spinner view
        s1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				int index = s1.getSelectedItemPosition();
				Toast.makeText(getBaseContext(),
						"You have selected item : " +nm[index],
						Toast.LENGTH_SHORT).show();
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity20, menu);
        return true;
    }
    
}
