package com.example.appp18;

import com.example.appp18.MainActivitysecond1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity18 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity18);
        
        final EditText enm=(EditText)findViewById(R.id.editText1);
        final EditText eadd=(EditText)findViewById(R.id.editText2);
        final RadioButton rb1 = (RadioButton) findViewById(R.id.radio0);
        final RadioButton rb2 = (RadioButton) findViewById(R.id.radio1);
        final CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox1);
        final CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2);
        final CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox3);
        final CheckBox cb4 = (CheckBox) findViewById(R.id.checkBox4);
        Button btn1=(Button)findViewById(R.id.button1);
        final EditText ma1=(EditText)findViewById(R.id.editText3);
        final EditText ma2=(EditText)findViewById(R.id.editText4);
        final EditText ma3=(EditText)findViewById(R.id.editText5);
        
        btn1.setOnClickListener(new View.OnClickListener() {
        	String h1,h2,h3,h4,gen;
			@Override
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String nm=enm.getText().toString();
				String add=eadd.getText().toString();
				
				if(rb1.isChecked())
				{
					 gen="Male";
				}
				else if(rb2.isChecked())
				{
					 gen="Female";
				}
				
				cb1.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						
						if(((CheckBox)v).isChecked())
						{
							 h1="Singing";
						}
						else
						{
							h1=null;
						}
						
					}
				});
				cb2.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						if(((CheckBox)v).isChecked())
						{
							h2="Dancing";
						}
						else
						{
							 h2=null;
						}
						
					}
				});
				cb3.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						if(((CheckBox)v).isChecked())
						{
							 h3="Outdoor Games";
						}
						else
						{
							 h3=null;
						}
						
					}
				});
				cb4.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						if(((CheckBox)v).isChecked())
						{
							 h4="Indoor Games";
						}
						else
						{
							 h4=null;
						}
						
					}
				});
				
				double m1=Double.valueOf(ma1.getText().toString());
				double m2=Double.valueOf(ma2.getText().toString());
				double m3=Double.valueOf(ma3.getText().toString());
				double sum=m1+m2+m3;
				double avg=sum/3;
				
				Bundle bun=new Bundle();
				bun.putString("name",nm);
				bun.putString("add",add);
				bun.putString("gen",gen);
				bun.putString("h1",h1);
				bun.putString("h2",h2);
				bun.putString("h3",h3);
				bun.putString("h4",h4);
				bun.putDouble("m1", m1);
				bun.putDouble("m2", m2);
				bun.putDouble("m3", m3);
				bun.putDouble("sum", sum);
				bun.putDouble("avg", avg);
				
				Intent i=new Intent(getApplicationContext(),MainActivitysecond1.class);
				i.putExtras(bun);
				startActivity(i);
			}
			
		});
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity18, menu);
        return true;
    }
    
}
