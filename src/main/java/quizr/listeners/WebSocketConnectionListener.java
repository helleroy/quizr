package quizr.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.web.socket.messaging.SessionConnectedEvent;

public class WebSocketConnectionListener implements ApplicationListener<SessionConnectedEvent> {
    @Override
    public void onApplicationEvent(SessionConnectedEvent event) {
        // HARD - Implement when not drunk
        // Generate or get participant id and return it.g
    }
}
