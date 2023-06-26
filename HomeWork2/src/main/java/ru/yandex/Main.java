package ru.yandex;

public class Main {
    public static void main(String[] args) {

        Loc loc = new Loc("Loc1", 11.1, 11.2, 11.3, 12, 13, 14, "HomeWork");
        Lot lot = new Lot("sky2",22L);

        SerialInventory serialInventory = SerialInventoryBuilder.builder()
            .withLoc(loc)
            .withLot(lot)
            .withSky("sky1")
            .build();

        System.out.println("SerialInventory = "+SerialInventory.getQuantity());
        System.out.println(serialInventory);
    }
}