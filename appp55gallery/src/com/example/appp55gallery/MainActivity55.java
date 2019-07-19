package com.example.appp55gallery;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class MainActivity55 extends Activity {

	
	Integer[] imageIds={	R.drawable.landscape,
			R.drawable.landscape1,
			
			R.drawable.landscape3,
			R.drawable.landscape4,
			R.drawable.landscape5,
			R.drawable.landscape6,
			R.drawable.landscape7,
			
	};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity55);
        Gallery gallery=(Gallery)findViewById(R.id.gallery1);
        
        gallery.setAdapter(new ImageAdapter(this));
        Toast.makeText(getBaseContext(), "Landscape  selected", Toast.LENGTH_LONG).show();
        gallery.setOnItemClickListener(new OnItemClickListener() {
        	public void onItemClick(AdapterView parent,View v,int position,long id){
        		Toast.makeText(getBaseContext(), "Landscape "+(position+1)+" selected", Toast.LENGTH_LONG).show();
        		 //---display the images selected--                
        		/*ImageView imageView =(ImageView) findViewById(R.id.imageView1);
        		imageView.setImageResource(imageIds[position])
        	}
        	*/
        	
        	}
        	});
        

        
    }

    public class ImageAdapter extends BaseAdapter
    {
    	Context context;
    	int itemBackground;
    	public ImageAdapter(Context c){
    		context =c;
    		//Setting the style
    		TypedArray a=obtainStyledAttributes(R.styleable.Gallery1);
    		 itemBackground = a.getResourceId(R.styleable.Gallery1_android_galleryItemBackground,0);            
    		 a.recycle();        }
    	 
    	
    //RETURNS NO OF IMAGES
    public int getCount()
    {
    	return imageIds.length;
    }
    
    public Object getItem(int position) 
    {
    	return position;
    }
    public long getItemId(int position){
    	return position;
    }
    

	public View getView(int position, View convertView,ViewGroup parent)
    {
    	ImageView imageView;
    	if(convertView == null){
    		 imageView = new ImageView(context);
    		 imageView.setImageResource(imageIds[position]);
    		 imageView.setScaleType(ImageView.ScaleType.FIT_XY);
    		 imageView.setLayoutParams(new Gallery.LayoutParams(150, 120));
    		 } else {
    			 imageView = (ImageView) convertView;
    		 imageView.setBackgroundResource(itemBackground);
    		 }
    		 return imageView; 
    		
    	}
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity55, menu);
        return true;
    }
    
}
