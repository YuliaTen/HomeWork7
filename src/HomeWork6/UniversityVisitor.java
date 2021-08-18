package HomeWork6;

import java.util.ArrayList;

public class UniversityVisitor {
    public static void main(String[] args) {
        Student student1 = new Student(2,"Petrov",20);
        Student student2 =new Student(1,"Werov",19);
        Employee employee1 = new Employee(10,"Setrov",45,"TeamLead");
        Employee employee2 = new Employee(5,"Orov",30,"Coder");
        System.out.println("\n");
        student1.passExam(student1.fio);
        employee2.drinkCoffee(employee2.fio);

        ArrayList<Object> visitors = new ArrayList<>();
        //добавляем людей
        visitors.add(student1);
        visitors.add(student2);
        visitors.add(employee1);
        visitors.add(employee2);
        //печатаем студентов
        printStudent(visitors);
        //печатаем работников
        printEmployee(visitors);
        //печатаем по фио
        printFio(visitors,"Orov");

    }

    public static void printStudent(ArrayList<Object> visitors){
        System.out.println("\n печатаем студентов");
        for (Object o: visitors){
            if (o instanceof Student){
                System.out.println(o);;
            }
        }
    }

    public static void printEmployee(ArrayList<Object> visitors){
        System.out.println("\n печатаем работников");
        for (Object o: visitors){
            if (o instanceof Employee){
                System.out.println(o);;
            }
        }
    }

    public static void printFio(ArrayList<Object> visitors, String fio){
        System.out.println("\n печатаем по предоставленному фио");
        for (Object o: visitors){
            if (o instanceof Employee){
                Employee e = (Employee) o;
                if (e.fio.equals(fio)){
                    System.out.println(o);
                }
            }
            else  if (o instanceof Student){
                Student s = (Student) o;
                if (s.fio.equals(fio)){
                    System.out.println(o);
                }
            }
       }
    }

}
