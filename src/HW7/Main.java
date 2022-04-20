package HW7;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker(6000, "Maria");
        Manager manager = new Manager(6000, "MariaZ", 100);
        Director director = new Director(6000, "M.Zasypkina", 101);
        System.out.println(worker.getSalary());
        System.out.println(manager.getSalary());
        System.out.println(director.getSalary());


    }
}
