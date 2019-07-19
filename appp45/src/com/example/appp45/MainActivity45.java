package com.example.appp45;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity45 extends Activity {
	EditText ed1,ed2,ed3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity45);
        
        
        Button btn2=(Button)findViewById(R.id.button2);
        
        btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				ed1=(EditText)findViewById(R.id.editText1);
				ed2=(EditText)findViewById(R.id.editText2);
				ed3=(EditText)findViewById(R.id.editText3);
				ed1.setText("");
				ed2.setText("");
				ed3.setText("");
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity45, menu);
        return true;
    }
    
}
