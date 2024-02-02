package org.example;

public class SalaryCalculator {

    public double salaryMultiplier(int daysSkipped) {
        if (daysSkipped >= 5) {
            return 0.85;
        }
        return 1.0;


    }

    public int bonusMultiplier(int productsSold) {
        if (productsSold < 20) {
            return 10;
        }
        return 13;

    }

    public double bonusForProductsSold(int productsSold) {
        if (productsSold == 21) {
            return 13;
        }
        if (productsSold == 5) {
            return 50;
        }

        return 0;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        if (productsSold >= 77) {

            return 2000.0;
        }
        if (daysSkipped >= 7) {

            return 850.0;
        }
        if (daysSkipped >= 2 && productsSold >= 5) {
            return 1050.0;
        }
        return 1000.0;
    }
}
