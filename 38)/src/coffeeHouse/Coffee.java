package coffeeHouse;

public class Coffee implements Order {
    private double price;
    private String label;
    public Coffee(String label, double price) {
        this.label = label;
        this.price = price;
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
