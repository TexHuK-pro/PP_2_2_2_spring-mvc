package web.servise;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServise {
    private static int CAR_ID;
    private List<Car> cars;

    public CarServise() {
        cars = new ArrayList<>();

        cars.add(new Car(++CAR_ID, "model1", 111));
        cars.add(new Car(++CAR_ID, "model2", 222));
        cars.add(new Car(++CAR_ID, "model3", 333));
        cars.add(new Car(++CAR_ID, "model4", 444));
        cars.add(new Car(++CAR_ID, "model5", 555));
    }

    public List<Car> index(int count) {
        if (count > 5) {
            return cars;
        }
        List<Car> temp_car = new ArrayList<>();
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            temp_car.add(cars.get(i));
        }
        return temp_car;
    }
}
