/*THIS IS AUTO COMPLETE TEXT VIEW SAMPLE PROGRAM.*/


package com.example.app8;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity8 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity8);
        String arr[]={"hema malini","Ranbir kapoor","Arjun kapoor","Shahrukh khan","Salman khan","Arbaaz khan"};
        
        AutoCompleteTextView atv=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,arr);
        atv.setAdapter(adapter);
        atv.setThreshold(2);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity8, menu);
        return true;
    }
    
}
