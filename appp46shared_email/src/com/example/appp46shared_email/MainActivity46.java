package com.example.appp46shared_email;

import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity46 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity46);
        
        Button btn1=(Button)findViewById(R.id.button1);
        final EditText ed1=(EditText)findViewById(R.id.editText1);
        final EditText ed2=(EditText)findViewById(R.id.editText2);
        final CheckBox cb1=(CheckBox)findViewById(R.id.checkBox1);
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(cb1.isChecked()){
					
				
				SharedPreferences settings = getSharedPreferences("userinput", 0);
				SharedPreferences.Editor editor=settings.edit();
				editor.putString("username",ed1.getText().toString());
				editor.putString("userpass", ed2.getText().toString());
			   String ch= settings.getString("username", null);
			   
				editor.commit();
				Toast.makeText(getApplicationContext(),ch, Toast.LENGTH_LONG).show();
				}
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity46, menu);
        return true;
    }
    
}
