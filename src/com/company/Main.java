package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("======CHUONG TRINH TINH TOAN DON GIAN========");
        Scanner read = new Scanner(System.in);
        int chose = 1;
        do {
            System.out.println("nhap vao so nguyen a:");
            int a = read.nextInt();
            System.out.println("nhap so nguyen b:");
            int b = read.nextInt();

            read.nextLine();
            System.out.println("nhap phep tinh: ");
            String s = read.nextLine();

            if(s.isEmpty())
            {
                System.out.println("ko co phep tinh!");
            }
            else
            {
                float kq = tinhToan(a,b,s);
                System.out.println("ket qua: "+kq);
            }
            System.out.println("Ban co muon tiep tuc: 1: Co || 0: Thoat");
            chose = read.nextInt();
            if(chose != 1){
                System.out.println("Thoat chuong trinh tinh toan");
                break;
            }

        }while (chose == 1);

    }
    private static float tinhToan(int a, int b, String s){
        float kq = 0;
            switch (s)
            {
                case "+":
                    kq = timTong(a,b);
                    break;
                case "-":
                    kq = timHieu(a,b);
                    break;
                case "*":
                    kq = timTich(a,b);
                    break;
                case "/":
                    kq = timThuong(a,b);
                    break;
                default:
                    break;
            }
        return kq;
    }

    private static float timThuong(int a, int b) {
        float div = 0;
        div = (float) a / b;
        return div;
    }

    private static int timTich(int a, int b) {
        int t = 0;
        t = a * b;
        return t;
    }

    private static int timHieu(int a, int b) {
        int h = 0;
        h = a - b;
        return h;
    }

    private static int timTong(int a, int b) {
        int s = 0;
        s = a + b;
        return s;
    }
}
