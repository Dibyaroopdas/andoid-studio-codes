/*this is intent prog,in which we link one part of activity to other activity(cont)...
 * that can be inbuilt activity or to our own activity in the same app.Like opening google.com in  the browser or calling a no.*/

/*-->In This program we have linked to an inbuilt activity like opening a webpage and calling a specified no.*/


package com.example.app9;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity9 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity9);
        Button b1=(Button)findViewById(R.id.button1);
        Button b2=(Button)findViewById(R.id.button2);
        Button b3=(Button)findViewById(R.id.button3);
        
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com"));
				startActivity(i);
				
			}
		});
 b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.flipkart.com"));
				startActivity(i);
				
			}
		});
 b3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:+919334409219"));
			startActivity(i);
			
		}
	});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity9, menu);
        return true;
    }
    
}
