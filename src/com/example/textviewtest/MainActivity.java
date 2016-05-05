package com.example.textviewtest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.View;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnFocusChangeListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private TextView textView01;
	private TextView textView02;
	private Button alertButton;
	private int i;
	final int newColor[]=new int []{Color.WHITE,Color.BLUE,Color.CYAN,Color.GREEN,Color.RED};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		//final int newColor[]={Color.WHITE,Color.BLUE,Color.CYAN,Color.GREEN,Color.RED};
		
		
		textView01=(TextView)findViewById(R.id.textview01);
		textView02=(TextView)findViewById(R.id.textview02);
		
		alertButton=(Button)findViewById(R.id.alert_button);
		alertButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				i++;
				if(i==5)i=0;
					textView01.setTextColor(newColor[i]);
				}
			
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
