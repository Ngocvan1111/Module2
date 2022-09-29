package ss10_dsa_list.extra_excercise_1.exception;

public class InputException extends Exception {

    public InputException(String message) {
        super(message);
    }

    public static void checkCode(String code) throws InputException {
        for (int i = 2; i < code.length(); i++) {
            if (code.length() != 5 || code.charAt(0) != 'I' || code.charAt(1) != 'D' || (int) code.charAt(i) < 48 || (code.charAt(i) > 57)) {
                throw new InputException("Sai định dạng mã code !!!");
            }

        }
    }

    public static void checkName(String name) throws InputException {
        for (int i = 0, j = 1; i < name.length(); i++, j++) {
            if (name.charAt(0) == ' ' || name.charAt(name.length() - 1) == ' ' || (name.charAt(i) == ' ' && name.charAt(j) == ' ') || (name.charAt(i) < 65 && name.charAt(i) != 32) || (90 < name.charAt(i) && name.charAt(i) < 97) || 122 < name.charAt(i)) {
                throw new InputException("Sai định dạng tên !!!");
            }
            if (j == name.length() - 1) {
                j--;
            }
        }

    }

    public static void checkBirthday(String birthday) throws InputException {
        for (int i = 0; i < birthday.length(); i++) {
            if (birthday.length() != 10 || (birthday.charAt(2) != '/' && birthday.charAt(5) != '/')) {
                throw new InputException("Sai định dạng ngày tháng ");
            }
            if (i == 0 || i == 1 || i == 3 || i == 4 || i == 6 || i == 7 || i == 8 || i == 9) {
                if (birthday.charAt(i) < 48 || birthday.charAt(i) > 57) {
                    throw new InputException("Sai định dạng ngày tháng ");

                }
            }
        }

    }

    public static void checkGender(String gender) throws InputException {


    }

    public static void checkClassName(String className) throws InputException {
        for (int i = 0; i < className.length(); i++) {
            if (className.length() != 7 || className.charAt(0) != 'C' || className.charAt(5) != 'G' || className.charAt(className.length() - 1) < 49 || className.charAt(className.length() - 1) > 57) {
                throw new InputException("Sai định dạng lớp");
            }
            if (0 < i && i < 4) {
                if (className.charAt(i) < 47 || className.charAt(i) > 57) {
                    throw new InputException("Sai định dạng lớp");
                }
            }
        }

    }

    public static void checkScore(int score) throws InputException {
        if (score < 0 || score > 10) {
            throw new InputException(" Sai định dạng điểm số !!");
        }
    }
}