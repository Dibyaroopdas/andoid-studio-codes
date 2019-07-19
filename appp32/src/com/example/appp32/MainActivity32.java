package com.example.appp32;

import android.os.Bundle;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.telephony.gsm.SmsManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity32 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity32);
        final EditText ed1=(EditText)findViewById(R.id.editText1);
        final EditText ed2=(EditText)findViewById(R.id.editText2);
        Button btn1=(Button)findViewById(R.id.button1);
        
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String no=ed1.getText().toString();
				String msg=ed2.getText().toString();
				
				Intent i=new Intent(getApplicationContext(),MainActivity32.class);
				PendingIntent pi=PendingIntent.getActivity(getApplicationContext(), 0, i, 0);
				
				SmsManager sms=SmsManager.getDefault();
				sms.sendTextMessage(no, null, msg, pi, null);
				
				Toast.makeText(getApplicationContext(), "Message sent succesfully!", Toast.LENGTH_LONG).show();
				
						
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity32, menu);
        return true;
    }
    
}
