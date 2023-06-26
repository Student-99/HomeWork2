package ru.yandex;

import java.util.Random;

public class SerialInventory {
    private Long serialKey;
    private Sky sky;
    private Lot lot;
    private Loc loc;
    private static Long quantity = 0L;

    private SerialInventory() {

    }

    public SerialInventory(Sky sky, Lot lot, Loc loc) {
        this.serialKey = new Random().nextLong();
        this.sky = sky;
        this.lot = lot;
        this.loc = loc;
        quantity++;
    }

    public Long getSerialKey() {
        return serialKey;
    }

    public Sky getSky() {
        return sky;
    }

    public Lot getLot() {
        return lot;
    }

    public Loc getLoc() {
        return loc;
    }

    public static Long getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "SerialInventory{" +
            "serialKey=" + serialKey +
            ", sky=" + sky +
            ", lot=" + lot +
            ", loc=" + loc +
            ", quantity=" + quantity +
            '}';
    }
}
