package CleanCode;

public class Student extends Customer{
    private double discountRate = 0.90;
    public Student(int id, String name) {
        super(id, name);
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}