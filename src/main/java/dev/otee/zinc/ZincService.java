package dev.otee.zinc;

import dev.otee.zinc.model.Note;
import dev.otee.zinc.model.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZincService {
    @Autowired
    private NoteRepository data;
    public String healthCheck(){
        return "Server working...";
    }

    public String insert(){
        String[] tags = {"tag1", "tag2"};
        Note note = new Note("Sample Title", "some body...", tags);
        data.save(note);
        return "Inserted" + note.getId();
    }
}
