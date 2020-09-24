package org.example.model;

public class Movement {
    private int id;

    private int subscriberId;

    private MovementType movType;

    private int createdBy;

    public Movement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(int subscriberId) {
        this.subscriberId = subscriberId;
    }

    public MovementType getMovType() {
        return movType;
    }

    public void setMovType(MovementType movType) {
        this.movType = movType;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }
}
