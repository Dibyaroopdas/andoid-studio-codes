package com.example.appp_twitter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends Activity {
	EditText ed1,ed2,ed3;
	Button btn1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		TextView tv=(TextView)findViewById(R.id.textView4);
		 tv.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Toast.makeText(getApplicationContext(), "To login", Toast.LENGTH_LONG).show();
					Intent i = new Intent(getApplicationContext(),LoginOnTwitter.class);
					startActivity(i);
				}
			});
		 
		 
		 ed1=(EditText)findViewById(R.id.editText1);
		 ed2=(EditText)findViewById(R.id.editText2);
		 ed3=(EditText)findViewById(R.id.editText3);
		 btn1=(Button)findViewById(R.id.button1);
		 
		 final DBAdapter db=new DBAdapter(this);
		 
		 btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				db.open();
				long id=db.insert(ed1.getText().toString(),ed2.getText().toString(),ed3.getText().toString());
				Toast.makeText(getApplicationContext(), id+" Registered !Please login to Continue", Toast.LENGTH_LONG).show();
				db.close();
				ed1.setText("");ed2.setText("");ed3.setText("");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
		return true;
	}

}
