package classes;

import enums.TypeOfNews;

import java.time.LocalDate;

public class Topic {
    private String name;
    private String shortDescription;
    private LocalDate subscription;
    private LocalDate endSubscription;
    private TypeOfNews typeOfNews;
    private Boolean restrictionAge;

    public Topic(TopicBuilder topicBuilder) {
        this.name = topicBuilder.getName();
        this.shortDescription = topicBuilder.getShortDescription();
        this.subscription = topicBuilder.getSubscription();
        this.endSubscription = topicBuilder.getEndSubscription();
        this.typeOfNews = topicBuilder.getTypeOfNews();
        this.restrictionAge = topicBuilder.getRestrictionAge();
    }

    public String getName() {
        return name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public LocalDate getSubscription() {
        return subscription;
    }

    public LocalDate getEndSubscription() {
        return endSubscription;
    }

    public TypeOfNews getTypeOfNews() {
        return typeOfNews;
    }

    public Boolean getRestrictionAge() {
        return restrictionAge;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "name='" + name + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", subscription=" + subscription +
                ", endSubscription=" + endSubscription +
                ", typeOfNews=" + typeOfNews +
                ", restrictionAge=" + restrictionAge +
                '}';
    }


}
