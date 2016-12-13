package fr.android.androidexercises;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class BookAdapter extends BaseAdapter {

    private final List<Book> books;
    private final LayoutInflater inflater;

    public BookAdapter(Context context, List<Book> books) {
        this.books = books;
        // TODO LayoutInflater.from()
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        // TODO
        return books.size();
    }

    @Override
    public Book getItem(int position) {
        // TODO
        return books.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO
        return books.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO
        /*
        View view = inflater.inflate(R.layout.custom_view_item_book, parent, false);
        Book book = books.get(position);
        ((TextView) view.findViewById(R.id.nameTextView)).setText(book.name);
        ((TextView) view.findViewById(R.id.priceTextView))
                .setText(String.valueOf(book.price));
        return view;
        */

        BookViewHolder bookViewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.custom_view_item_book, parent, false);
            TextView nameTextView = (TextView) convertView.findViewById(R.id.nameTextView);
            TextView priceTextView = (TextView) convertView.findViewById(R.id.priceTextView);
            convertView.setTag(new BookViewHolder(nameTextView, priceTextView));
        }
        Book book = books.get(position);
        bookViewHolder = (BookViewHolder) convertView.getTag();
        bookViewHolder.nameTextView.setText(book.name);
        bookViewHolder.priceTextView.setText(String.valueOf(book.price));
        return convertView;

        /*
        BookItemView bookItemView;
        if (convertView == null) {
            bookItemView = (BookItemView) inflater.inflate(R.layout.custom_view_item_book, parent, false);
        } else {
            bookItemView = (BookItemView) convertView;
        }
        Book book = books.get(position);
        bookItemView.bindView(book);
        return bookItemView;
        */
    }

}
