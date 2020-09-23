package org.example.services;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.example.model.Address;
import org.example.model.AddressStatus;
import org.example.model.Subscriber;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SubscriberService {

    public static Subscriber getRandSubscriber(String addrStatus) throws IOException {
        // TODO: Move to server side.
        //HttpUriRequest request = new HttpGet("http://localhost:1080/getRandSubscriber");
        //HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
        //System.out.println(httpResponse.getEntity().getContent());

        Subscriber subscriber = new Subscriber();
        subscriber.setFirstName("John");
        subscriber.setLastName("Smith");

        Address address = new Address();
        int addrId = (int) (Math.random() * 100);
        address.setAddrId(addrId);
        address.setMainAddr(true);
        AddressStatus addressStatus = AddressStatus.getAddrStatusFromLabel(addrStatus);
        address.setAddressStatus(addressStatus);

        List<Address> addresses = new ArrayList<>();
        addresses.add(address);
        subscriber.setAddresses(addresses);

        return subscriber;
    }

    public static Address modifAddr(int operatorId, Address newAddress) {
        Address addr = new Address();
        return addr;
    }

}
