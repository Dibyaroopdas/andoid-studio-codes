package com.example.appp28;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.SeekBar.OnSeekBarChangeListener;

public abstract class MainActivity28 extends Activity implements OnSeekBarChangeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity28);
        
        SeekBar sb=(SeekBar)findViewById(R.id.seekBar1);
        sb.setOnSeekBarChangeListener((OnSeekBarChangeListener)this);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity28, menu);
        return true;
    }
    public void onProgressChanged(SeekBar sb,int progress,boolean fromUser){
    	Toast.makeText(getApplicationContext(), progress, Toast.LENGTH_LONG).show();
    }
    


}
