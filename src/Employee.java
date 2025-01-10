import java.util.Random;
public class Employee {
    String name;
    int id;
    boolean attendance= false;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;

    static final int PART_TIME_HOURS = 4;
    static final int WORKING_DAYS=20;
    static final int MAX_WORKING_HOURS = 100;


    public void attendance(boolean a){
        if(a){
            attendance = true;
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }


    public void calculateDailyWage(String workType) {
        if (attendance) {
            int hoursWorked = switch (workType) {
                case "full-time" -> FULL_DAY_HOURS;
                case "part-time" -> PART_TIME_HOURS;
                case "monthly"   -> FULL_DAY_HOURS*WORKING_DAYS;
                default -> 0;
            };

            int dailyWage = WAGE_PER_HOUR * hoursWorked;
            System.out.println("Work Type: " + workType);

            System.out.println("Daily Wage of the employee: " + dailyWage);
        } else {
            System.out.println("No wage as the employee is absent.");
        }
    }

    public void calculateWagesTillCondition() {
        if (attendance) {
            int totalHours = 0;
            int totalDays = 0;
            int totalWage = 0;

            Random random = new Random();

            while (totalHours < MAX_WORKING_HOURS && totalDays < WORKING_DAYS) {
                int dailyHours = random.nextInt(2) == 1 ? FULL_DAY_HOURS : PART_TIME_HOURS; // Randomly assign full-time or part-time
                if (totalHours + dailyHours > MAX_WORKING_HOURS) {
                    dailyHours = MAX_WORKING_HOURS - totalHours; // Adjust hours if exceeding limit
                }
                totalHours += dailyHours;
                totalDays++;
                totalWage += WAGE_PER_HOUR * dailyHours;

                System.out.println("Day " + totalDays + ": Worked " + dailyHours + " hours. Total Hours: " + totalHours + ". Daily Wage: " + (WAGE_PER_HOUR * dailyHours));
            }

            System.out.println("Total Days Worked: " + totalDays);
            System.out.println("Total Hours Worked: " + totalHours);
            System.out.println("Total Wage for the Month: " + totalWage);
        } else {
            System.out.println("No wage as the employee is absent.");
        }
    }



    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
}
