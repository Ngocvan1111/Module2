package furama_resort.models;

public class Contact {
    private int numberContact;
    private int bookingCode;
    private double depositAmount;
    private double totalPayment;
    private String code;

    public Contact() {
    }

    public Contact(int numberContact, int bookingCode, double depositAmount, double totalPayment, String code) {
        this.numberContact = numberContact;
        this.bookingCode = bookingCode;
        this.depositAmount = depositAmount;
        this.totalPayment = totalPayment;
        this.code = code;
    }

    public int getNumberContact() {
        return numberContact;
    }

    public void setNumberContact(int numberContact) {
        this.numberContact = numberContact;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "numberContact=" + numberContact +
                ", bookingCode=" + bookingCode +
                ", depositAmount=" + depositAmount +
                ", totalPayment=" + totalPayment +
                ", code='" + code + '\'' +
                '}';
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s",this.numberContact,this.bookingCode,this.depositAmount,this.totalPayment,this.code);
    }
}
