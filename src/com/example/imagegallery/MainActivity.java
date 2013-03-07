package com.example.imagegallery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Get GridView from xml
		GridView gridView = (GridView) findViewById(R.id.grid_view);
		// Set Adapter for GridView
		gridView.setAdapter(new ImageAdapter(this));
		
		/**
		* On Click event for Single GridView Item
		* */
		gridView.setOnItemClickListener(new OnItemClickListener()
		{
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position, long id)
		{
		// Create new intent
		Intent i = new Intent(MainActivity.this, ImageActivity.class);
		// Send Image ID to ImageActivity
		i.putExtra("id", position);
		startActivity(i);
		}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
