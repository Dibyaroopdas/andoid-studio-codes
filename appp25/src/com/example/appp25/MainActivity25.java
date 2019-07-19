package com.example.appp25;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity25 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity25);
        
        
    }
    public void add(View v){
    TextView tv=(TextView)findViewById(R.id.textView3);
        EditText ed=(EditText)findViewById(R.id.editText1);
        
        
        float t=Float.parseFloat(String.valueOf(ed.getText()));
        
        RadioButton rb1=(RadioButton)findViewById(R.id.radio0);
        RadioButton rb2=(RadioButton)findViewById(R.id.radio1);
        
        if(rb1.isChecked())
        {
        	float f=(((9*t)/5)+32);
        	tv.setText(f+" degree F");
        }
        if(rb2.isChecked())
        {
        	float c=(5*(t-32)/9);
        	tv.setText(c+" degree C");
        }
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity25, menu);
        return true;
    }
    
}
