package com.example.appp14;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity14 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity14);
        
        final EditText enm = (EditText)findViewById(R.id.editText1);
        final EditText eadd=(EditText)findViewById(R.id.editText2);
        
        Button btn1=(Button)findViewById(R.id.button1);
        
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String nm=enm.getText().toString();
				String add=eadd.getText().toString();
				
				Bundle bun=new Bundle();
				bun.putString("name",nm);
				bun.putString("add",add);
				Intent i=new Intent(getApplicationContext(),MainActivitysecond.class);
				i.putExtras(bun);
				startActivity(i);
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity14, menu);
        return true;
    }
    
}
