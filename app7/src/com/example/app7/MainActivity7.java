/*S.I calculator using input in double data type directly (way2 of input)*/
package com.example.app7;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity7 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity7);
    }
    
    //function simple that is called in act_main.xml file
        public void simple(View v)      //Creating a function simple that is called in onClick Button in activity_main.xml
        {
        EditText et1=(EditText)findViewById(R.id.editText1);
        EditText et2=(EditText)findViewById(R.id.editText2);
        EditText et3=(EditText)findViewById(R.id.editText3);
      
        Button btn1=(Button)findViewById(R.id.button1);
        
        final TextView tv=(TextView)findViewById(R.id.textView5);
        
        double a;
		double b;
		double c;
		final double si;
		final double amt;
        a=Double.parseDouble(String.valueOf(et1.getText()));  ///taking input directly in double 
        b=Double.parseDouble(String.valueOf(et2.getText()));
        c=Double.parseDouble(String.valueOf(et3.getText()));
        si=(a*b*c)/100;
        amt=a+si;
       
				
		        tv.setTextSize(35);
		        tv.setTextColor(Color.WHITE);
		        tv.setText("Simple interest="+si+"\nAmount is="+amt);
		        
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity7, menu);
        return true;
    }
    
}
