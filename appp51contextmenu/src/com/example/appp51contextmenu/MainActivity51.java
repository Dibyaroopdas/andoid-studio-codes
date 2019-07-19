package com.example.appp51contextmenu;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity51 extends Activity {

	ListView lv;
	String contacts[]={"abc","efg","hij","klm","nop"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity51);
        
        lv=(ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,contacts);
        lv.setAdapter(adapter);
        //REgister list view for Context menu
        registerForContextMenu(lv);
        
        
    }


    public void onCreateContextMenu(ContextMenu menu,View v,ContextMenuInfo menuInfo){
    	super.onCreateContextMenu(menu, v, menuInfo);
    	menu.add(0,v.getId(), 0,"call");
    	menu.add(0,v.getId(), 0,"SMS");
    	
    }
    
    public boolean onContextItemSelected(MenuItem item){
    	if(item.getTitle()=="call"){
    		Toast.makeText(getApplicationContext(), "Calling code", Toast.LENGTH_LONG).show();
    	}
    	else if(item.getTitle()=="SMS")
    	{
    		
        		Toast.makeText(getApplicationContext(), "SMS code", Toast.LENGTH_LONG).show();
        	
    	}
    	else{
    		return false;
    	    }
    	return true;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity51, menu);
        return true;
    }
    
}
