package com.example.textviewtest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnFocusChangeListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private TextView textView01;
	private TextView textView02;
	private Button alertButton;
	private int i;
	private TextView methodTextView;
	private TextView resultTextView;
	private EditText value1EditText;
	private EditText value2EditText;
	private EditText value4EditText=null;
	private Button addButton;
	private Button minusButton;
	private Button multiplyButton;
	private Button divisionButton;
	private Button enterButton;
	private Double value1;
	private Double value2;
	private Double value3;
	private String str1;
	private String str2;
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
		
		methodTextView=(TextView)findViewById(R.id.methodTextView);
		resultTextView=(TextView)findViewById(R.id.result);
		value1EditText=(EditText)findViewById(R.id.value1EditText);
		value2EditText=(EditText)findViewById(R.id.value2EditText);
		addButton=(Button)findViewById(R.id.add);
		minusButton=(Button)findViewById(R.id.minus);
		multiplyButton=(Button)findViewById(R.id.multiply);
		divisionButton=(Button)findViewById(R.id.division);
		enterButton=(Button)findViewById(R.id.enter);
		
		addButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				methodTextView.setText("+");
				
			}
		});
		
		minusButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				methodTextView.setText("-");
				
			}
		});
		
		multiplyButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				methodTextView.setText("*");
			}
		});

		divisionButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				methodTextView.setText("/");
				
			}
		});
		
		enterButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				if("".equals(value1EditText.getText().toString().trim())){
					value1=0.0;
				}else{
					value1=Double.valueOf(value1EditText.getText().toString());
				}
				if("".equals(value2EditText.getText().toString().trim())){
					value2=0.0;
				}else{
					value2=Double.valueOf(value2EditText.getText().toString());
				}
		
				
				Log.v("MainActivity", value1.toString());
				Log.v("MainActivity", value2.toString());
				String str=methodTextView.getText().toString();
				if("+".equals(str)){
					value3=value1+value2;
					resultTextView.setText(value3.toString());
				}else if("-".equals(str)){
					value3=value1-value2;
					resultTextView.setText(value3.toString());
				}else if("*".equals(str)){
					value3=value1*value2;
					resultTextView.setText(value3.toString());
				}else if("/".equals(str)){
					value3=value1/value2;
					resultTextView.setText(value3.toString());
				}
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
