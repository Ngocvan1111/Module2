package learn.mvc.login.login_model;

public class LoginModel {
    private String useName;
    private String passWord;
    public LoginModel(){

    }
    public LoginModel(String useName, String passWord){
//        super();
        this.useName = useName;
        this.passWord = passWord;
    }

    public String getUseName() {
        return useName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
