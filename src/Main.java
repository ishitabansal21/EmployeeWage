import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee e1=  new Employee("Ram",123);
        Random r = new Random();
       // int i = (r.nextInt(1000))%2;
        int attendanceType = r.nextInt(3);
        switch (attendanceType) {
            case 1 -> {
                e1.attendance(true);
                e1.calculateDailyWage("full-time");
            }
            case 2 -> {
                e1.attendance(true);
                e1.calculateDailyWage("part-time");
            }
            default -> e1.attendance(false);
        }
    }
}