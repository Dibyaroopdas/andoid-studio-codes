package com.example.app5;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity5 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity5);
        TextView tv=(TextView)findViewById(R.id.textView1);
        tv.setTextColor(Color.RED);
        for(int i=1;i<=50;i++)
        {
        	tv.append(i+"\n");
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity5, menu);
        return true;
    }
    
}
