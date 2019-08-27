package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melisa = new Teacher(2, "Melisa", 700);
        Teacher vander = new Teacher(3, "Vander", 400);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melisa);
        teacherList.add(vander);

        Student tamara = new Student(1, "Tamara", 5);
        Student jacob = new Student(2, "Jacob", 8);
        Student john = new Student(3, "John", 9);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamara);
        studentList.add(jacob);
        studentList.add(john);

        School euroSchool = new School(teacherList, studentList);

        Teacher megan = new Teacher(4, "Megan", 900);
        euroSchool.addTeacher(megan);

        tamara.payFees(5000);
        jacob.payFees(6000);
        john.payFees(8000);

        System.out.println("Euro School earned $" + euroSchool.getTotalMoneyEarned());

        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("Euro School has paid salary to " + lizzy.getName() + " and now has $" + euroSchool.getTotalMoneyEarned());

        melisa.receiveSalary(melisa.getSalary());
        System.out.println("Euro School has paid salary to " + melisa.getName() + " and now has $" + euroSchool.getTotalMoneyEarned());

        System.out.println(john);

        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("Euro School has paid salary to " + lizzy.getName() + " and now has $" + euroSchool.getTotalMoneyEarned());

        System.out.println(lizzy);

    }
}
