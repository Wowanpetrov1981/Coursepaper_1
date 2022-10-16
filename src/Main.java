import Coursepaper.Employee;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Petrov Ivan Sergeevich", 2, 40000);
        employee[1] = new Employee("Semenov Viktor Aleksandrovich", 2, 25000);
        employee[2] = new Employee("Ivanov Viktor Ivanjvich", 5, 10000);
        employee[3] = new Employee("Ivanova Galina Igorevna", 1, 150000);
        employee[4] = new Employee("Sidorov Sidor Sidorevich", 3, 23000);
        employee[5] = new Employee("Petrov Vladimir Alekseevich", 1, 200000);
        employee[6] = new Employee("Sharikov Sharik Sharikovich", 4, 15000);
        employee[7] = new Employee("Dmitriev Dmitri Dmitrievich", 4, 20000);
        employee[8] = new Employee("Alekseev Aleksei Alekseevich", 3, 32000);
        employee[9] = new Employee("Vasiliev Vasili Vasilievich", 5, 14000);

        System.out.println("Базовая сложность");
        listEmployee(employee);
        System.out.println();

        System.out.println("Сумма затрат на зарплаты в месяц составляет " + sumSalary(employee) + " рублей");

        maxSalary(employee);

        minSalary(employee);

        averageSalary(employee);
        System.out.println();

        listFullName(employee);
        System.out.println();

        System.out.println("Задание к билету №1");
        int[] playerNumbers = {8, 20, 24, 90, 91};
        sort(playerNumbers);
        System.out.println(Arrays.toString(playerNumbers));

        System.out.println();
        System.out.println("Повышенная сложность");
        }

    public static void listEmployee (Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    public static double sumSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    public static void maxSalary (Employee[] employees) {
        double max = 0;
        String employeeMax = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                employeeMax = employees[i].getFullName();
            }
        }
        System.out.println("Сотрудником с максимальной зарплатой является " + employeeMax);

    }
    public static void minSalary (Employee[] employees) {
        double min = 1000000000;
        String employeeMin = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                employeeMin = employees[i].getFullName();
            }
        }
        System.out.println("Сотрудником с мининмальной зарплатой является " + employeeMin);
    }
    public static double averageSalary (Employee[] employee) {
        double sum = sumSalary(employee);
        double average = sum / employee.length;
        System.out.println("Среднее значение зарплат - " + average + " рублей");
        return average;
    }
    public static void listFullName (Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFullName());
        }
    }

    public static void sort(int[] massive) {
        for (int i = 0; i < massive.length / 2; i++) {
            int tmp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = tmp;
        }
    }


}
