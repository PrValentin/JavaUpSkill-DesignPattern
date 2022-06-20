package classes;

import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class EmailTopicSubject implements Subject {
    private final List<Observer> observerList;
    private String message;

   public EmailTopicSubject() {
        this.observerList = new ArrayList<>();
    }

    public void postMessage(String message) {
        System.out.println("From my EmailTopic "+ message);
        this.message = message;
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("Null object/observer");

        if (!observerList.contains(observer)) {
            observerList.add(observer);
        }

    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(Observer::update);
    }

    @Override
    public String getUpdate() {
        return this.message;
    }


}
