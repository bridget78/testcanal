package org.example.services;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

public class SubscriberService {

    public static void getRandSubscriber() throws IOException {
        HttpUriRequest request = new HttpGet("http://localhost:1080/getRandSubscriber");
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

        System.out.println(httpResponse.getEntity().getContent());
    }

}
