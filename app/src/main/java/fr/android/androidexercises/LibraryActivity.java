package fr.android.androidexercises;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import timber.log.Timber;

public class LibraryActivity extends AppCompatActivity {

    ListView bookListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        // Plant logger cf. Android Timber
        Timber.plant(new Timber.DebugTree());

        bookListView = (ListView) findViewById(R.id.bookListView);
        final BookAdapter bookAdapter = new BookAdapter(this);
        bookListView.setAdapter(bookAdapter);

        // TODO build Retrofit

        // TODO create a service

        // TODO listBooks()

        // TODO enqueue call and display book title
    }

}
