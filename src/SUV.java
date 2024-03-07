public class SUV extends Vehicle{
    private int seats;
    private String engineType;

    public SUV(String brand, int year, float price, int seats, String engineType){
        super(brand, year, price);
        this.seats = seats;
        this.engineType = engineType;
    }
    @Override
    public String toString() {
        return super.toString() + this.seats + this.engineType;
    }
}
