/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.SwingConstants;
/**
 *
 * @author Administrator
 */
public class bai1_de2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong  so Fibonacci muon hien thi:");
        int N = scanner.nextInt();
        
        ArrayList<Integer>FibonacciList = new ArrayList<>();
        int a = 0, b = 1;
        
        System.out.println("Day Fibonacci");
        for(int i = 0; i < N; i++){
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;
            
        }
        int sum = 0;
        for (int num : FibonacciList) {
            sum += num;
        }
        System.out.println("\nTong:" + sum);
        scanner.close();
    }
}