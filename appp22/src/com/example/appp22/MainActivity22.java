package com.example.appp22;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity22 extends Activity {
	String[] presidents = {
			"Dwight D. Eisenhower",
			"John F. Kennedy",
			"Lyndon B. Johnson",
			"Richard Nixon",
			"Gerald Ford",
			"Jimmy Carter",
			"Ronald Reagan",
			"George H. W. Bush",
			"Bill Clinton",
			"George W. Bush",
			"Barack Obama"
			};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity22);
      //---List View---
        setListAdapter(new ArrayAdapter<String>(this,
        android.R.layout.simple_list_item_1, presidents));
        }
        private void setListAdapter(ArrayAdapter<String> arrayAdapter) {
		// TODO Auto-generated method stub
		
	}
		public void onListItemClick(ListView parent, View v,
        int position, long id) {
        Toast.makeText(this, "You have selected " + presidents[position],
        Toast.LENGTH_SHORT).show();
        }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity22, menu);
        return true;
    }
    
}
