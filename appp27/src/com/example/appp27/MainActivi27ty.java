/*Using bluetooth on the app ,to make bluetooth on ,discoverable and then to turn off.*/

package com.example.appp27;
import android.os.Bundle;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivi27ty extends Activity {

private static final int REQUEST_ENABLE_BT = 0;
private static final int REQUEST_DISCOVERABLE_BT = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activi27ty);
        TextView out=(TextView)findViewById(R.id.textView1);
        Button btn1=(Button)findViewById(R.id.button1);
        Button btn2=(Button)findViewById(R.id.button2);
        Button btn3=(Button)findViewById(R.id.button3);
        
        final BluetoothAdapter mBluetoothAdapter=BluetoothAdapter.getDefaultAdapter();//Bluetooth adapter class is used
        
        if(mBluetoothAdapter==null)
        {
        	out.append("device not supported");
        }
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(!mBluetoothAdapter.isEnabled())    //If bluetooth is off then enable it using intent.
				{
					Intent enableBtIntent=new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
					startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
				}
			}
		});
btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(!mBluetoothAdapter.isDiscovering())     //these are inbuilt functions.
				{
					Intent enableBtIntent=new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
					startActivityForResult(enableBtIntent, REQUEST_DISCOVERABLE_BT);
					Toast.makeText(getApplicationContext(), "making your device discoverable",Toast.LENGTH_LONG).show();
				}
			}
		});
btn3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mBluetoothAdapter.disable();
		Toast.makeText(getApplicationContext(), "Turning off bluetooth",Toast.LENGTH_LONG).show();
	}
});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activi27ty, menu);
        return true;
    }
    
}
