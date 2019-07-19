package com.example.appp33;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity33 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity33);
        
        final EditText ed1=(EditText)findViewById(R.id.editText1);
        final EditText ed2=(EditText)findViewById(R.id.editText2);
        final EditText ed3=(EditText)findViewById(R.id.editText3);
Button btn1=(Button)findViewById(R.id.button1);

btn1.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String to=ed1.getText().toString();
		String sub=ed2.getText().toString();
		String msg=ed3.getText().toString();
		
		Intent email=new Intent(Intent.ACTION_SEND);
		email.putExtra(Intent.EXTRA_EMAIL, new String[] {to});
		email.putExtra(Intent.EXTRA_SUBJECT,sub);
		email.putExtra(Intent.EXTRA_TEXT,msg);
		
		email.setType("msg/rfc822");
		startActivity(Intent.createChooser(email, "choose an email client"));
		
		
	}
});
    
    
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity33, menu);
        return true;
    }
    
}
