package classes;

import enums.TypeOfNews;

import java.time.LocalDate;

public  class TopicBuilder {
    private String name;
    private String shortDescription;
    private LocalDate subscription;
    private LocalDate endSubscription;
    private TypeOfNews typeOfNews;
    private Boolean restrictionAge;

    public TopicBuilder(String name, String shortDescription) {
        this.name = name;
        this.shortDescription = shortDescription;
    }

    public TopicBuilder setDateSubscription(LocalDate subscription) {
        this.subscription = subscription;
        return this;
    }

    public TopicBuilder setEndDateSubscription(LocalDate endSubscription) {
        if (subscription != null && endSubscription.isAfter(subscription)) {
            this.endSubscription = endSubscription;
        }
        return this;
    }

    public TopicBuilder setTypeOfNews(TypeOfNews typeOfNews) {
        this.typeOfNews = typeOfNews;
        return this;
    }

    public TopicBuilder setRestrictionAge(Boolean restrictionAge) {
        this.restrictionAge = restrictionAge;
        return this;
    }

    public Topic build() {
        return new Topic(this);
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
}