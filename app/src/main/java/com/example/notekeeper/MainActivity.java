package com.example.notekeeper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.example.notekeeper.adapters.NotesAdapter;
import com.example.notekeeper.service.database.NotesDatabase;

public class MainActivity extends AppCompatActivity {
	private RecyclerView recyclerView;
	private RecyclerView.LayoutManager recyclerViewLayoutManager;
	private RecyclerView.Adapter recyclerViewAdapter;
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
		recyclerViewAdapter = new NotesAdapter();

		recyclerView.setLayoutManager(recyclerViewLayoutManager);
		recyclerView.setAdapter(recyclerViewAdapter);
	}
}