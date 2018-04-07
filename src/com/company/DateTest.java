package com.company;
public class DateTest {
    public static void main(String[] args){
        Date today = new Date(3,7,2018);
        Date tomorrow = new Date(8,2018);
        System.out.println("today is " + today.toString());
        System.out.println("tomorrow is " + tomorrow.toString());
        tomorrow.setDay(7);
        System.out.println("tomorrow is " + tomorrow.toString());
        System.out.println("today is again " + today.getMonth() + "/" + today.getDay() + "/" + today.getYear());
    }
}
