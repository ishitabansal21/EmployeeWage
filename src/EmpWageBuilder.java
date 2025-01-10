import java.util.ArrayList;
import java.util.List;

public class EmpWageBuilder {
    private final List<CompanyEmpWage> companyEmpWageList;

    public EmpWageBuilder() {
        companyEmpWageList = new ArrayList<>();
    }

    public void addCompanyEmpWage(String companyName, int wagePerHour, int maxWorkingHours, int workingDays) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHour, maxWorkingHours, workingDays);
        companyEmpWageList.add(companyEmpWage);
    }

    public void computeWages() {
        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
            int totalWage = computeWageForCompany(companyEmpWage);
            companyEmpWage.setTotalWage(totalWage);
        }
        displayAllWages();
    }

    public void displayAllWages() {
        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
            System.out.println("Company: " + companyEmpWage.getCompanyName() + ", Total Wage: " + companyEmpWage.getTotalWage());
        }
    }

    private int computeWageForCompany(CompanyEmpWage companyEmpWage) {
        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        while (totalHours < companyEmpWage.getMaxWorkingHours() && totalDays < companyEmpWage.getWorkingDays()) {
            int dailyHours = (int) (Math.random() * 2) == 1 ? 8 : 4;
            if (totalHours + dailyHours > companyEmpWage.getMaxWorkingHours()) {
                dailyHours = companyEmpWage.getMaxWorkingHours() - totalHours;
            }
            totalHours += dailyHours;
            totalDays++;
            totalWage += dailyHours * companyEmpWage.getWagePerHour();
        }

        return totalWage;
    }
}
