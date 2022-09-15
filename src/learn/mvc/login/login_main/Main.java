package learn.mvc.login.login_main;

import learn.mvc.login.login_controllor.LoginController;
import learn.mvc.login.login_view.LoginView;

public class Main {
    public static void main(String[] args) {
        LoginView view = new LoginView();
        LoginController control = new LoginController(view);
        control.login();
    }
}
