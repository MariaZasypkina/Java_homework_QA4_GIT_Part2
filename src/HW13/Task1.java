package HW13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.Collections.list;

public class Task1 {
    public static void main(String[] args) {
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
    }

}

//Затем удалить из этого списка все цвета в которых встречается буква “L”