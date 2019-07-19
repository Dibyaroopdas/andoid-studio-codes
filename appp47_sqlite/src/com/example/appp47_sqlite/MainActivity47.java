package com.example.appp47_sqlite;

import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity47 extends Activity {

	EditText ed1,ed2;
	Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity47);
        ed1=(EditText)findViewById(R.id.editText1);
        ed2=(EditText)findViewById(R.id.editText2);
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        final DBAdapter db=new DBAdapter(this);
        
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				db.open();
				long id=db.insert(ed1.getText().toString(),ed2.getText().toString());
				Toast.makeText(getApplicationContext(), id+" inserted", Toast.LENGTH_LONG).show();
				db.close();
			}
		});
      
 btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				db.open();
				Cursor c=db.retrieveAll();
				if(c.moveToFirst())
				{
					do{
						Toast.makeText(getApplicationContext(), "ID:"+c.getInt(0)+"\nNAME: "
								                                      +c.getString(1)+"\nEmail: "+ c.getString(2), Toast.LENGTH_LONG).show();
					}while(c.moveToNext());
				}
				else{
					db.close();
				}
				
				db.close();
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity47, menu);
        return true;
    }
    
}
