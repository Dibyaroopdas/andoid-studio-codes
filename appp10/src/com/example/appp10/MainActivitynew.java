/*This is second activity where we have the basic application that is opened thru the intent view like camera
 * calculator,maps etc
 */

package com.example.appp10;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivitynew extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activitynew);
Button btn1=(Button)findViewById(R.id.button1);
Button btn2=(Button)findViewById(R.id.button2);
Button btn3=(Button)findViewById(R.id.button3);      
Button btn4=(Button)findViewById(R.id.button4); 
Button btn5=(Button)findViewById(R.id.button5);
Button btn6=(Button)findViewById(R.id.button6);

        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getBaseContext(), "Going back!",
				        Toast.LENGTH_SHORT).show();
				Intent j=new Intent(MainActivitynew.this,MainActivity10.class);//creating the explicit intent
				startActivity(j); 												//starting the activity
				
				
			}
		});
        
 btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getBaseContext(), "Opening Calculator.!",
				        Toast.LENGTH_SHORT).show();
				Intent k=new Intent(MainActivitynew.this,MainActivitycalc.class);
				startActivity(k);
				
				
			}
		});
 btn3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Toast.makeText(getBaseContext(), "Opening Dialer.!",
			        Toast.LENGTH_SHORT).show();
			Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:+918797361896"));
			startActivity(k);
			
			
		}
	});
 btn4.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Toast.makeText(getBaseContext(), "Opening Camera.!",
			        Toast.LENGTH_SHORT).show();
			Intent k=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);  //statement to only open camera
			startActivity(k);
			
			
		}
	});
 
 btn5.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Toast.makeText(getBaseContext(), "Opening Maps.!",
			        Toast.LENGTH_SHORT).show();
			Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse("geo:22.5189384,86.3970325?z=13"));
			startActivity(k);
			
			
		}
	});
 btn6.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Toast.makeText(getBaseContext(), "Opening Messages.!",
			        Toast.LENGTH_SHORT).show();
			Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse("sms:"));
			startActivity(k);
			
			
		}
	});
    }
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activitynew, menu);
		return true;
	}

}
