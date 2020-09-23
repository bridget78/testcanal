package org.example.model;

public class Address {

    private int addrId;

    private int subscriberId;

    private String street;

    private String adrLine2;

    private String zipCode;

    private String city;

    private String country;

    private boolean isMainAddr;

    private AddressStatus addressStatus;

    public Address() {
    }

    public int getAddrId() {
        return addrId;
    }

    public void setAddrId(int addrId) {
        this.addrId = addrId;
    }

    public int getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(int subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAdrLine2() {
        return adrLine2;
    }

    public void setAdrLine2(String adrLine2) {
        this.adrLine2 = adrLine2;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isMainAddr() {
        return isMainAddr;
    }

    public void setMainAddr(boolean mainAddr) {
        isMainAddr = mainAddr;
    }

    public AddressStatus getAddressStatus() {
        return addressStatus;
    }

    public void setAddressStatus(AddressStatus addressStatus) {
        this.addressStatus = addressStatus;
    }
}
