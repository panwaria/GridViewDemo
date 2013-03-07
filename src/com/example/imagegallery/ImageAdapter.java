package com.example.imagegallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

	private Context mContext;
	public ImageAdapter(Context c) // Constructor
	{
	mContext = c; }

	public Integer[] mThumbs =
		{
		R.drawable.pic0_thumb, R.drawable.pic1_thumb, R.drawable.pic2_thumb, R.drawable.pic3_thumb,
		R.drawable.pic4_thumb, R.drawable.pic5_thumb, R.drawable.pic6_thumb, R.drawable.pic7_thumb,
		R.drawable.pic8_thumb, R.drawable.pic9_thumb, R.drawable.pic10_thumb, R.drawable.pic11_thumb,
		R.drawable.pic12_thumb, R.drawable.pic13_thumb, R.drawable.pic14_thumb, R.drawable.pic15_thumb,
		R.drawable.pic16_thumb, R.drawable.pic17_thumb, R.drawable.pic18_thumb, R.drawable.pic19_thumb,
		R.drawable.pic20_thumb, R.drawable.pic21_thumb, R.drawable.pic22_thumb, R.drawable.pic23_thumb,
		R.drawable.pic24_thumb, R.drawable.pic25_thumb, R.drawable.pic26_thumb, R.drawable.pic27_thumb,
		R.drawable.pic28_thumb, R.drawable.pic29_thumb, R.drawable.pic30_thumb, R.drawable.pic31_thumb,
		R.drawable.pic32_thumb, R.drawable.pic33_thumb, R.drawable.pic34_thumb, R.drawable.pic35_thumb,
		R.drawable.pic36_thumb, R.drawable.pic37_thumb, R.drawable.pic38_thumb, R.drawable.pic39_thumb
		};

	@Override
	public int getCount()
	{
	return mThumbs.length;
	}
	@Override
	public Object getItem(int position)
	{
	return mThumbs[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
	ImageView imageView;
	if(convertView == null)
	// Recycled View
	{
	imageView = new ImageView(mContext);
	imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
	imageView.setLayoutParams(new GridView.LayoutParams(220, 220));
	}
	else // Re-use the view
	{
	imageView = (ImageView) convertView;
	}
	imageView.setImageResource(mThumbs[position]);
	return imageView;
	}


}
