package com.company.codetext007;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        /*Room room = new Room(101,"单人间",true);
        System.out.println(room);*/
        System.out.println("欢迎使用本系统");
        while (true) {
            System.out.println("请输入编号选择对应的功能：1、查看房间列表 2、订房 3、退房 0、退出本系统");
            Scanner sc = new Scanner(System.in);
            System.out.print("编号为：");
            int num = sc.nextInt();
            if (num == 1) {
                hotel.print();
            } else if (num == 2) {
                System.out.print("请输入预定的房间号：");
                int a = sc.nextInt();
                hotel.order(a);
            } else if (num == 3) {
                System.out.print("请输入需要退订的房间号：");
                int b = sc.nextInt();
                hotel.exit(b);
            } else if (num == 0) {
                System.out.println("谢谢使用本系统，欢迎下次使用");
                return;
            } else {
                System.out.println("你输入的编号有误，请重新输入！");
            }
        }
    }
}
