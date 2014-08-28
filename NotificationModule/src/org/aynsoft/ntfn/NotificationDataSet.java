package org.aynsoft.ntfn;

import android.graphics.Bitmap;

public class NotificationDataSet {

	String contentTitle,contentText;
	Bitmap largeIcon;
	int smallIcon;
	
	
	
	public String getContentTitle() {
		return contentTitle;
	}
	public void setContentTitle(String contentTitle) {
		this.contentTitle = contentTitle;
	}
	public String getContentText() {
		return contentText;
	}
	public void setContentText(String contentText) {
		this.contentText = contentText;
	}


	public int getSmallIcon() {
		return smallIcon;
	}
	public void setSmallIcon(int smallIcon) {
		this.smallIcon = smallIcon;
	}
	public Bitmap getLargeIcon() {
		return largeIcon;
	}
	public void setLargeIcon(Bitmap largeIcon) {
		this.largeIcon = largeIcon;
	}
	
	
	
}
