public class EmpWageBuilder {
    private String companyName;
    private int wagePerHour;
    private int maxWorkingHours;
    private int workingDays;
    private int totalWage;

    public EmpWageBuilder(String companyName, int wagePerHour, int maxWorkingHours, int workingDays) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingHours = maxWorkingHours;
        this.workingDays = workingDays;
        this.totalWage = 0;
    }

    public void computeWages() {
        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < maxWorkingHours && totalDays < workingDays) {
            int dailyHours = (int) (Math.random() * 2) == 1 ? 8 : 4;
            if (totalHours + dailyHours > maxWorkingHours) {
                dailyHours = maxWorkingHours - totalHours;
            }
            totalHours += dailyHours;
            totalDays++;
            int dailyWage = wagePerHour * dailyHours;
            totalWage += dailyWage;

            System.out.println("Day " + totalDays + ": Worked " + dailyHours + " hours. Daily Wage: " + dailyWage);
        }
    }

    public void displayTotalWage() {
        System.out.println("\nCompany: " + companyName);
        System.out.println("Total Wage for the Month: " + totalWage);
    }
}
