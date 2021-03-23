package HW_210319;

public class Student {

    //Объявляем переменные
    private String name;
    private String surname;
    private String dataOfBirthday;
    private int course;

    //Создаем геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDataOfBirthday() {
        return dataOfBirthday;
    }

    public void setDataOfBirthday(String dataOfBirthday) {
        this.dataOfBirthday = dataOfBirthday;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    //Создаем конструктор
    public Student(String name, String surname, String dataOfBirthday, int curse) {
        this.name = name;
        this.surname = surname;
        this.dataOfBirthday = dataOfBirthday;
        this.course = curse;
    }

    //Метод вывода списка студентов одного курса
    public static void printStudents(Student[] students, int course) {
        System.out.printf("На %d курсе учатся следующие студенты:\n", course);
        for (int i = 0; i < students.length; i++) {
            if (students[i].course == course) {
                System.out.println(students[i].name);
            }
        }
    }
}
