public class Car {

    public static final String CLASS_NAME = "Car";
    public String color;
    public String model;
    public String brand;

    public int yearOfManufacture;

    // you can have multiple constructors
    // you can call other constructor from a constructor
    public Car(String color, String model, String brand) {
        this(color, brand);
        this.model = model;
    }

    private Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    // this one will be created by compiler if we don't have any other constructor
    public Car() {
    }

    // instance method - referring to objects, can be applied to object of type Car
    public void repaint(String newColor) {
        if (!color.equals("black")) {
            color = newColor;
        }
    }

    // static method - referring to class, can be called only using the class name
    // used for some utility/helper functionality (they are not actually related to any specific object)
    static String className() {
        return CLASS_NAME;
    }
}
