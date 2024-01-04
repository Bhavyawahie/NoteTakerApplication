package com.example.notekeeper.service.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.notekeeper.dao.NotesDAO;
import com.example.notekeeper.entity.NotesEntity;

@Database(version = 1, entities = {NotesEntity.class} )
public abstract class NotesDatabase extends RoomDatabase {
	public abstract NotesDAO notesDAO();
}
