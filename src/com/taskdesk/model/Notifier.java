package com.taskdesk.model;

public interface Notifier {
    void sendNotification(String message);
}
class ConsoleNotifier implements Notifier{
    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }
}
class EmailNotifier implements Notifier{
    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }
}