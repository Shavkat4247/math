public class Car {

    private String model;
    private String rangi;
    private double narxi;
    private boolean Avtomat;

    public Car(String model, String rangi, double narxi, boolean Avtomat) {
        this.model = model;
        this.rangi = rangi;
        this.narxi = narxi;
        this.Avtomat = Avtomat;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("rangi: " + rangi);
        System.out.println("Narxi: $" + narxi);
        if (Avtomat) {
            System.out.println("Qanaqa: Avtomat");
        } else {
            System.out.println("Qanaqa: Mexanika");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("BMW MP500", "qora", 25000, true);
        myCar.displayInfo();
    }
}
