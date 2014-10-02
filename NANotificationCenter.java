//package xxx.yyy.zzz.nanotificationcenter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import android.content.ContentValues;

public enum NANotificationCenter {
	//Only instance
	INSTANCE;
	// map of notifiable objects over a notification (key)
	private final Map<String, HashSet<NANotifiable>> notifiable;
	
	/*
	 * Initializes the NotificationCenter.
	 */
	NANotificationCenter() {
		notifiable = new HashMap<String, HashSet<NANotifiable>>();
	}
	
	/*
	 * Adds a notifiable observer forNotificationName.
	 *
	 */
	public void addNotifiable(NANotifiable observer, String forNotificatioName ) {
		if (notifiable.containsKey(forNotificatioName)) {
			notifiable.get(forNotificatioName).add(observer);
		}
		else {
			HashSet<NANotifiable> thisNotificationObservers = new HashSet<NANotifiable>();
			thisNotificationObservers.add(observer);
			notifiable.put(forNotificatioName, thisNotificationObservers);
		}
	}
	

	/*
	 * Removes a notifiable observer forNotificationName.
	 *
	 */
	public void removeNotifiable(NANotifiable observer, String forNotificatioName ) {
		if (notifiable.containsKey(forNotificatioName)) {
			notifiable.get(forNotificatioName).remove(observer);
		}
	}

	/*
	 *  Method called to notify observers for notificationName.
	 */
	public void postNotification ( String notificationName, ContentValues message ) {
		for ( NANotifiable notifiableElement : notifiable.get(notificationName) ) {
			notifiableElement.getNotification(notificationName, message);
		}
	}

}
