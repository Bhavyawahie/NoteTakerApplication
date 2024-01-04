package com.example.notekeeper.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "notes")
public class NotesEntity {
	@PrimaryKey(autoGenerate = true)
	private long id;
	@ColumnInfo
	private String noteContent;

	public NotesEntity() {
	}

	public NotesEntity(String noteContent) {
		this.noteContent = noteContent;
	}

	public NotesEntity(long id, String noteContent) {
		this.id = id;
		this.noteContent = noteContent;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNoteContent() {
		return noteContent;
	}

	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}
}
