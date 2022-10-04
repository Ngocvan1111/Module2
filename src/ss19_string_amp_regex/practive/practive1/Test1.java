package ss19_string_amp_regex.practive.practive1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String text1= "Hello java regex 2-12-2018, hello world 12/12/2018";
        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
        Matcher matcher = pattern.matcher(text1);
        System.out.println("Ngaày tháng trong chuỗi text1: "+text1);
        while (matcher.find()){
            System.out.println(text1.substring(matcher.start(),matcher.end()));
        }
        String text2 = "2/12/2018";
        String text3 = "12/12/aaaa";
        pattern = Pattern.compile("^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
        System.out.println("\nChuooix "+ text2 + "Có didngj dạng ngày tháng: "+pattern.matcher(text2).matches());
        System.out.println("\nChuooix"+ text3 + " Có định dạng ngày tháng : "+pattern.matcher(text3).matches());
    }

}
