package org.example.model;

public enum MovementType {

    CREAT_USER(1),
    MODIF_USER(2),
    MODIF_ADDR(3);

    public final int movTypeId;

    MovementType(int movTypeId) {
        this.movTypeId = movTypeId;
    }

    public static MovementType getMovTypeFromId(int movTypeId) {
        for (MovementType movType : MovementType.values()) {
            if (movType.movTypeId == movTypeId) {
                return movType;
            }
        }
        return null;
    }

}
