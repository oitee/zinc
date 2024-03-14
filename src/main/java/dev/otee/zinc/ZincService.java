package dev.otee.zinc;

import dev.otee.zinc.model.Note;
import dev.otee.zinc.model.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
public class ZincService {
    @Autowired
    private NoteRepository data;
    public String healthCheck(){
        return "Server working...";
    }

    public Note insert(Note note){
        if(note.getTitle() == null || note.getTitle().isBlank()){
            return null;
        }
        if(note.getBody() == null || note.getBody().isBlank()){
            return null;
        }
        if(note.getTags() == null){
            note.setTags(new String[]{});
        }
        note.setUpdatedAt(OffsetDateTime.now());
        note.setCreatedAt(OffsetDateTime.now());
        return data.save(note);
    }
}
