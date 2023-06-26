package ru.yandex;

import java.util.Random;

public class Loc {

    public Long serialKey;
    public String name;
    public Double length;
    public Double width;
    public Double height;
    public int x;
    public int y;
    public int z;
    public String zone;

    private Loc(){

    }

    public Loc(
        String name,
        Double length,
        Double width,
        Double height,
        int x,
        int y,
        int z,
        String zone
    ) {
        this.serialKey = new Random().nextLong();
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.z = z;
        this.zone = zone;
    }

    public Long getSerialKey() {
        return serialKey;
    }

    public String getName() {
        return name;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public String getZone() {
        return zone;
    }

    @Override
    public String toString() {
        return "Loc{" +
            "serialKey=" + serialKey +
            ", name='" + name + '\'' +
            ", length=" + length +
            ", width=" + width +
            ", height=" + height +
            ", x=" + x +
            ", y=" + y +
            ", z=" + z +
            ", zone='" + zone + '\'' +
            '}';
    }
}
