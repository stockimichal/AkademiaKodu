public class Car {
    private String brand;
    private String model;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        setPrice(price);

    }

    void show(){
        System.out.println(brand+" "+price);


    }
    public static void main(String[] args) {
        Car car = new Car("Peugeot","206+", 12345 )  ;
        car.show();
    }
}
