package com.example.notekeeper.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.notekeeper.R;
import com.example.notekeeper.utils.Utility;

public class EditNoteActivity extends AppCompatActivity {
	private EditText editTextBox;
	private long noteId;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_note);
		editTextBox = findViewById(R.id.edit_text_box);
		String retrivedExtraString = getIntent().getStringExtra("noteContent");
		editTextBox.setText(retrivedExtraString);
		editTextBox.setSelection(editTextBox.getText().length());

		noteId = getIntent().getLongExtra("id", 0);
	}

	@Override
	protected void onPause() {
		super.onPause();
		MainActivity.noteDatabase.notesDAO().updateNote(noteId, Utility.removeWhiteSpace(String.valueOf(editTextBox.getText())));
	}
}