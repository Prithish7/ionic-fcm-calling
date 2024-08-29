package com.example.callplugin;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // Forward the message to CallService
        CallService callService = new CallService();
        callService.onMessageReceived(remoteMessage);
    }

    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);
        // Handle token updates if needed
    }
}
