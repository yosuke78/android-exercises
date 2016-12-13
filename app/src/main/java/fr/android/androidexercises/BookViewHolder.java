package fr.android.androidexercises;

import android.widget.TextView;

/**
 * Created by vannasay on 13/12/16.
 */

public class BookViewHolder {
    final TextView nameTextView, priceTextView;

    public BookViewHolder(TextView nameTextView, TextView priceTextView) {
        this.nameTextView = nameTextView;
        this.priceTextView = priceTextView;
    }

}
