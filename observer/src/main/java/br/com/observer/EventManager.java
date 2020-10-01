package br.com.observer;

import br.com.observer.listener.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    private Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager subscribe(String eventType, EventListener listener) {
        System.out.println("Subscribing: " + listener.getClass().getSimpleName() + " to event: " + eventType);
        System.out.println();

        listeners.computeIfAbsent(eventType, k -> new ArrayList<>());

        this.listeners.get(eventType).add(listener);

        return this;
    }

    public void unsubscribe(String eventType, EventListener listener) {
        System.out.println("Unsubscribing: " + listener.getClass().getSimpleName() + " to event: " + eventType);
        System.out.println();

        listeners.get(eventType).remove(listener);
    }

    public void notify(String eventType, String message) {
        listeners.get(eventType).forEach(l -> l.update(eventType, message));
    }
}