package learn.mvc.login.login_controllor;

import learn.mvc.login.login_model.LoginModel;
import learn.mvc.login.login_view.LoginView;

public class LoginController {
    private LoginView view;
    public LoginController(LoginView view){
        this.view = view;

    }
    public void login(){
        while (true){
            LoginModel user = view.getUserInfo();
            if(checkLogin(user)){
                view.showMessage("success!");
                break;
            }
            else {
                view.showMessage("wrong user name or password!");
            }
        }
    }
    private boolean checkLogin(LoginModel user){
        if((user.getUseName().equals("admin"))&&(user.getPassWord().equals("admin"))){
            return true;
        }
        else return false;
    }

    public LoginView getView(){
        return view;
    }
    public void setView(LoginView view){
        this.view = view;
    }

}
