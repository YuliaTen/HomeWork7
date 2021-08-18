package HomeWork6;

public class Student extends UniversityVisitor{
    int kurs;
    String fio;
    int age;

    public Student(int kurs, String fio, int age) {
        this.kurs = kurs;
        this.fio = fio;
        this.age = age;
    }


    public void passExam(String fio){
        System.out.println(String.format("%s сегодня сдает экзмен",fio));
    }

    public void walkCouple(String fio){
        System.out.println(String.format("%s сегодня прогулял пару",fio));
    }

    @Override
    public String toString() {
        return "Student{" +
                "kurs=" + kurs +
                ", fio='" + fio + '\'' +
                ", age=" + age +
                '}';
    }
}
