package com.company.codetext007;

import java.util.Arrays;

public class Hotel {
    Room[][] hotelRoom;

    public Hotel() {
        hotelRoom = new Room[3][10];
        for (int i = 0; i < hotelRoom.length; i++) {
            for (int j = 0; j < hotelRoom[i].length; j++) {
                if (i == 0) {
                    hotelRoom[i][j] = new Room((i + 1)*100+j+1,"单人间",true);
                }else if (i == 1) {
                    hotelRoom[i][j] = new Room((i + 1)*100+j+1,"双人间",true);
                }else if (i == 2) {
                    hotelRoom[i][j] = new Room((i + 1)*100+j+1,"总统套房",true);
                }
                //System.out.print(hotelRoom[i][j]);
            }
            //System.out.println();
        }
    }

    /**
     * 订房
     * @param num
     */
    public void order(int num) {
        hotelRoom[num/100 - 1][num%100 - 1].setStatus(false);
        System.out.println(num + "房间预定成功");
    }

    /**
     * 退房
     * @return
     */
    public void exit(int num) {
        hotelRoom[num/100 - 1][num%100 - 1].setStatus(true);
        System.out.println(num + "房间退房成功");
    }

    /**
     * 查看房间列表
     * @return
     */
    public void print() {
        for (int i = 0; i < hotelRoom.length; i++) {
            for (int j = 0; j < hotelRoom[i].length; j++) {
                System.out.print(hotelRoom[i][j]);
            }
            System.out.println();
        }
    }
    @Override
    public String toString() {
        return "Hotel{" +
                "hotelRoom=" + Arrays.toString(hotelRoom) +
                '}';
    }
}

