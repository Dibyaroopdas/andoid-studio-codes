package com.example.appp44camera;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity44 extends Activity {
	ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity44);
        
        Button btn1=(Button)findViewById(R.id.button1);
        
        iv=(ImageView)findViewById(R.id.imageView1);
        iv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
				startActivityForResult(intent,262);
				
				
			}
		});
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				boolean b=detectCam();
				if(b){
					Toast.makeText(getApplicationContext(), "Camera available",Toast.LENGTH_LONG).show();
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Camera not available",Toast.LENGTH_LONG).show();
				}
			}
        });
    }
			protected void onActivityResult(int requestCode,int resultCode,Intent data)
			{
				super.onActivityResult(requestCode,resultCode,data);
				Bitmap bp=(Bitmap)data.getExtras().get("data");
				iv.setImageBitmap(bp);
				
			}
			private boolean detectCam() {
				// TODO Auto-generated method stub
				if(getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)){
					return true;
				}
				else
				return false;
			}
		
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity44, menu);
        return true;
    }
    
}
