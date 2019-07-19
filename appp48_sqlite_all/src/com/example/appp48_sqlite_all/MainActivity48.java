package com.example.appp48_sqlite_all;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity48 extends Activity {

	EditText ed1,ed2,ed3;
	Button b1,b2,b3,b4;;
	TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	/*Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread thread, Throwable e) {
				// TODO Auto-generated method stub
				handleUncaughtException(thread,e);
				
			}
		});*/
    
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity48);
        
        final DBAdapter db=new DBAdapter(this);
        ed1=(EditText)findViewById(R.id.editText1);
        ed2=(EditText)findViewById(R.id.editText2);
        ed3=(EditText)findViewById(R.id.editText3);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        tv=(TextView)findViewById(R.id.textView2);
        
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				db.open();
				long id=db.insert(ed1.getText().toString(),ed2.getText().toString(),ed3.getText().toString());
				Toast.makeText(getApplicationContext(), id+" inserted", Toast.LENGTH_LONG).show();
				db.close();
				
			}
		});
        b3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				db.open();
				
				boolean f=db.deleteContact(Long.parseLong(ed1.getText().toString()));
				Toast.makeText(getApplicationContext(), "Deleted= "+f, Toast.LENGTH_LONG).show();
				db.close();
				
			}
		});
b4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				db.open();
				int rowId=Integer.parseInt(ed1.getText().toString());
				Cursor c=db.getContact(rowId);
				
					tv.setText("\nID: "+c.getString(0)+"\nName: "+c.getString(1)+"\nNumber: "+c.getString(2));
			
				db.close();
			}
		});
        
    }
   /* public void handleUncaughtException(Thread thread,Throwable e){
    	e.printStackTrace();
    	Intent i=new Intent();
    	i.setAction("com.example.appp48_sqlite_all");
    	i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    	startActivity(i);
    	System.exit(1);
    }*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity48, menu);
        return true;
    }
    
}
