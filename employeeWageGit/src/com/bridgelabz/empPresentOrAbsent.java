package com.bridgelabz;

public class empPresentOrAbsent {
    /**
     * @desc: check employee attendance.
     * @return/ o/p: present or absent.
     */
    public static void main(String[] args) {
        int attendanceStatus = (int) (Math.random() * 2);
        if (attendanceStatus == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
