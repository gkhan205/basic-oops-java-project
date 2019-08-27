package school.management.system;

/**
 * Created by Ghazi Khan on 25th August 2019
 * <p>
 * This class is responsible for keeping the track of
 * fees, name, grade & fees paid.
 */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new Student Object by initializing the value.
     * Fees for every student is $30000/year.
     * Fees paid initially is 0.
     *
     * @param id    id for the student: unique.
     * @param name  name of the student.
     * @param grade grade of the student.
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        feesPaid = 0;
        feesTotal = 30000;
    }

    // Not goind to alter student's id & name so we don't need functions to alter them.

    /**
     * Used to update the student's grade
     *
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to the feesPaid field.
     * Add the fees to the fees paid.
     * The school is going to receive the funds.
     *
     * @param fees new fees that student pays
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(fees);
    }

    /**
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * @return grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @return feesPaid of the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }


    /**
     * @return feesTotal of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * @return the remaining fees of the student
     */
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name is " + name +
                " Total fees paid so far $" + feesPaid;
    }
}
