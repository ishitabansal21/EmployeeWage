public class CompanyEmpWage {
    private final String companyName;
    private final int wagePerHour;
    private final int maxWorkingHours;
    private final int workingDays;
    private int totalWage;

    public CompanyEmpWage(String companyName, int wagePerHour, int maxWorkingHours, int workingDays) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingHours = maxWorkingHours;
        this.workingDays = workingDays;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public int getTotalWage() {
        return totalWage;
    }
}
