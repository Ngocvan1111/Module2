package learn.mvc.login.login_view;

import learn.mvc.login.login_model.LoginModel;

import java.util.Scanner;

public class LoginView {
    public static Scanner scanner = new Scanner(System.in);
    public void showMessage(String smg){
        System.out.println(smg);
    }
    public LoginModel getUserInfo(){
        LoginModel user = new LoginModel();
        System.out.print("Username: ");
        user.setUseName(scanner.next());
        System.out.print("Password: ");
        user.setPassWord(scanner.next());
        return user;

    }
}
