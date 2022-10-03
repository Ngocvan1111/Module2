package furama_resort.models;

public class Booking {
    private int bookingCode;
    private String startDay;
    private String endDay;
    private String code;
    private String serviceName;
    private String typeForRent;

    public Booking() {
    }

    public Booking(int bookingCode, String startDay, String endDay, String code, String serviceName, String typeForRent) {
        this.bookingCode = bookingCode;
        this.startDay = startDay;
        this.endDay = endDay;
        this.code = code;
        this.serviceName = serviceName;
        this.typeForRent = typeForRent;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
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

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeForRent() {
        return typeForRent;
    }

    public void setTypeForRent(String typeForRent) {
        this.typeForRent = typeForRent;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode=" + bookingCode +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", code='" + code + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", typeForRent='" + typeForRent + '\'' +
                '}';
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s",this.bookingCode,this.startDay,this.endDay,this.code,this.serviceName,this.typeForRent);
    }
}
