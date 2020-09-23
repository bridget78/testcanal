package org.example.model;

public enum AddressStatus {
    ACTIVE("active"),
    INACTIVE("inactive");

    public final String label;

    AddressStatus(String label) {
        this.label = label;
    }

    public static AddressStatus getAddrStatusFromLabel(String label) {
        for (AddressStatus addrStatus : AddressStatus.values()) {
            if (addrStatus.label.equalsIgnoreCase(label)) {
                return addrStatus;
            }
        }
        return null;
    }
}
