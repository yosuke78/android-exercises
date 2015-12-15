package fr.android.androidexercises;

public class LoginPresenter {

    private final LoginActivity activity;

    public LoginPresenter(LoginActivity activity) {
        this.activity = activity;
    }

    public void checkCredentials(String username, String password) {
        if (username != null && username.length() > 3 && password != null && password.length() >= 3) {
            activity.logged();
            activity.message(R.string.text_logged);
        } else {
            activity.notLogged();
            activity.message(R.string.notLogged);
        }
    }
}
