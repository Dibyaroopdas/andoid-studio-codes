package com.example.appp43extstorage;
//Store a file in external storage space and then to read it using Buffered reader.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity43 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity43);
        
        Button btn1=(Button)findViewById(R.id.button1);
        Button btn2=(Button)findViewById(R.id.button2);
        final EditText ed1=(EditText)findViewById(R.id.editText1);
       final EditText ed2=(EditText)findViewById(R.id.editText2);
        
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String filename=ed1.getText().toString();
				String data=ed2.getText().toString();
				
				FileOutputStream fos;
				
				try{
					File myFile=new File("/sdcard/"+filename);
					myFile.createNewFile();
					FileOutputStream fOut=new FileOutputStream(myFile);
					OutputStreamWriter myOutWriter= new OutputStreamWriter(fOut);
					
					myOutWriter.append(data);
					myOutWriter.close();
					fOut.close();
					
					Toast.makeText(getApplicationContext(), filename+" saved", Toast.LENGTH_LONG).show();
					
				}catch(FileNotFoundException e){e.printStackTrace();}
				catch(IOException e){e.printStackTrace();}
				
			}
		});
        
        btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String filename=ed1.getText().toString();
				StringBuffer stringbuffer = new StringBuffer();
				String aDataRow="";
				String aBuffer="";
				
				try{
					
					File myFile=new File("/sdcard/"+filename);
					FileInputStream fIn = new FileInputStream(myFile);
					BufferedReader myReader=new BufferedReader(new InputStreamReader(fIn));
					
					
					while((aDataRow=myReader.readLine())!=null){
						aBuffer+=aDataRow+"\n";
					
					}
					
					myReader.close();
					
					
				}catch(IOException e){e.printStackTrace();}
				
				Toast.makeText(getApplicationContext(), aBuffer, Toast.LENGTH_LONG).show();
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity43, menu);
        return true;
    }
    
}
