package furama_resort.models;

public class Room extends Facility {
    private String promotionService;

    public Room() {
    }

    public Room(String serviceName, double area, double price, int maxPerson, String typeForRent, String promotionService) {
        super(serviceName, area, price, maxPerson, typeForRent);
        this.promotionService = promotionService;
    }

    public String getPromotionService() {
        return promotionService;
    }

    public void setPromotionService(String promotionService) {
        this.promotionService = promotionService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "promotionService='" + promotionService + '\'' +
                '}';
    }
    public String getInfo(){
        return super.getInfo()+ String.format(" ,%s",promotionService);
    }
}
