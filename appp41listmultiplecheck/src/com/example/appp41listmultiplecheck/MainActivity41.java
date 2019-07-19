package com.example.appp41listmultiplecheck;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity41 extends Activity implements OnClickListener{
	 String values[]={"January","June","July","Akshay","Amir","Amitabh","Ayush","Shahrukh",
			  "Deepika","Priyanka","kajol","alia","Katrina","kareena"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity41);
        ListView lstView = getListView();
      //lstView.setChoiceMode(ListView.CHOICE_MODE_NONE);
      //lstView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
      lstView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
      setListAdapter(new ArrayAdapter<String>(this,
      android.R.layout.simple_list_item_checked, values));
    }


    private void setListAdapter(ArrayAdapter<String> arrayAdapter) {
		// TODO Auto-generated method stub
    	
		
	}


	private ListView getListView() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity41, menu);
        return true;
    }


	@Override
	public void onItemClick(AdapterView<?> av, View v, int pos, long id) {
		// TODO Auto-generated method stub
		String name=(String)av.getItemAtPosition(pos);
		Toast.makeText(getApplicationContext(), "Happy holiday :"+name, Toast.LENGTH_LONG).show();
		
	}
    
}
