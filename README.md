Notification-Library--stills-in-development-
============================================

A notification is a message you can display to the user outside of your application's normal UI. When you tell the system to issue a notification, it first appears as an icon in the notification area. To see the details of the notification, the user opens the notification drawer. Both the notification area and the notification drawer are system-controlled areas that the user can view at any time.


Notification-Library--stills-in-development-
============================================

A notification is a message you can display to the user outside of your application's normal UI. When you tell the system to issue a notification, it first appears as an icon in the notification area. To see the details of the notification, the user opens the notification drawer. Both the notification area and the notification drawer are system-controlled areas that the user can view at any time.


This library is in development phase.Even this is usefull.
In order to use this library follow the steps...

1. Import this project in  your workspace.
2. Set this project as library project of your project.
3. Just these code lines.


<code>
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
</code>

