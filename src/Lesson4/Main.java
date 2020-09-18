package Lesson4;

public class Main {


    public static void main(String[] args) {
        Employee employee = new Employee("Chmil Yaroslav Aleksandrovich",5000,1993);
        System.out.println(employee.getName() + " " + employee.getAge());
        Employee [] employees = new Employee[5];
        employees[0] = new Employee("Artemkin Artem Artemovich",10000,1974);
        employees[1] = new Employee("Besedin Bogdan Bogdanovich",8000,1976);
        employees[2] = new Employee("Dedkov Denis Denisovich",9900,1971);
        employees[3] = new Employee("Pushkin Aleksandr Sergeevich",12500,1991);
        employees[4] = new Employee("Dostoevskiy Fedor Anatolievich",18500,1969);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 45){
                System.out.println(employees[i]);

            }
        }

    }
}
