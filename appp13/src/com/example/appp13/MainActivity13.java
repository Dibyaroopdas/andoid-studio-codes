/*Time picker and show the time picked as toast*/

package com.example.appp13;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.format.Time;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

@SuppressLint("ShowToast") public class MainActivity13 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity13);
        final TimePicker timePicker=(TimePicker)findViewById(R.id.timePicker1);
        
        Button btn1=(Button)findViewById(R.id.button1);
        
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				NumberFormat formatter=new DecimalFormat("00");  //formatter is an object
				Toast.makeText(getBaseContext(),"Time selected is="+timePicker.getCurrentHour()+":"+formatter.format(timePicker.getCurrentMinute()), Toast.LENGTH_LONG).show();
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity13, menu);
        return true;
    }
    
}
