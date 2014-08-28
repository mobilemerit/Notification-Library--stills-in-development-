package org.aynsoft.ntfn;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.btnShowNt).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				NotificationBuilder builder=new NotificationBuilder(MainActivity.this);
				/**Setting the notification content*/
				NotificationDataSet dataSet=new NotificationDataSet();
				dataSet.setContentTitle("Demo Notification");
				dataSet.setContentText("This is juct the demo notification to test" +
						"the viability");
				dataSet.setSmallIcon(R.drawable.ic_launcher);
				dataSet.setLargeIcon(BitmapFactory.decodeResource(getResources(), 
						R.drawable.ic_large_notification));
				/**Set up notification setting*/
				builder.setDataSet(dataSet);
				builder.setResultActivity(MainActivity.class);
				builder.setResultBundle(new Bundle());
				
				try {
					builder.showNotification();
				}catch (Exception e) {
					e.printStackTrace();
				}				
			}
		});
	}
}
