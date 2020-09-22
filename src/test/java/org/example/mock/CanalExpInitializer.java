package org.example.mock;

import org.mockserver.mock.Expectation;
import org.mockserver.server.initialize.ExpectationInitializer;

import static org.mockserver.model.Header.header;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

public class CanalExpInitializer implements ExpectationInitializer {

    //private ClientAndServer mockServer;

    //private MockServerClient mockServerClient = new MockServerClient("localhost", 1080);

    /*
    @Before
    public void startServer() {

        // Test Carine
        System.out.println("Test Carine - TestMockServer - startServer");

        mockServer = mockServer.startClientAndServer();

        mockServer.when(
                request()
                        .withMethod("GET")
                        .withPath("/getRandSubscriber")
                        .withHeaders(header("Host", "localhost:1080"),
                                header("Connection", "Keep-Alive"),
                                header("User-Agent", "Apache-HttpClient/4.5.12 (Java/11.0.1)"),
                                header("Accept-Encoding", "gzip,deflate"),
                                header("content-length", "0"))
                //.withBody("{username: 'foo', password: 'bar'}")
        )
                .respond(
                        response()
                                .withStatusCode(200)
                                //.withCookie(
                                //      "sessionId", "2By8LOhBmaW5nZXJwcmludCIlMDAzMW"
                                //)
                                //.withHeader(
                                //       "Location", "https://www.mock-server.com"
                                //)
                                .withBody("Test Carine - Coucou")
                );
    }

    @After
    public void stopServer() {
        mockServer.stop();
        //mockServerClient.stop();
    }
*/

    @Override
    public Expectation[] initializeExpectations() {
        // Test Carine
        System.out.println("Test Carine - TestMockServer - initializeExpectations");

        return new Expectation[]{
                new Expectation(request().withMethod("GET")
                        .withPath("/getRandSubscriber")
                        .withHeaders(header("Host", "localhost:1080"),
                                header("Connection", "Keep-Alive"),
                                header("User-Agent", "Apache-HttpClient/4.5.12 (Java/11.0.1)"),
                                header("Accept-Encoding", "gzip,deflate"),
                                header("content-length", "0"))).thenRespond(
                        response().withStatusCode(200).withBody("Test Carine - Coucou")
                )
        };
    }

    //...
}
