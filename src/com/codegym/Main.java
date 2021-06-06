package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float weight;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap can nang co the (kg)");
        weight = scanner.nextFloat();
        System.out.println("nhap chieu cao co the (meter)");
        height = scanner.nextFloat();
        float bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("ban thuoc Underweight");
        }
        if (18.5 < bmi && bmi < 25.0) {
            System.out.println("ban thuoc normal");
        }
        if (25.0 <= bmi && bmi < 30.0) {
            System.out.println("ban thuoc overweight");
        }
        if (bmi >= 30.0) {
            System.out.println("ban thuoc obese");
        }
    }
}
