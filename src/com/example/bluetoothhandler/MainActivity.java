package com.example.bluetoothhandler;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class MainActivity extends Activity {

	protected static BluetoothHandler robot;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		startActivity(new Intent(getApplicationContext(), ChooseDeviceToConnectTo.class));

	
	}


}
