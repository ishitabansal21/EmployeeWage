import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee e1=  new Employee("Ram",123);
        Random r = new Random();

       int i = (r.nextInt(1000))%2;
        //int attendanceType = r.nextInt(3);
        switch (i) {
            case 1 -> {
                e1.attendance(true);
                System.out.println("1:Full Time wage \n 2:Part Time wage \n 3:Monthly Wage \n4: Calculate Wages Till Condition \n 5: Compute Employee Wage for Multiple Companies" );
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter choice:");
                int input=sc.nextInt();
                switch (input){
                    case 1 ->e1.calculateDailyWage("full-time");
                    case 2 ->e1.calculateDailyWage("part-time");
                    case 3 ->e1.calculateDailyWage("monthly");
                    case 4 -> e1.calculateWagesTillCondition();
                    case 5 -> {
                        System.out.println("Enter Company Details:");
                        System.out.println("Company Name:");
                        String companyName = sc.next();
                        System.out.println("Wage Per Hour:");
                        int wagePerHour = sc.nextInt();
                        System.out.println("Max Working Hours Per Month:");
                        int maxWorkingHours = sc.nextInt();
                        System.out.println("Number of Working Days:");
                        int workingDays = sc.nextInt();

                        e1.computeWageForCompany(companyName, wagePerHour, maxWorkingHours, workingDays);
                    }
                    default -> System.out.println("Enter correct option");
                }


            }

            default -> e1.attendance(false);
        }
    }
}