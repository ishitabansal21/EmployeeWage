public class Employee {
    String name;
    int id;
    boolean attendance= false;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;

    public void attendance(boolean a){
        if(a){
            attendance = true;
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }

    public void calculateDailyWage() {
        if (attendance) {
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
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
