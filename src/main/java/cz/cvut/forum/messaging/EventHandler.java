package cz.cvut.forum.messaging;

import cz.cvut.forum.dto.TopicDTO;
import cz.cvut.forum.helper.PushEncoder;
import org.primefaces.push.annotation.OnMessage;
import org.primefaces.push.annotation.PushEndpoint;
import org.primefaces.push.impl.JSONEncoder;

import javax.faces.application.FacesMessage;

@PushEndpoint("/actions")
public class EventHandler {

//    @OnMessage(encoders = JSONEncoder.class)
//    public String onMessage(String message) {
//        return message;
//    }

//    @OnMessage(encoders = {JSONEncoder.class})
//    public FacesMessage onMessage(FacesMessage message) {
//        return message;
//    }

    @OnMessage(encoders = {PushEncoder.class})
    public TopicDTO onMessage(TopicDTO topic) {
        return topic;
    }
}
