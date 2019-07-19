/*To create a rating bar for item books etc.*/

package com.example.appp16;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity16 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity16);
        rating();
    }
    
    private void rating(){
    	
    	final RatingBar rb=(RatingBar)findViewById(R.id.ratingBar1);
    	Button btn1=(Button)findViewById(R.id.button1);
    	

    		btn1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					String rate=String.valueOf(rb.getRating());
					Toast.makeText(getApplicationContext(),rate, Toast.LENGTH_LONG).show();
					
				}
			});
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity16, menu);
        return true;
    }
    
}
