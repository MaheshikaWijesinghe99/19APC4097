package com.example.stringmanipulationservice;

import jakarta.xml.ws.Endpoint;

public class SoapServicePublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8080/StringManipulationService";
        Endpoint.publish(url, new StringManipulationServiceImpl());
        System.out.println("SOAP Web Service is running at: " + url + "?wsdl");
    }
}
