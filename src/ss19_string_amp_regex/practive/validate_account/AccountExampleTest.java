package ss19_string_amp_regex.practive.validate_account;

public class AccountExampleTest {
    private static final String[] validateAccount = new String[]{"123abc_","_abc123","______","123456","abcdefg"};
    private static final String[] invalidateAccount = new String[]{"11@","12345","1234_","abcde"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for(String account:validateAccount){
            boolean isvali = accountExample.validate(account);
            System.out.println("Account : "+account +" isvalid: "+ isvali);
        }
        for(String account:invalidateAccount){
            boolean isvali = accountExample.validate(account);
            System.out.println("Account : "+account +" isvalid: "+ isvali);
        }

    }

}
