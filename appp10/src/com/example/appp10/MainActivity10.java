/*This is the first activity to which we have linked the second activity i.e mainactivity new*/

package com.example.appp10;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("NewApi") public class MainActivity10 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity10);
        Button btn1=(Button)findViewById(R.id.button1);
        TextView tv=(TextView)findViewById(R.id.textView1);
        tv.setText("WELCOME TO MY BASIC APP");
        tv.setTextColor(Color.WHITE);
        tv.setTextSize(25);
        tv.setTextIsSelectable(true);
        tv.setTextAlignment(10);
        
        
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getBaseContext(), "Button 1 was clicked!",
				        Toast.LENGTH_SHORT).show();
				Intent i=new Intent(MainActivity10.this,MainActivitynew.class);
				startActivity(i);
	
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity10, menu);
        return true;
    }
    
}
