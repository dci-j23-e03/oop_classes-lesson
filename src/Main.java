public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("black", "Seat", "Toledo");
        Car helensCar = new Car("blue", "Nissan", "Ultima");

        // fields will be set to default values
        Car newCar = new Car();
        System.out.printf("New car characteristics: \n\tColor: %s \n\tBrand: %s \n\tModel: %s \n\tYear: %d\n",
                newCar.color, newCar.brand, newCar.model, newCar.yearOfManufacture);

        System.out.printf("My car characteristics: \n\tColor: %s \n\tBrand: %s \n\tModel: %s \n",
                myCar.color, myCar.brand, myCar.model);
        System.out.printf("Helen's car characteristics: \n\tColor: %s \n\tBrand: %s \n\tModel: %s \n",
                helensCar.color, helensCar.brand, helensCar.model);

        myCar.repaint("yellow");
        System.out.printf("My car characteristics: \n\tColor: %s \n\tBrand: %s \n\tModel: %s \n",
                myCar.color, myCar.brand, myCar.model);

        helensCar.repaint("yellow");
        System.out.printf("Helen's car characteristics: \n\tColor: %s \n\tBrand: %s \n\tModel: %s \n",
                helensCar.color, helensCar.brand, helensCar.model);

        System.out.println(Car.className());
    }
}