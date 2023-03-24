public class BaseManager extends Employee {

    private int quantityOfSubordinates;

    public BaseManager(String name, int baseSalary, int quantityOfSubordinates) {
        super(name, baseSalary);
        this.quantityOfSubordinates = quantityOfSubordinates;
    }

    public int getQuantityOfSubordinates() {
        return quantityOfSubordinates;
    }

    public void setQuantityOfSubordinates(int quantityOfSubordinates) {
        this.quantityOfSubordinates = quantityOfSubordinates;
    }
}
