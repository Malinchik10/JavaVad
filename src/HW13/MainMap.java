package HW13;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {

        Company company = new Company(
                new HashMap<String, Integer>() {{
                    put("HR", 10);
                    put("Finance", 5);
                    put("Development", 10);
                    put("Sales", 20);
                }});
        company.printEmploysCount();
        company.printDepartments();

        HashMap<Integer, String> mapAnimals = new HashMap<Integer, String>();
        mapAnimals.put(0, "Кот");
        mapAnimals.put(2, "Собака");
        mapAnimals.put(10, "Медведь");
        mapAnimals.put(6, "Слон");
        mapAnimals.put(80, "Панда");
        mapAnimals.put(15, "Жираф");
        mapAnimals.put(4, "Пингвин");
        mapAnimals.put(20, "Бегемот");
        mapAnimals.put(60, "Лев");
        mapAnimals.put(5, "Пантера");

        for (Map.Entry entry : mapAnimals.entrySet()) {
            Integer key = (Integer) entry.getKey();
            if (key > 5) {
                System.out.println(key);

            }

        }
        if (mapAnimals.containsKey(0)) {
            System.out.println(mapAnimals.values());
            String result = String.join(", ", mapAnimals.values());
            System.out.println(result);

        }
        int a = 1;
        int b = 1;
        for (Map.Entry entry : mapAnimals.entrySet()) {//entrySet(все пары ключ значение)  for each - для каждой пары
            String forAnimal = (String) entry.getValue();
            Integer size = forAnimal.length();
            if (size > 5) {
               b = (Integer) entry.getKey()*b;
                System.out.println(b);
            }

            if (entry.getValue().toString().length()>5){
                a = ((Integer) entry.getKey())*a;
                System.out.println(a);
            }


        }

    }
}
