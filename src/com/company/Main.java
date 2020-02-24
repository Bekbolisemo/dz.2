package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(home(20,50));
    }
    public static String home(int age, int temperatur) {
        if (age > 20 && age < 45 && temperatur > -20 && temperatur < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperatur > 0 && temperatur > 28) {
            return "Можно идти гулять";
        } else if (age < 45 && temperatur < -10 && temperatur < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
