package com.example.appp17;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity17 extends Activity {
	int tot=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity17);
        CheckBox cb1=(CheckBox)findViewById(R.id.checkBox1);
        CheckBox cb2=(CheckBox)findViewById(R.id.checkBox2);
        CheckBox cb3=(CheckBox)findViewById(R.id.checkBox3);
        
        cb1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
                 if(((CheckBox)v).isChecked())
                 {
                	 tot+=400;
                 }
                 else                             //this block is for unchecked,its not for any other action like not clicked for the first time
                 {
                	 tot-=400;
                 }
				
			}
		});
        cb2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
                 if(((CheckBox)v).isChecked())
                 {
                	 tot+=40;
                 }
                 else                             //this block is for unchecked,its not for any other action like not clicked for the first time
                 {
                	 tot-=40;
                 }
				
			}
		});       
        cb3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
                 if(((CheckBox)v).isChecked())
                 {
                	 tot+=50;
                 }
                 else                             //this block is for unchecked,its not for any other action like not clicked for the first time
                 {
                	 tot-=50;
                 }
				
			}
		});  
        Button btn1=(Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getBaseContext(), String.valueOf(tot),Toast.LENGTH_LONG).show();
				
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity17, menu);
        return true;
    }
    
}
