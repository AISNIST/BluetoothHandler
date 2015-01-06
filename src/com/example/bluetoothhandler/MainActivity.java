package com.example.bluetoothhandler;

import com.example.bluetoothhandler.BluetoothHandler.Robot;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	protected static Robot robot;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		//startActivity(new Intent(getApplicationContext(), ChooseDeviceToConnectTo.class));
		startActivityForResult(new Intent(getBaseContext(),ChooseDeviceToConnectTo.class),1);

		((Button)findViewById(R.id.button1)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
 
				robot.moveFrontServo(600);
			}
		} );
		
	}
 
}
