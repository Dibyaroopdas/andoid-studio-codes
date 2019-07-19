package com.example.appp_twitter;


import com.example.appp_twitter.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginOnTwitter extends Activity {
	EditText ed1,ed2;
	Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_on_twitter);
        
        btn1=(Button)findViewById(R.id.button1);
        ed1=(EditText)findViewById(R.id.editText1);
        ed2=(EditText)findViewById(R.id.editText2);
        TextView tv=(TextView)findViewById(R.id.textView2);
        final DBAdapter db=new DBAdapter(this);

        
        tv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
				Intent i = new Intent(getApplicationContext(),Register.class);
				startActivity(i);
			}
		});
        
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String email=ed1.getText().toString();
		        String pass=ed2.getText().toString();
		        db.open();
		        
		        Cursor c= db.retrieveAll();
		        if(c.moveToFirst())
		        {int p=0;
		        	do{
		        		if(c.getString(2).compareTo(email)==0){
		        			p=1;
		        			if(c.getString(3).compareTo(pass)==0){
		        		
						Toast.makeText(getApplicationContext(), "ID:"+c.getInt(0)+"\nEmail: "
								                                      +c.getString(2)+"\nPassword: "+ c.getString(3)+"\n\nWelcome to Twitter", Toast.LENGTH_LONG).show();
		        		}
		        			else
			        		{
			        			Toast.makeText(getApplicationContext(), "Email or password does not exist/Mismatch", Toast.LENGTH_LONG).show();
			        		}
		        		}
		        		
					}while(c.moveToNext());
		        	if(p==0)
		        	{
		        		Toast.makeText(getApplicationContext(), "Email id does not exist", Toast.LENGTH_LONG).show();
		        	}
		        }
			}
		});
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login_on_twitter, menu);
        return true;
    }
    
}
