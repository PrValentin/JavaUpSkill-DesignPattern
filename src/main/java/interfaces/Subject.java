package interfaces;

public interface Subject {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

    String getUpdate();

    void postMessage(String message);
}
