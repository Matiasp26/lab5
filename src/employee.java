package com.company;

public class employee {
    private int empNum;
    private String empName;
    private String empEmail;
    private double empHourRate;
    private int empCapacity;
    private int empFreeDays;

    public void setEmpNum(int emp) {
        empNum = emp;
    }

    public int getEmpNum(){
        return empNum;
    }

    public String getEmpName(){
        return empName;
    }

    public void setEmpName(String name){
        empName = name;
    }

    public String getEmpEmail(){
        return empEmail;
    }
    public void setEmpEmail(String email){
        empEmail = email;
    }
    public double getEmpHourRate(){
        return empHourRate;
    }
    public void setEmpHourRate(double rate){
        empHourRate = rate;
    }

    public int calculateDailyIncome(int empHourRate, int empCapacity){
        return empHourRate * empCapacity;
    }
    public int calculateMonthlyIncome(int empHourRate, int empCapacity){
        return 21 * (empHourRate * empCapacity);
    }
}