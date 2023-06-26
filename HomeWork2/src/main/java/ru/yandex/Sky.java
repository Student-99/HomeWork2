package ru.yandex;

import java.util.Random;

public class Sky {
    private Long serialKey;
    private Long storerKey;
    private String description;

    private Sky() {
    }

    public Sky( String description) {
        this.serialKey = new Random().nextLong();
        this.storerKey = new Random().nextLong();
        this.description = description;
    }

    public Long getSerialKey() {
        return serialKey;
    }

    public Long getStorerKey() {
        return storerKey;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Sky{" +
            "serialKey=" + serialKey +
            ", storerKey=" + storerKey +
            ", description='" + description + '\'' +
            '}';
    }

}
