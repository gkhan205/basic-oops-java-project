package school.management.system;

/**
 * Created by Ghazi Khan on 25th August 2019
 * <p>
 * This class is responsible for keepting the track of
 * teacher's name, id, salary
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    /**
     * Creates a new Teacher object.
     *
     * @param id     id for the teacher
     * @param name   name of the teacher
     * @param salary salary of the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * @return id of teacher
     */
    public int getId() {
        return id;
    }

    /**
     * @return name of the teacher
     */
    public String getName() {
        return name;
    }

    /**
     * @return salary of the teacher
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Used to set the salary for the teacher
     *
     * @param salary new salary for teacher
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Adds to salaryEarned.
     * Removes from the total money earned from school.
     *
     * @param salary to be received
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's name is " + name +
                " Total salary earned so far $" + salaryEarned;
    }
}
