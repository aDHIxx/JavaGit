package com.bridgelabz;

public class calcDailyEmployeeWage {
    /**
     * @name: calculateDailyWage
     * @i/p: hoursWorked - the number of hours worked by the employee
     * @return/ o/p: the calculated daily wage
     */
    public static double calculateDailyWage(int hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }

    public static void main(String[] args) {
        double hourlyRate = 20.00;
        int hoursWorked = 8;
        double dailyWage = calculateDailyWage(hoursWorked, hourlyRate);
        System.out.println("Daily Employee Wage: " + dailyWage);
    }
}
