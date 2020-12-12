/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Date;

/**
 *
 * @author trado006
 */
public class DatePlus {
    Date d;
    int year;
    int month;
    int day;
    public static void main(String args[]){
        String str = "2017-09-11";
        Date d = Date.valueOf(str);
        System.out.println(d.toString());
        DatePlus dp = new DatePlus(d);
        System.out.printf(dp.getYear()+" "+dp.getMonth()+" "+dp.getDay()+"\n");
    }
    public DatePlus(Date d){
        this.d = d;
        String full = d.toString();
        String words[] = full.split("-");
        year = Integer.parseInt(words[0]);
        month = Integer.parseInt(words[1]);
        day = Integer.parseInt(words[2]);
    }

    public Date getD() {
        return d;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    
}
