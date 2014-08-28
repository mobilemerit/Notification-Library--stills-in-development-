package org.aynsoft.ntfn;

import java.util.Random;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationCompat.InboxStyle;

public class NotificationBuilder {

	NotificationDataSet dataSet;
	Context context;
	Class resultActivity;
	Random random;
	Bundle resultBundle;
		
	public NotificationBuilder(Context c) {
		this.context=c;
		random=new Random();
	}
	
	public void setDataSet(NotificationDataSet data) {
		this.dataSet=data;
	}
	
	public void setResultActivity(Class act){
		resultActivity=act;
	}
	
	public void setResultBundle(Bundle bundle){
		resultBundle=bundle;
	}
	
		
	public void showNotification()  throws Exception{
		
		NotificationCompat.Builder mBuilder =
		        new NotificationCompat.Builder(context)
			
		        .setSmallIcon(dataSet.getSmallIcon())
		        .setContentTitle(dataSet.getContentTitle())
		        .setContentText(dataSet.getContentText());
		mBuilder.setLargeIcon(dataSet.getLargeIcon());
		
		NotificationCompat.InboxStyle bigTextStyle=new InboxStyle();
		bigTextStyle.setBigContentTitle(dataSet.getContentTitle());
		bigTextStyle.setSummaryText(dataSet.getContentText());
		mBuilder.setStyle(bigTextStyle);
		
		Intent resultIntent = new Intent(context, resultActivity);
		/**Attaching the bundle data with the intent*/
		resultIntent.putExtras(resultBundle);
		
		TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
		/**Attaching the response activity with the stack builder */
		stackBuilder.addParentStack(resultActivity);
		
		stackBuilder.addNextIntent(resultIntent);
		PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0,
				PendingIntent.FLAG_UPDATE_CURRENT  );
		
		mBuilder.setContentIntent(resultPendingIntent);
		
		NotificationManager mNotificationManager =
		    (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
		mNotificationManager.notify(random.nextInt(36524), mBuilder.build());		
		
	}
	
}
