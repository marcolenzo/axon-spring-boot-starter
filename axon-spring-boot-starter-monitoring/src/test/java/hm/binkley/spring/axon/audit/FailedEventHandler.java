package hm.binkley.spring.axon.audit;

import org.axonframework.eventhandling.annotation.EventHandler;

public class FailedEventHandler {
    @EventHandler
    public void handle(final FailedEvent event) {
        throw event.cause;
    }
}
