package furama_resort.exception;

public class SalaryException extends  Exception {
    public SalaryException(String message) {
        super(message);
    }
    public static void checkSalary(double salary) throws SalaryException{
        if(salary < 0){
            throw new SalaryException("Lương phải lớn hơn 0 !!!! ");
        }
    }
}
