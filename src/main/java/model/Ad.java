package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ad {

    private String title;
    private UUID id;
    private String text;
    private UUID userId;
    private LocalDateTime createdOn;
    private AdLifeCycle adLifeCycle;

    public String getTitle() {
        return title;
    }

    public UUID getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public UUID getUserId() {
        return userId;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public AdLifeCycle getAdLifeCycle() {
        return adLifeCycle;
    }

    public Ad(String title, String text, UUID userId) {
        this.title = title;
        this.text = text;
        this.userId = userId;

        this.id = UUID.randomUUID();
        this.createdOn = LocalDateTime.now();
        this.adLifeCycle = AdLifeCycle.WaitingForPayment;
    }

    public Ad() {

    }





}
