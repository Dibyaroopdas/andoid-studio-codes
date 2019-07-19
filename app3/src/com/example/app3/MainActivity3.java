
/*Different ways to use buttons,how to call buttons in xml*/
package com.example.app3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3);
        
        Button btn = (Button)findViewById(R.id.button1);
        
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getBaseContext(), "Button 1 was clicked!",
				        Toast.LENGTH_SHORT).show();
				
			}
		});
    }

       
       public void onClick(View v)       //View is a class and v is a object. it is called in main_Activity.xml
       {
    	   Button btn=(Button) v;
    	   Toast.makeText(this, btn.getText() + " was clicked!",
    			   Toast.LENGTH_SHORT).show();
       }
        
       
       private OnClickListener btnListener = new OnClickListener() {
    	   public void onClick(View view)
    	   {
    	   Toast.makeText(getBaseContext(),
    	   ((Button) view).getText() + " was clicked in way3!!",
    	   Toast.LENGTH_LONG).show();
    	   }
    	 };
       
        


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity3, menu);
        return true;
    }
    
}
