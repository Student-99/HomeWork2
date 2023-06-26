package ru.yandex;

public class SerialInventoryBuilder {
    private Sky sky;
    private Lot lot;
    private Loc loc;

    public static SerialInventoryBuilder builder() {
        return new SerialInventoryBuilder();
    }

    private SerialInventoryBuilder() {
    }

    public SerialInventoryBuilder withSky(String sky) {
        this.sky = new Sky(sky);
        return this;
    }

    public SerialInventoryBuilder withLot(Lot lot) {
        this.lot = lot;
        return this;
    }

    public SerialInventoryBuilder withLoc(Loc loc) {
        this.loc = loc;
        return this;
    }

    public SerialInventory build() {
        return new SerialInventory( sky, lot, loc);
    }

}
