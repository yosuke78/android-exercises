package fr.android.androidexercises;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fr.android.androidexercises.adapter.BookAdapter3;

public class LibraryActivity extends AppCompatActivity {

    private static final Random RANDOM = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        ListView bookListView = (ListView) findViewById(R.id.bookListView);

        List<Book> books = getBooks();

        bookListView.setAdapter(new BookAdapter3(this, books));
    }

    private List<Book> getBooks() {
        ArrayList<Book> books = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            books.add(new Book(String.format("Garry Potier Tome %d", i), RANDOM.nextInt(30)));
        }
        return books;
    }

}
