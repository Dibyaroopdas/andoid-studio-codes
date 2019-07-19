package com.example.app4;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4);
        TextView tv=(TextView)findViewById(R.id.textView1);
        tv.setText("Radio check Button");
        tv.setTextSize(30);
        
        //Drag and drop the radio group in activity main .xml
   
        RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup1);
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				RadioButton rb1=(RadioButton)findViewById(R.id.radio0);
				if(rb1.isChecked()){
					Toast.makeText(getBaseContext(), "Wait and watch G.O.T", Toast.LENGTH_LONG).show();
				}
				else
				{
					Toast.makeText(getBaseContext(), "Wait and watch FRIENDS", Toast.LENGTH_LONG).show();
				}
				
			}
		});
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity4, menu);
        return true;
    }
    
}
