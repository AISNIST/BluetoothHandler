package com.example.bluetoothhandler;

import android.app.Activity;
import android.os.Bundle;

import com.example.bluetoothhandler.BluetoothHandler.Robot;

public class Challenge2 extends Activity {
	private Robot robot;
	public static final int SENSOR_DATA_ERROR = -1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_challenge2);
		robot = MainActivity.robot;
		/**WRITE CODE HERE***/



		new Thread(new Runnable() {

			@Override
			public void run() {
				while(true){
					robot.moveForward();
					int data = robot.getUltrasonicSensorData();

					if(data!=SENSOR_DATA_ERROR&& data<10){
						robot.stop();
						break;
					}
					pause(1000);

				}
System.out.println("done");

			}
		}).start();


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
