package dev.otee.zinc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.OffsetDateTime;
@Table
public class Note {
    @Id
    long id;
    String title;
    String body;
    String[] tags;
    OffsetDateTime createdAt;
    OffsetDateTime updatedAt;
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
}
