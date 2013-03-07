package com.example.imagegallery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageActivity extends Activity{
	
	// Actual Full Size Images
	public Integer[] mPics =
	{
	R.drawable.pic0, R.drawable.pic1, R.drawable.pic2, R.drawable.pic3,
	R.drawable.pic4, R.drawable.pic5, R.drawable.pic6, R.drawable.pic7,
	R.drawable.pic8, R.drawable.pic9, R.drawable.pic10, R.drawable.pic11,
	R.drawable.pic12, R.drawable.pic13, R.drawable.pic14, R.drawable.pic15,
	R.drawable.pic16, R.drawable.pic17, R.drawable.pic18, R.drawable.pic19,
	R.drawable.pic20, R.drawable.pic21, R.drawable.pic22, R.drawable.pic23,
	R.drawable.pic24, R.drawable.pic25, R.drawable.pic26, R.drawable.pic27,
	R.drawable.pic28, R.drawable.pic29, R.drawable.pic30, R.drawable.pic31,
	R.drawable.pic32, R.drawable.pic33, R.drawable.pic34, R.drawable.pic35,
	R.drawable.pic36, R.drawable.pic37, R.drawable.pic38, R.drawable.pic39
	};

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.full_image);
	// Get intent data
	Intent i = getIntent();
	// Get Image ID from the passed intent
	int position = i.getExtras().getInt("id");
	ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
	imageView.setImageResource(mPics[position]);
	}


}
