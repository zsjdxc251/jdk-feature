package com.example.feature.jdk11.http;

import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author zhengshijun
 * @version created on 15/04/19.
 */
public class HttpRequestApplication {


    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
//        var request = HttpRequest.newBuilder().uri(new URI("http://www.baidu.com")).GET().build();
//        var client = HttpClient.newHttpClient();
//
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//
//        System.out.println(response.body());


        async();

        Thread.currentThread().join();
    }


    public static void async(){

        var request = HttpRequest.newBuilder()
                .header("a","b").POST(HttpRequest.BodyPublishers.ofString("hi demo"))
                .uri(URI.create("http://baidu.com")).build();

        var client = HttpClient.newBuilder().authenticator(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {

                return super.getPasswordAuthentication();
            }
        }).build();

        client.sendAsync(request,HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println);

    }
}
