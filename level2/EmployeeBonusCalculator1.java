import java.util.Scanner;

public class EmployeeBonusCalculator1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();
            
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            double years = scanner.nextDouble();
            
            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
                continue;
            }
            
            salaries[i] = salary;
            yearsOfService[i] = years;
        }
        
        for (int i = 0; i < 10; i++) {
            double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];
            
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        
        System.out.println("\nEmployee Salary Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + " - Old Salary: " + salaries[i] + ", Bonus: " + bonuses[i] + ", New Salary: " + newSalaries[i]);
        }
        
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        input.close();
	}
}
