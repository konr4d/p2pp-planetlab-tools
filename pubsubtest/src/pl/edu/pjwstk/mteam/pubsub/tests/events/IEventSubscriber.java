package pl.edu.pjwstk.mteam.pubsub.tests.events;

public interface IEventSubscriber {

    public void handleEvent(String eventType, Object data);

    //public String[] acceptedEvents();

}
