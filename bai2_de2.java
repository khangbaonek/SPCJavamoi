/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class bai2_de2 {
    public static void main(String[] args) {
        System.out.println("chuong trinh tinh chu vi va dien tich hinh cau");
        Scanner sc = new Scanner(System.in);
        double d , S, V;
        System.out.println("nhap d:");
        d = sc.nextDouble();
        S =Math.PI * (d * d);
        System.out.println(" dien tich:" +   S);
        V = (Math.PI * (d*d*d)) /6;
        System.out.println("The tich:" + V);
        
    }
}