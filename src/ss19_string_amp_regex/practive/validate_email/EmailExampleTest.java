package ss19_string_amp_regex.practive.validate_email;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] {"a@gmail.com","ab@yahoo.com","abc@hotmail.com"};
    public static final String[] invalidEmail = new String[] {"@gmail.com","ab@gmail.","@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for(String e:validEmail){
            boolean isvalid = emailExample.validate(e);
            System.out.println("Email is "+ e+ " is valid: "+ isvalid);
        }
        for(String e:invalidEmail){
            boolean isvalid = emailExample.validate(e);
            System.out.println("Email is "+e+" is valid: "+ isvalid);
        }
    }
}
