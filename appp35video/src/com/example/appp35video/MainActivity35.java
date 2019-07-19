package com.example.appp35video;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity35 extends Activity {
	VideoView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity35);
        v=(VideoView)findViewById(R.id.videoView1);
       v.setVideoPath("/storage/emulated/0/bluetooth/meaw.mp4");
       Button b=(Button)findViewById(R.id.button1);
       b.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Toast.makeText(getBaseContext(), "Play",Toast.LENGTH_LONG).show();
			((VideoView) v).start();
			
		}
	});
    }
   

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity35, menu);
        return true;
    }
    
}
