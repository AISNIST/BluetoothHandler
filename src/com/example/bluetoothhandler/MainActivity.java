package com.example.bluetoothhandler;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.bluetoothhandler.BluetoothHandler.Robot;

public class MainActivity extends Activity {

	protected static Robot robot;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		//startActivity(new Intent(getApplicationContext(), ChooseDeviceToConnectTo.class));
		startActivityForResult(new Intent(getBaseContext(),ChooseDeviceToConnectTo.class),1);
		addReconnectButton();

 
 		 
		((Button)findViewById(R.id.c1)).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
			 startActivity(new Intent(getApplicationContext(),Challenge1.class));
			}
		});
		
		((Button)findViewById(R.id.c2)).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				 startActivity(new Intent(getApplicationContext(),Challenge2.class));
			}
		});
		
		((Button)findViewById(R.id.c3)).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				 startActivity(new Intent(getApplicationContext(),Challenge3.class));
			}
		});
		
		((Button)findViewById(R.id.c4)).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				 startActivity(new Intent(getApplicationContext(),Challenge4.class));
			}
		});

	}

	private void addReconnectButton() {
		((Button)findViewById(R.id.reconnect)).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				BluetoothHandler handler = robot.getBTHandler("guy");
				handler.dispose();
				robot = null;
				startActivity(new Intent(getApplicationContext(), ChooseDeviceToConnectTo.class));
			}
		});
 


	}

	 
}
