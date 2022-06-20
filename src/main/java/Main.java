import classes.EmailTopicSubject;
import classes.EmailTopicSubscriber;
import classes.Topic;
import classes.TopicBuilder;
import enums.TypeOfNews;
import interfaces.Observer;
import interfaces.Subject;

import java.time.LocalDate;

import static java.lang.Boolean.FALSE;

public class Main {
    public static void main(String[] args) {
        Subject emailTopicSubject = new EmailTopicSubject();

        Topic sport = new TopicBuilder("Sport", "Football, Basketball, Volleyball").build();
        Topic weather = new TopicBuilder("Weather", "Something About Weather")
                .setTypeOfNews(TypeOfNews.Weather)
                .setDateSubscription(LocalDate.now())
                .setEndDateSubscription(LocalDate.now().plusMonths(1))
                .setRestrictionAge(FALSE)
                .build();

        Topic generalNews = new TopicBuilder("General news", "About General News")
                .setTypeOfNews(TypeOfNews.General)
                .setDateSubscription(LocalDate.now())
                .build();

        //create observers
        Observer sportObserver = new EmailTopicSubscriber(sport);
        Observer weatherObserver = new EmailTopicSubscriber(weather);
        Observer newsObserver = new EmailTopicSubscriber(generalNews);

        //register observers

        emailTopicSubject.register(sportObserver);
        emailTopicSubject.register(weatherObserver);
        emailTopicSubject.register(newsObserver);

        // Attaching observers to subject

        sportObserver.setSubject(emailTopicSubject);
        weatherObserver.setSubject(emailTopicSubject);
        newsObserver.setSubject(emailTopicSubject);

        // Check for updates

        sportObserver.update();
        weatherObserver.update();

        // Provider/ Subject
        emailTopicSubject.postMessage("Hello there");
        emailTopicSubject.unregister(sportObserver);
        emailTopicSubject.postMessage("Hello again");


    }
}
