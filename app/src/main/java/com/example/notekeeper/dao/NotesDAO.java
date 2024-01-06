package com.example.notekeeper.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.notekeeper.entity.NotesEntity;

import java.util.List;

@Dao
public interface NotesDAO {
	@Query("INSERT INTO notes (noteContent) VALUES ('New test note')")
	void createNote();

	@Query("SELECT * FROM notes")
	List<NotesEntity> getAllNotes();

	@Query("UPDATE notes SET noteContent = :noteContent WHERE id = :id")
	void updateNote(long id, String noteContent);

	@Query("DELETE FROM notes WHERE id = :id")
	void deleteNote(long id);
}
