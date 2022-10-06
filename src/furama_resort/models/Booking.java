package furama_resort.models;

public class Booking {
    private String bookingCode;
    private String startDay;
    private String endDay;
    private String code;
    private String serviceCode;
    private String typeForRent;

    public Booking() {
    }

    public Booking(String bookingCode, String startDay, String endDay, String code, String serviceCode, String typeForRent) {
        this.bookingCode = bookingCode;
        this.startDay = startDay;
        this.endDay = endDay;
        this.code = code;
        this.serviceCode = serviceCode;
        this.typeForRent = typeForRent;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getTypeForRent() {
        return typeForRent;
    }

    public void setTypeForRent(String typeForRent) {
        this.typeForRent = typeForRent;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s",this.bookingCode,this.startDay,this.endDay,this.code,this.serviceCode,this.typeForRent);
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s",this.bookingCode,this.startDay,this.endDay,this.code,this.serviceCode,this.typeForRent);
    }
}
