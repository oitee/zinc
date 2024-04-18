package dev.otee.zinc.api.schema;

import dev.otee.zinc.model.Note;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class NoteResponse {
    public static ResponseEntity<ResponseBody> ok(Note note, String message, long id, HttpStatus status){
        ResponseBody body = new ResponseBody(note, message, id, null);
        return new ResponseEntity<ResponseBody>(body, status);
    }

    public static ResponseEntity<ResponseBody> error(String errorMessage, HttpStatus status){
        ResponseBody body = new ResponseBody(null, null, null, errorMessage);
        return new ResponseEntity<ResponseBody>(body, status);
    }

}
