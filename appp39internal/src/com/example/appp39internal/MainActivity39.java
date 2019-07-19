package com.example.appp39internal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity39 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity39);
        
        Button btn1=(Button)findViewById(R.id.button1);
        Button btn2=(Button)findViewById(R.id.button2);
        final EditText ed1=(EditText)findViewById(R.id.editText1);
        final EditText ed2=(EditText)findViewById(R.id.editText2);
        
        
        btn1.setOnClickListener(new View.OnClickListener() {   //Save button used to write to the file.
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String filename=ed1.getText().toString();
				String data=ed2.getText().toString();
				FileOutputStream fos;
				try{
					fos=openFileOutput(filename, Context.MODE_PRIVATE);
					//default mode is private can append etc;
					fos.write(data.getBytes());
					fos.close();
					
					Toast.makeText(getApplicationContext(), filename+" saved!", Toast.LENGTH_LONG).show();
					
				}catch (FileNotFoundException e) {e.printStackTrace();}
				catch (IOException e){e.printStackTrace();}
				
				filename="";
				ed1.
			}
		});
        
        
btn2.setOnClickListener(new View.OnClickListener() {   //Save button used to write to the file.
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String filename=ed1.getText().toString();
				StringBuffer stringBuffer=new StringBuffer();
				
				try{
					//attaching bufferedreader to thefileinput stream by the help of input Stream reader.
					BufferedReader inputReader=new BufferedReader(new InputStreamReader(openFileInput(filename)));
					
					String inputString;
					//reading data line by line and storing it into the String buffer.
					
					while((inputString=inputReader.readLine()) != null)  {
						stringBuffer.append(inputString+"\n");
					}
					
					
				}
				catch (IOException e){e.printStackTrace();}
				
				//Dispalying data as the toast
				Toast.makeText(getApplicationContext(), stringBuffer.toString(), Toast.LENGTH_LONG).show();
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity39, menu);
        return true;
    }
    
}
