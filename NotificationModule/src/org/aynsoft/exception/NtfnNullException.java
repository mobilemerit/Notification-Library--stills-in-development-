package org.aynsoft.exception;

public class NtfnNullException extends NullPointerException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Override
	public String getMessage() {
		String msg="Null Pointer Exception\n Make sure you have set all the " +
				"meta data with the notification builder class";
		return msg;
	}
	
}
