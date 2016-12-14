package fr.android.androidexercises;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LibraryActivity extends AppCompatActivity implements Step0Fragment.OnNextStep0Listener, Step1Fragment.OnReturnListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        // TODO replace Step0Fragment in containerFrameLayout
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.containerFrameLayout, new Step0Fragment(), Step0Fragment.class.getSimpleName())
                .commit();
    }

    @Override
    public void onNext() {
        // TODO replace Step1Fragment in containerFrameLayout
        getSupportFragmentManager().beginTransaction()
                .addToBackStack(Step1Fragment.class.getSimpleName())
                .replace(R.id.containerFrameLayout, new Step1Fragment(), Step1Fragment.class.getSimpleName())
                .commit();
    }

    @Override
    public void onReturn() {
        getSupportFragmentManager().popBackStack();
    }
}
