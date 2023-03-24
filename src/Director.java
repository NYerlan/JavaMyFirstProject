public class Director extends BaseManager {

    public Director(String name, int baseSalary, int quantityOfSubordinates) {
        super(name, baseSalary, quantityOfSubordinates);
    }

    public int getSalaryManager() {
        if (getQuantityOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return (int)(getBaseSalary() * (getQuantityOfSubordinates() / 100 * 9));
        }
    }
}
