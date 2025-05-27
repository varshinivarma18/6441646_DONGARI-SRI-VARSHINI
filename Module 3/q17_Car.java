public class q17_Car {
    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        q17_Car car1 = new q17_Car();
        car1.make = "Toyota";
        car1.model = "Camry";
        car1.year = 2020;
        car1.displayDetails();

        q17_Car car2 = new q17_Car();
        car2.make = "Honda";
        car2.model = "Civic";
        car2.year = 2022;
        car2.displayDetails();
    }
}
