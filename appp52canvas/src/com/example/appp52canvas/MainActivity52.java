package com.example.appp52canvas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.Menu;
import android.view.View;

public class MainActivity52 extends Activity {
  demoView demoview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity52);
        demoview=new demoView(this);
        setContentView(demoview);
        
    }
        private class demoView extends View{
        	public demoView(Context context) {
				super(context);
				// TODO Auto-generated constructor stub
			}

        
        public void onDraw(Canvas canvas){
        	super.onDraw(canvas);
        	Paint paint=new Paint();
        	paint.setStyle(Paint.Style.FILL);
        	paint.setColor(Color.YELLOW);
        	canvas.drawPaint(paint);
        	
        	
        	paint.setAntiAlias(false);
        	paint.setColor(Color.BLUE);
        	canvas.drawCircle(20,20,15,paint);
        	
        	paint.setAntiAlias(true);
        	paint.setColor(Color.GREEN);
        	canvas.drawCircle(60,20,15,paint);
        	
        	paint.setAntiAlias(false);
        	paint.setColor(Color.RED);
        	canvas.drawRect(100,5,200,30,paint);
        	
        	canvas.rotate(-45);
        	paint.setStyle(Paint.Style.FILL);
        	canvas.drawText("Graphics Rotation", 80,280,paint);
        	
        	canvas.restore();
        
}
        } 


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity52, menu);
        return true;
    }
    
}

