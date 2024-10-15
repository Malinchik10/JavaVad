package HW13;

import java.util.HashMap;

public class MainMap {
    public static void main(String[] args) {

        Company company = new Company(
                new HashMap<String, Integer>()
                {{
                    put("HR", 10);
                    put("Finance", 5);
                    put("Development", 10);
                    put("Sales", 20);
                }});
        company.printEmploysCount();
        company.printDepartments();

        MapAnimals mapAnimals = new MapAnimals(
                new HashMap<Integer, String>(){{
            put(10, "Кот");
            put(5, "Собака");
            put(10, "Медведь");
            put(20, "Слон");
            put(5, "Панда");
            put(15, "Жираф");
            put(4, "Пингвин");
            put(20, "Бегемот");
            put(60, "Лев");
            put(5, "Пантера");
        }});

    }

}
