

public class EmployeeWageComputation {


    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        int workingHours = 0;
        int empWage = 0;
        int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

      /*  if (empCheck == FULL_TIME) {
            workingHours = 8;
            System.out.println("Employee is Present");
        }
        else if (empCheck == PART_TIME) {
            workingHours = 4;
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        } */

        switch(empCheck) {
            case FULL_TIME:
                workingHours = 8;
                System.out.println("Employee is Present");
                break;
            case PART_TIME:
                workingHours = 4;
                System.out.println("Employee is Present");
                break;
            default:
                workingHours = 0;
                System.out.println("Employee is Absent");
        }

         empWage = workingHours * WAGE_PER_HOUR;
        System.out.println("Employee Wage = " + empWage);
    }
}
