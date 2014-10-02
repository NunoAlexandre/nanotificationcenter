//package xxx.yyy.zzz.nanotificationcenter;
/*
 * This enum is meant to centralize all the types of 
 * nofications you will need in your project.
 */
public enum NANotificationsTags {

	EXAMPLE("ExampleNotification");
	private final String notificationTag;
	
	NANotificationsTags (String theNotificationTag) {
		notificationTag = theNotificationTag;
	}
	public String toString() {
		return notificationTag;
	}
}
