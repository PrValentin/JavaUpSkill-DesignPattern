package classes;

import interfaces.Observer;
import interfaces.Subject;

public class EmailTopicSubscriber implements Observer {
    private Topic topic;
    private Subject subject;

    public EmailTopicSubscriber (Topic topic) {
        this.topic = topic;
    }

    @Override
    public void update() {
        String msg = subject.getUpdate();
        if (msg == null) {
            System.out.println("Topic name is :"+ topic.getName() + " no message ");
        }else {
            System.out.println("Topic name is :"+ topic.getName() + " the message is :" + msg);
        }
    }

    @Override
    public void setSubject(interfaces.Subject subject) {
        this.subject = subject;
    }

}
