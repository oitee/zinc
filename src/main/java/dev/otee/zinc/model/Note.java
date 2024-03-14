package dev.otee.zinc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.OffsetDateTime;

@Table
public class Note {
    @Id
    private long id;
    private String title;
    private String body;
    private String[] tags;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    public Note (){
    }


    public Note(String title, String body, String[] tags) {
        this.title = title;
        this.body = body;
        this.tags = tags;
        this.createdAt = OffsetDateTime.now();
        this.updatedAt = OffsetDateTime.now();
    }

    public long getId() {
        return id;
    }

    public OffsetDateTime getCreatedAt(){
        return createdAt;
    }

    public OffsetDateTime getUpdatedAt(){
        return updatedAt;
    }

    public String getTitle(){
        return title;
    }

    public String getBody() {
        return body;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
