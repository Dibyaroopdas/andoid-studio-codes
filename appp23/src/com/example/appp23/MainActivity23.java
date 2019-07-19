package com.example.appp23;

import android.os.Bundle;
import android.app.Activity;
import android.view.Display;
import android.view.Menu;
import android.view.Surface;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity23 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity23);
        WindowManager wm=getWindowManager();
        Display d=wm.getDefaultDisplay();
        int rot=d.getRotation();
        if(rot==Surface.ROTATION_0||rot==Surface.ROTATION_270)
        {
        	Toast.makeText(getApplicationContext(), "potrait mode", Toast.LENGTH_LONG).show();
        }
        else
        {
        	Toast.makeText(getApplicationContext(), "Landscape mode", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity23, menu);
        return true;
    }
    
}
