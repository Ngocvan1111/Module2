package furama_resort.exception;

public class InputSectionException extends Exception {
    public InputSectionException(String message) {
        super(message);
    }
    public static void checkInputChoiseForGender(int choise) throws InputSectionException{
        int[] arr = new int[]{1,2,3};
        boolean flag = true;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == choise){
                flag = false;
                break;
            }
        }
        if(flag){
            throw new InputSectionException("Lựa chọn không đúng 1-3"+choise);
        }

    }
}
