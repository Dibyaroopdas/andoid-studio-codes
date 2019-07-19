package com.example.appp36frame;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public class MainActivity36 extends Activity {
int count = 1,count1=3;
FrameLayout frame;
ImageView imageview;
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main_activity36);
frame = (FrameLayout) findViewById(R.id.frameLayout1);
}
public void btnClick(View view) {
//---hide the current one---
imageview = (ImageView) frame.findViewWithTag(String.valueOf(count));
imageview.setVisibility(android.view.View.INVISIBLE);
//---go to the next image---
count++;
if (count>3) count = 1;
//---show the next image---
imageview = (ImageView) frame.findViewWithTag(String.valueOf(count));
imageview.setVisibility(android.view.View.VISIBLE);
}
public void btnClick1(View view) {
	//---hide the current one---
	imageview = (ImageView) frame.findViewWithTag(String.valueOf(count1));
	imageview.setVisibility(android.view.View.INVISIBLE);
	//---go to the next image---
	count1--;
	if (count1<1) count1 = 3;
	//---show the next image---
	imageview = (ImageView) frame.findViewWithTag(String.valueOf(count1));
	imageview.setVisibility(android.view.View.VISIBLE);
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity36, menu);
        return true;
    }
    
}
