package com.example.notekeeper.viewholders;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.notekeeper.R;

public class NotesViewHolder extends RecyclerView.ViewHolder {
	private LinearLayout linearLayoutContainerView;
	private TextView textView;

	public NotesViewHolder(View view) {
		super(view);
		linearLayoutContainerView = view.findViewById(R.id.note_row_containerview);
		textView = view.findViewById(R.id.note_row_textview);

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
	public void reload() {

	}
}
