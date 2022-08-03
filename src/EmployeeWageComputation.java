

public class EmployeeWageComputation {


    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int WORKING_DAYS = 20;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        int workingHours = 0;
        int empWage = 0;
        int totalWage = 0;

        for (int i=1; i<=20; i++) {
            System.out.println("Day - " + i);
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
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
            totalWage = totalWage + empWage ;
        }
        System.out.println("Total Employee Wage For a Month = " + totalWage);
    }
}
