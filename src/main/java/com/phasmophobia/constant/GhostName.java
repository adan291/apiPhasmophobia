package com.phasmophobia.constant;

public enum GhostName {
    SPIRIT("Spirit"),
    WRAITH("Wraith"),
    PHANTOM("Phantom"),
    POLTERGEIST("Poltergeist"),
    BANSHEE("Banshee"),
    JINN("Jinn"),
    MARE("Mare"),
    REVENANT("Revenant"),
    SHADE("Shade"),
    DEMON("Demon"),
    YUREI("Yurei"),
    ONI("Oni"),
    HANTU("Hantu"),
    YOKAI("Yokai"),
    GORYO("Goryo"),
    MYLING("Myling"),
    DEOGEN("Deogen");

    private final String displayName;

    GhostName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

