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

public class BookAdapter2 extends BaseAdapter {

    private final List<Book> books;
    private final LayoutInflater inflater;

    public BookAdapter2(Context context, List<Book> books) {
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
        BookViewHolder bookViewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.view_item_book, parent, false);
            TextView nameTextView = (TextView) convertView.findViewById(R.id.nameTextView);
            TextView priceTextView = (TextView) convertView.findViewById(R.id.priceTextView);
            convertView.setTag(new BookViewHolder(nameTextView, priceTextView));
        }
        Book book = books.get(position);
        bookViewHolder = (BookViewHolder) convertView.getTag();
        bookViewHolder.nameTextView.setText(book.name);
        bookViewHolder.priceTextView.setText(String.valueOf(book.price));
        return convertView;
    }

    private static class BookViewHolder {
        final TextView nameTextView, priceTextView;

        public BookViewHolder(TextView nameTextView, TextView priceTextView) {
            this.nameTextView = nameTextView;
            this.priceTextView = priceTextView;
        }
    }

}
