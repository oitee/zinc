package dev.otee.zinc.model;

import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;
@Table
public interface NoteRepository extends CrudRepository<Note, Long> {
}
