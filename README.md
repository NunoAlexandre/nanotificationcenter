NANoticiationCenter
===================

A simpler Apple's NSNotificationCenter written in Java, meant for Android.

NANotificationCenter is an Android Java simpler implementation of Apple's NSNotificationCenter, meant for simple use cases and to help iOS developers that also develop to Android to write and maintain similar code and to offer general-purpose Android developers an Observable-Observer alternative solution.


It follows NSNotificationCenter idea: 

<b>1_</b> You have X number of notification types on your application that are identified by a name (String).
   Its advised to define them on the NANotificationTags enum.

<b>2_</b> You have an unique instance of the NANotificationCenter where NANotifiable objects can signup or deregister for any notifications (defined on NANotificationTags)

<b>3_</b> At last, you have an entity responsabile to postNotification for a certain notification (notificationName)  and to pass a message content.
  By doing so, every NANotifiable object signed up for notificationName get their getNotification(String notificationName, ContentValues message); method called and they are then responsible to act accordingly.


Best Regards,
Nuno Alexandre
