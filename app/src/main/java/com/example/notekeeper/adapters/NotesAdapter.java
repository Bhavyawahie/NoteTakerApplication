package com.example.notekeeper.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notekeeper.activities.MainActivity;
import com.example.notekeeper.utils.Utility;
import com.example.notekeeper.viewholders.NotesViewHolder;
import com.example.notekeeper.R;
import com.example.notekeeper.entity.NotesEntity;

import java.util.ArrayList;
import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesViewHolder> {
	private List<NotesEntity> notes;

	public NotesAdapter(Context applicationContext) {
		notes = new ArrayList<>();
		reload();
	}

	@NonNull
	@Override
	public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_row, parent, false);
		return new NotesViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull NotesViewHolder notesViewHolder, int position) {
		NotesEntity currentNote = notes.get(position);
		notesViewHolder.getTextView().setText(Utility.truncateText(currentNote.getNoteContent(), 18));
		notesViewHolder.getLinearLayoutContainerView().setTag(currentNote);
	}

	@Override
	public int getItemCount() {
		return notes.size();
	}

	public void reload() {
		notes = MainActivity.noteDatabase.notesDAO().getAllNotes();
		notifyDataSetChanged();
	}
}
