package com.example.notekeeper.viewholders;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.notekeeper.R;
import com.example.notekeeper.activities.EditNoteActivity;
import com.example.notekeeper.adapters.NotesAdapter;
import com.example.notekeeper.entity.NotesEntity;

public class NotesViewHolder extends RecyclerView.ViewHolder {
	private LinearLayout linearLayoutContainerView;
	private TextView textView;

	public NotesViewHolder(View view) {
		super(view);
		linearLayoutContainerView = view.findViewById(R.id.note_row_containerview);
		textView = view.findViewById(R.id.note_row_textview);
		linearLayoutContainerView.setOnClickListener(v -> {
			final NotesEntity currentNote = (NotesEntity) linearLayoutContainerView.getTag();
			Intent intent = new Intent(v.getContext(), EditNoteActivity.class);
			intent.putExtra("id", currentNote.getId());
			intent.putExtra("noteContent", currentNote.getNoteContent());

			v.getContext().startActivity(intent);
		});

	}
	public LinearLayout getLinearLayoutContainerView() {
		return linearLayoutContainerView;
	}

	public void setLinearLayoutContainerView(LinearLayout linearLayoutContainerView) {
		this.linearLayoutContainerView = linearLayoutContainerView;
	}

	public TextView getTextView() {
		return textView;
	}

	public void setTextView(TextView textView) {
		this.textView = textView;
	}
}
