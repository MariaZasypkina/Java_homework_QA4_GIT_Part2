package HW13;

import java.util.ArrayList;
import java.util.List;

public class Tasks1_2_3 {
    public static void main(String[] args) {
//Task1
        List<String>list = new ArrayList<>();
        list.add("White.");
        list.add("Tan.");
        list.add("Yellow.");
        list.add("Orange.");
        list.add("Red.");
        list.add("Pink.");
        list.add("Purple.");
        list.add("Blue.");

        System.out.println(list);

        for (int i = list.size()-1; i >=0; i--){
            if (list.get(i).contains("l")){
                list.remove(i);
            }
        }

        System.out.println(list);

//Task2
//Создать лист со значениями от 100 до 1000.

        List <Integer> list1 = new ArrayList<>();
        for (int i = 100; i <=1000; i++){
            list1.add(i);
        }

        System.out.println(list1);

//Task3
//Удалить из листа, созданного в предыдущей задаче, все четные элементы.

        for (int i = 0; i < list1.size(); i++){
            if(list1.get(i)%2==0){
                list1.remove(i);
            }
        }

        System.out.println(list1);

//Task4
//Попробуйте изменить тип итерационной переменной из цикла, в третьей задаче, на Integer (не int, а Integer) и добиться
// такого же результата как и с типом int.

        List <Integer> list2 = new ArrayList<>();
        for (Integer i = 100; i <=1000; i++){
            list2.add(i);
        }
        System.out.println(list2);
        for (Integer i = list2.size()-1; i >=0; i--){
            if(list2.get(i)%2==0){
                list2.remove(i.intValue());
            }
        }
        System.out.println(list2);
    }
}
