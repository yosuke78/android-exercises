package fr.android.androidexercises;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        // TODO Get image view and load image form URL

        ImageView downloadedImageView = (ImageView) findViewById(R.id.downloadImageView);
        Picasso.with(this)
                .load("http://img11.deviantart.net/555a/i/2016/217/2/c/goupix_vulpix_ice_form_alola_pokemon_moon_and_sun_by_naikodraw-dacs8dh.png")
                .resize(200,200)
                .centerCrop()
                .into(downloadedImageView);
        // http://img3.wikia.nocookie.net/__cb20120317101541/harrypotter/images/3/37/Gryffindor_Crest.jpg
    }

}
