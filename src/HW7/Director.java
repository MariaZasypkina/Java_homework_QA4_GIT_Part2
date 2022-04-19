package HW7;
public class Director extends Manager {

    public Director(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    public int getSalary(){
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() * (getNumberOfSubordinates() / 100 * 9);
        }
    }
}
