

public class EmployeeWageComputation {


    public static final int FULL_TIME = 1;
    public static final int WAGE_PER_HOUR = 20;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        int workingHours = 0;
        int empWage = 0;
        int empCheck = (int) (Math.floor(Math.random() * 10) % 2);

        if (empCheck == FULL_TIME) {
            workingHours = 8;
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
         empWage = workingHours * WAGE_PER_HOUR;
        System.out.println("Employee Wage = " + empWage);
    }
}
