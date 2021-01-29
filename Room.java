package com.company.codetext007;

import java.util.Objects;

/**
 * 创建房间对象
 * 供用户预定房间
 */
public class Room {
    private int id;//房间编号
    private String type;//房间类型
    private boolean status;//房间状态

    public Room() {
    }

    public Room(int id, String type, boolean status) {
        this.id = id;
        this.type = type;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" +
                "房号：" + id +
                ", 类型'" + type + '\'' +
                ", 状态" + (status ? "空闲" : "有客") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return id == room.id &&
                status == room.status &&
                type.equals(room.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, status);
    }
}
