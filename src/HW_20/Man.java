package HW_20;

import java.lang.reflect.Field;
import java.lang.reflect.TypeVariable;

public class Man {
    private String _name;
    private int _age;
    private double _weight;
    public Man(String name, int age, double weight) {
        _name = name;
        _age = age;
        _weight = weight;
    }

    public void classInfo()
    {
        Class manClassInfo = this.getClass();
        System.out.println("Name" + manClassInfo.getName());
        System.out.println("Fields:");
        for (Field field : manClassInfo.getDeclaredFields()) {
            try {
                System.out.printf("\tname: %s, value: %s\n", field.getName(), field.get(this));
            }
            catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }


    }
}
