package ru.yandex;

import java.util.Random;

public class Lot {
    private Long serialKey;
    private Sky sky;
    private Long quantity;

    public Lot( String sky, Long quantity) {
        this.serialKey = new Random().nextLong();
        this.sky = new Sky(sky);
        this.quantity = quantity;
    }

    public Long getSerialKey() {
        return serialKey;
    }

    public Sky getSky() {
        return sky;
    }

    public Long getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Lot{" +
            "serialKey=" + serialKey +
            ", sky=" + sky +
            ", quantity=" + quantity +
            '}';
    }
}
