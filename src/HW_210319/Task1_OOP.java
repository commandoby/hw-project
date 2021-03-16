package HW_210319;
/*Создайте класс Student, описывающий студента университета. В класс необходимо добавить:
    - конструктор, инициализирующий поля класса name, surname, dateOfBirthday, course.
    - геттеры и сеттеры для каждого поля.
    - метод printStudents(List students, int course), который получает список студентов и номер курса и
    печатает в консоль имена тех студентов из списка, которые обучаются на данном курсе.
    - для обхода списка студентов использовать цикл foreach.
Протестируйте работу класса Student.*/

public class Task1_OOP {
    public static void main(String[] args) {
        Student[] student = new Student[4];
        student[0] = new Student("Ivan", "Ivanov", "05.10.1996", 2);
        student[1] = new Student("Petr", "Petrov", "24.02.1995", 3);
        student[2] = new Student("Sidor", "Sidorov", "21.05.1992", 5);
        student[3] = new Student("Alexandr", "Alexandrov", "08.10.1339", 3);
        Student.printStudents(student, 3);
        System.out.printf("Студент %s %s %s года рождения учится на %d курсе.\n", student[2].getName(), student[2].getSurname(), student[2].getDataOfBirthday(), student[2].getCourse());
    }
}
