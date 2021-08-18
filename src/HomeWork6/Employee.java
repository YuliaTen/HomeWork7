package HomeWork6;

public class Employee extends UniversityVisitor{
    int experience;
    String fio;
    int age;
    String position;

    public Employee(int experience, String fio, int age, String position) {
        this.experience = experience;
        this.fio = fio;
        this.age = age;
        this.position = position;
    }


    public void drinkCoffee(String fio){
        System.out.println(String.format("Сотрудник, %s, решил выпить кофе", fio));
    }

    public void conductLesson(){
        System.out.println("Lesson start");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "experience=" + experience +
                ", fio='" + fio + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}
