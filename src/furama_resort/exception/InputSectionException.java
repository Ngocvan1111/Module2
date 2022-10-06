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
            throw new InputSectionException("Lựa chọn không đúng 1-3 || "+choise);
        }

    }
    public static void checkInputChoiseCustomerType(int choise) throws InputSectionException{
        int[] arr = new int[]{1,2,3,4,5};
        boolean flag = true;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == choise){
                flag = false;
                break;
            }
        }
        if(flag){
            throw new InputSectionException("Lựa chọn không đúng 1-5 || "+choise);
        }

    }
    public static void checkInputChoiceLevelOfEmployee(int choice) throws InputSectionException{
        int[] arr = new int[]{1,2,3,4};
        boolean flag = true;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == choice){
                flag = false;
                break;
            }
        }
        if(flag){
            throw new InputSectionException("Lựa chọn không đúng 1-4 || "+choice);
        }
    }
    public static void checkInputChoicePositionOfEmployee(int choice) throws InputSectionException{
        int[] arr = new int[]{1,2,3,4,5,6};
        boolean flag = true;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == choice){
                flag = false;
                break;
            }
        }
        if(flag){
            throw new InputSectionException("Lựa chọn không đúng 1-6 || "+choice);
        }
    }
}
