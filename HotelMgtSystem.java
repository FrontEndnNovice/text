package com.company.codetext007;

/**
 * 酒店管理系统，模拟订房、退房、打印所有房间的状态等功能、
 *  1、该系统的用户是：酒店前台。
 *  2、酒店使用一个二维数组来模拟、“Room[][] rooms；”
 *  3、酒店中的每一个房间应该是一个java对象： Room
 *  4、每一个房间应该有：房间编号、房间类型、房间是否空闲。
 *  5、系统应该对外提供的功能：
 *      可以预定房间：用户输入房间编号、订房。
 *      可以退房：用户输入房间编号、退房。
 *      可以查看所有房间的状态：用户输入摸个指令应该可以查看所有房间的状态。
 *
 */
public class HotelMgtSystem {
    private Room[][] hotelRoom;//代表酒店房间数组

    public Room[][] getHotelRoom() {
        return hotelRoom;
    }

    public void setHotelRoom(Room[][] hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

}

