import java.util.ArrayList;
import java.util.List;

public class CarList {
    private List<Car> cars;

    public CarList() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota"));
        cars.add(new Car("Honda"));
        cars.add(new Car("Ford"));
    }

    public Car getCar(String model) {
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model)) {
                return car;
            }
        }
        throw new CarNotFoundException("Машина с параметрами " + model + " в списке не найдена");
    }

    public static void main(String[] args) {
        CarList carList = new CarList();
        try {
            carList.getCar("BMW"); // Попробуем найти машину, которой нет в списке
        } catch (CarNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
