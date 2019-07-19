package com.example.appp46sharedpref;

import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class MainActivity46 extends Activity {

	private SharedPreferences prefs;
	private String prefName="MyPref";
	Button b1;
	SeekBar seek;
	EditText ed1;
	String data;
	float fontsize;
	private static final String FONT_SIZE_KEY="fontsize";
	private static final String TEXT_VALUE_KEY="textvalue";
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity46);
        b1=(Button)findViewById(R.id.button1);
        seek=(SeekBar)findViewById(R.id.seekBar1);
        ed1=(EditText)findViewById(R.id.editText1);
        ///////
        prefs=getSharedPreferences(prefName,MODE_PRIVATE);
        data=prefs.getString(TEXT_VALUE_KEY, "Welcome for d First Time");
        fontsize=prefs.getFloat(FONT_SIZE_KEY, 15);
        ed1.setText(data);
        ed1.setTextSize(fontsize);
        seek.setProgress((int)fontsize);
        //////
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences.Editor editor=prefs.edit();
				editor.putString(TEXT_VALUE_KEY,ed1.getText().toString());
				editor.putFloat(FONT_SIZE_KEY,fontsize);
				editor.commit();
				
			}
		});
        
      seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onProgressChanged(SeekBar seekBar, int progress,
				boolean fromUser) {
			// TODO Auto-generated method stub
			fontsize=(float)progress;
			ed1.setTextSize((int)fontsize);
			
		}
	})  ;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity46, menu);
        return true;
    }
    
}
