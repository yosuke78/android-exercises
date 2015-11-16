package fr.android.androidexercises;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

public class BookAdapter extends BaseAdapter {

    private final List<Book> books = new ArrayList<>();
    private final LayoutInflater inflater;

    public BookAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    public void setBooks(List<Book> books) {
        if (books != null) {
            this.books.clear();
            this.books.addAll(books);
            notifyDataSetChanged();
        }
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
        return getItem(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BookItemView view;
        if (convertView != null) {
            // TODO cast convertView
        } else {
            // TODO inflate correct layout to get BookItemView instance
        }
        // TODO bindView()
        return view;
    }
}
