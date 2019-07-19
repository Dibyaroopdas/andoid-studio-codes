package com.example.appp42emailoneclick;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity42 extends Activity {
    String to[]={"manishbit97@gmail.com","care@gmail.com"};
    String cc[]={"care@hotmail.com"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity42);
        Button btn1=(Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sendmail(to,cc,"Reminder:Aptech","This is to remind you that u have not paid the comlplete fees of the android course .please do it as soon as possible to get the course materials,");
			}
		});
        
    }


    private void sendmail(String[] eAddresses, String[] carbonCopies, String sub,
			String msg) {
		// TODO Auto-generated method stub
    	Intent email=new Intent(Intent.ACTION_SEND);
    	email.setData(Uri.parse("mailto:"));
    	
    	String to[]=eAddresses;
    	String cc[]=carbonCopies;
	
    	email.putExtra(Intent.EXTRA_EMAIL,to);
    	email.putExtra(Intent.EXTRA_CC,cc);
    	email.putExtra(Intent.EXTRA_SUBJECT,sub);
    	email.putExtra(Intent.EXTRA_TEXT,msg);
    	email.setType("message/rfc822");
    	startActivity(Intent.createChooser(email, "Email"));
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity42, menu);
        return true;
    }
    
}
