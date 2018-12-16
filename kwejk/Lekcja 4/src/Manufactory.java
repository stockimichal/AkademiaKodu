import java.util.ArrayList;
import java.util.List;

public class Manufactory {

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Audi", "A4", 123));
        carList.add(new Car("Porsche", "Mega", 12543));
        carList.add(new Car("BMW", "Lux", 645123));
        carList.add(new Car("Peugeot", "3006", 4564123));

        for (Car car: carList){
            car.show();
        }
    }
}
