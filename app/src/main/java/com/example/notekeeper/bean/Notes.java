package com.example.notekeeper.bean;

public class Notes {
	private long id;
	private String noteContent;

	public Notes() {
	}

	public Notes(String noteContent) {
		this.noteContent = noteContent;
	}

	public Notes(long id, String noteContent) {
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
