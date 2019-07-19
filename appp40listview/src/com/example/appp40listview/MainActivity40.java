package com.example.appp40listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

public class MainActivity40 extends Activity implements OnItemClickListener {
  
	  String values[]={"January","June","July","Akshay","Amir","Amitabh","Ayush","Shahrukh",
			  "Deepika","Priyanka","kajol","alia","Katrina","kareena"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity40);
        
        ListView lv=(ListView)findViewById(R.id.listView1);
        //Adapter will use to adapt string and pass to list
        ArrayAdapter<?> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,values);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
        lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        lv.setTextFilterEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity40, menu);
        return true;
    }
	@Override
	public void onItemClick(AdapterView<?> av, View v, int pos, long id) {
		// TODO Auto-generated method stub
		String name=(String)av.getItemAtPosition(pos);
		Toast.makeText(getApplicationContext(), "Happy holiday :"+name, Toast.LENGTH_LONG).show();
		
	}
    
}
