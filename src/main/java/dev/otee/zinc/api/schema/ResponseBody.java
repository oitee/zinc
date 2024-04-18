package dev.otee.zinc.api.schema;

import dev.otee.zinc.model.Note;

public record ResponseBody(Note note, String message, Long id, String errorMessage){}
