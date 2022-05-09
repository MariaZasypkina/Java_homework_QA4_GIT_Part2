package HW7;
public class EmployeeUtils {
public static Worker findWorkerByName(Worker[] workers, String name){
for (int i = 0; i < workers.length; i++) {
  if (name.equals(workers[i].getName())) {
      return workers[i];
  }
    }
return null;
}
    public static Worker findWorkerByNameSubName(Worker[] workers, String subName){
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().contains(subName)) {
                return workers[i];
            }
        }
        return null;
    }
    public static int salarySun(Worker[] workers){
    int sum = 0;
        for (int i = 0; i < workers.length; i++) {
           sum += workers[i].getSalary();
        }
        return sum;
    }
public static int maxSalary(Worker[] workers){
    int maxSal = 0;
    for (int i = 0; i < workers.length; i++){
        if (workers[i].getSalary() > maxSal) {
            maxSal = workers[i].getSalary();
        }
    }
    return maxSal;


}
public static int minSalary(Worker[] workers){
    int minSal = 0;
    for (int i = 1; i < workers.length; i++){
        minSal = workers[0].getSalary();
        if (workers[i].getSalary() < minSal){
            minSal = workers[i].getSalary();
        }
    }
    return minSal;
}

}


//поиск наименьшего количества подчиненных в массиве менеджеров
//поиск наибольшего количества подчиненных в массиве менеджеров
//поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
//поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров