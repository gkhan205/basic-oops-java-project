package school.management.system;

import java.util.List;

/**
 * Created by Ghazi Khan on 25th August 2019
 * <p>
 * Many Teacher, Many Students.
 * Implements teachers and students using an ArrayList.
 */

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created
     * @param teachers list of teachers in school
     * @param students list of students in school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * @return the list of teachers in school
     */
    public List<Teacher> getTeacher() {
        return teachers;
    }

    /**
     * Add new teacher to the school
     * @param teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * @return the list of students in the school
     */
    public List<Student> getStudent() {
        return students;
    }

    /**
     * Add new student to the school
     * @param student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * @return totalMoneyEarned of the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school
     * @param moneyEarned to be added to totalMoneyEarned
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     * @return totalMoneySpent of the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Adds the total money spent by the school
     * @param moneySpent to be added to totalMoneySpent
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
