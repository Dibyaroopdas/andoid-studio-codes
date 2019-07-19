/*this is activity that is linked by the main acitivity_new*/

/*     BASIC CALCULATOR -showing string to int convert - how to take input..
 * Doing simple additon using string input  then to convert to int and display the result as toast as well as text
 * As well as see .xml file to set image background,font style etc.*/
package com.example.appp10;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import java.math.*;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivitycalc extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitycalc);
        
       final EditText ed1=(EditText)findViewById(R.id.editText1);
       final EditText ed2=(EditText)findViewById(R.id.editText2);
        Button btn1=(Button)findViewById(R.id.button1);
        Button btn2=(Button)findViewById(R.id.button2);
        Button btn3=(Button)findViewById(R.id.button3);
        Button btn4=(Button)findViewById(R.id.button4);
        Button btn5=(Button)findViewById(R.id.button5);
        Button btn6=(Button)findViewById(R.id.button6);
        Button btn7=(Button)findViewById(R.id.button7);
        Button btn8=(Button)findViewById(R.id.button8);
        final TextView tv=(TextView)findViewById(R.id.textView3);
        
        
       
        
        btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 String v1=ed1.getText().toString();   //taking input as string 
			        String v2=ed2.getText().toString();
			         int a=Integer.parseInt(v1);          //Converting the string to integer
			        int b=Integer.parseInt(v2);
			         int sum=a+b;
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_SHORT).show();  //Toast display
				tv.setText("Addition="+sum);
				
				
				
			}
		});
btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 String v1=ed1.getText().toString();   //taking input as string 
			        String v2=ed2.getText().toString();
			         int a=Integer.parseInt(v1);          //Converting the string to integer
			        int b=Integer.parseInt(v2);
			         int sum=a-b;
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_SHORT).show();  //Toast display
				tv.setText("Subtraction="+sum);
				
				
			}
		});

btn3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 String v1=ed1.getText().toString();   //taking input as string 
	        String v2=ed2.getText().toString();
	         int a=Integer.parseInt(v1);          //Converting the string to integer
	        int b=Integer.parseInt(v2);
	         int sum=a*b;
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_SHORT).show();  //Toast display
		tv.setText("Multiplication="+sum);
		
		
	}
});
btn4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 String v1=ed1.getText().toString();   //taking input as string 
	        String v2=ed2.getText().toString();
	         int a=Integer.parseInt(v1);          //Converting the string to integer
	        int b=Integer.parseInt(v2);
	         int sum=a/b;
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_SHORT).show();  //Toast display
		tv.setText("Division="+sum);
		
		
	}
});
btn5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 String v1=ed1.getText().toString();   //taking input as string 
	       
	         float a=Float.parseFloat(v1);          //Converting the string to integer
	       
	         float sum=(float) Math.sin(Math.toRadians(a));
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_SHORT).show();  //Toast display
		tv.setText("Sin(value 1)="+sum);
		
		
	}
});
btn6.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 String v1=ed1.getText().toString();   //taking input as string 
	       
	         float a=Float.parseFloat(v1);          //Converting the string to integer
	       
	         float sum=(float) Math.cos(Math.toRadians(a));
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_SHORT).show();  //Toast display
		tv.setText("Cosine(value 1)="+sum);
		
		
	}
});
btn7.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 String v1=ed1.getText().toString();   //taking input as string 
	       
	         float a=Float.parseFloat(v1);          //Converting the string to integer
	        
	         float sum=(float) Math.tan(Math.toRadians(a));
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_SHORT).show();  //Toast display
		tv.setText("Tangent(value 1)="+sum);
		
		
	}
});
btn8.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 
		// TODO Auto-generated method stub
		Intent i = new Intent(MainActivitycalc.this,MainActivitynew.class);
		startActivity(i);
		
	}
});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activitycalc, menu);
        return true;
    }
    
}
