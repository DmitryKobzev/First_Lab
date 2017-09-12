package com.company;
import java.text.*;
import java.util.Scanner;

public class Act_ln {
    public void act_ln()throws Exception{
        NumberFormat formatter = NumberFormat.getNumberInstance();
        Scanner input = new Scanner (System.in);
        System.out.println("Введите значение x от (-1;1]");
        double x = input.nextDouble();
        if(x <= -1 || x > 1){
            throw new Exception("Неверное значение! Посмотрите в условие задания");
        }
        double sum = x;
        double temp = x;
        int index = 1;
        System.out.println("Введите натуральное число k");
        int k = input.nextInt();
        formatter.setMaximumFractionDigits(k);
        if(k<0)
        {
            throw new Exception("Неверное значение! k-натуральное число.");
        }
        double e=Math.pow(10,-k);
        double sum_standart =Math.log(1 + x);
        while (Math.abs(temp) > e) {
            temp=(temp *index*(-x))/(index+1);
            sum +=temp;
            index++;
        }
        System.out.println("sum(my function)="+formatter.format(sum));
        System.out.println("sum_standart(standart function)="+formatter.format(sum_standart));
    }
}
