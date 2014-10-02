//package xxx.yyy.zzz.nanotificationcenter;

import android.content.ContentValues;

/*
 * Sets the interfaces for a Notifiable object.
 * */
public interface NANotifiable {

	/*
	 * A notifiable object must implements this method.
	 * This method is called when there some entity has the intention
	 * to notify the observer of a notification notificationName.
	 * The ContentValues message may contain useful data that the notifiable
	 * entities must know how and what to use it for.
	 * */
	public void getNotification(String notificationName, ContentValues message);
}
