package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {

    private int subscriberId;

    private String firstName;

    private String lastName;

    private List<Address> addresses = new ArrayList<>();

    public int getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(int subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Address getMainAddress() {
        for (Address addr : addresses) {
            if (addr.isMainAddr()) {
                return addr;
            }
        }

        return null;
    }
}
