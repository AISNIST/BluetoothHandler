package com.example.bluetoothhandler;

import android.app.Activity;
import android.os.Bundle;

import com.example.bluetoothhandler.BluetoothHandler.Robot;

public abstract class Challenge extends Activity {
	
	public Robot robot;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_challenge4);
		robot = MainActivity.robot;
		writeCodeHere();

	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
		robot.stop();
		finish();
	}
	
	public void pause(long duration){
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public abstract void writeCodeHere();
	
}