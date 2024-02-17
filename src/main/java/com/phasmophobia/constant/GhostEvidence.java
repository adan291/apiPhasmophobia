package com.phasmophobia.constant;

public enum GhostEvidence {
    EMF_LEVEL_5("EMF Level 5"),
    FINGERPRINTS("Fingerprints"),
    FREEZING_TEMPERATURES("Freezing Temperatures"),
    GHOST_ORB("Ghost Orb"),
    SPIRIT_BOX("Spirit Box"),
    GHOST_WRITING("Ghost Writing"),
    UV_FLASHLIGHT("UV Flashlight"),
    DOTS_PROJECTOR("D.O.T.S. Projector"),
    ;

    private final String displayName;

    GhostEvidence(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

