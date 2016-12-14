package fr.android.androidexercises;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by vannasay on 14/12/16.
 */

public interface BookService {
    @GET("books")
    Call<List<Book>> listBooks();
}
