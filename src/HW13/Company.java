package HW13;

import java.util.HashMap;

public class Company {
    private HashMap<String, Integer> departments;
      public Company(HashMap<String, Integer> departments) {
        this.departments = departments;
    }
      public void printEmploysCount() {
        int totalCount = 0;
        for (int count : this.departments.values()) {
            totalCount += count;
        }

        System.out.println("Количество сотрудников: " + totalCount);
    }

    public void printDepartments() {
        System.out.println("Список департаментов: ");
        for (String department : this.departments.keySet())
        {
            System.out.println("\t" + department);
        }
    }
}
