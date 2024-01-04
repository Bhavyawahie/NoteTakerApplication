package com.example.notekeeper.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.os.Bundle;

import com.example.notekeeper.R;
import com.example.notekeeper.adapters.NotesAdapter;
import com.example.notekeeper.service.database.NotesDatabase;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
	private RecyclerView recyclerView;
	private RecyclerView.LayoutManager recyclerViewLayoutManager;
	private NotesAdapter recyclerViewAdapter;
	private FloatingActionButton addNoteButton;
	public static NotesDatabase noteDatabase;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		noteDatabase = Room.databaseBuilder(getApplicationContext(), NotesDatabase.class, "notes")
						.allowMainThreadQueries()
						.build();

		recyclerView = findViewById(R.id.recycler_view);
		recyclerViewLayoutManager = new LinearLayoutManager(this);
		recyclerViewAdapter = new NotesAdapter(getApplicationContext());
		addNoteButton = findViewById(R.id.add_note_button);

		addNoteButton.setOnClickListener(v -> {
			noteDatabase.notesDAO().createNote();
			recyclerViewAdapter.reload();
		});

		recyclerView.setLayoutManager(recyclerViewLayoutManager);
		recyclerView.setAdapter(recyclerViewAdapter);
	}

	@Override
	protected void onResume() {
		super.onResume();
		recyclerViewAdapter.reload();
	}
}