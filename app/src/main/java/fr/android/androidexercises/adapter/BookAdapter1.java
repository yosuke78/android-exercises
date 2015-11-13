package fr.android.androidexercises.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import fr.android.androidexercises.Book;
import fr.android.androidexercises.R;

public class BookAdapter1 extends BaseAdapter {

    private final List<Book> books;
    private final LayoutInflater inflater;

    public BookAdapter1(Context context, List<Book> books) {
        this.books = books;

        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Book getItem(int position) {
        return books.get(position);
    }

    @Override
    public long getItemId(int position) {
        return books.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.view_item_book, parent, false);
        }
        Book book = books.get(position);
        ((TextView) convertView.findViewById(R.id.nameTextView)).setText(book.name);
        ((TextView) convertView.findViewById(R.id.priceTextView)).setText(String.valueOf(book.price));
        return convertView;
    }

}
