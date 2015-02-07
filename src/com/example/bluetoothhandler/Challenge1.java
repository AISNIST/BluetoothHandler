package com.example.bluetoothhandler;

import android.app.Activity;
import android.os.Bundle;

import com.example.bluetoothhandler.BluetoothHandler.Robot;

public class Challenge1 extends Activity {

	private Robot robot;
	public static final int SENSOR_DATA_ERROR = -1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_challenge1);
		robot = MainActivity.robot;

		/**WRITE CODE HERE***/

		 


	}


	@Override
	public void onBackPressed() {
		super.onBackPressed();
		robot.stop();
		finish();
	}
	
	private void pause(long duration){
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
