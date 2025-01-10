public class Employee {
    String name;
    int id;
    boolean attendance= false;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;

    static final int PART_TIME_HOURS = 4;
    static final int WORKING_DAYS=20;


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



    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
}
