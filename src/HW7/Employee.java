package HW7;
public class Employee {
    int baseSalary;
    String name;

    public Employee(int baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

}

//Задача №3
//
//Необходимо создать утилитарный класс со следующими методами:
//поиск сотрудника в массиве по его имени
//поиск сотрудника в массиве по вхождению указанной строки в его имени
//подсчет зарплатного бюджета для всех сотрудников в массиве
//поиск наименьшей зарплаты в массиве
//поиск наибольшей зарплаты в массиве
//поиск наименьшего количества подчиненных в массиве менеджеров
//поиск наибольшего количества подчиненных в массиве менеджеров
//поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
//поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
