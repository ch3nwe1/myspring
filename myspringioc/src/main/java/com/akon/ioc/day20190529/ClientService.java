package com.akon.ioc.day20190529;

public class ClientService {

    public static ClientService clientService = new ClientService();

    public static ClientService createInstance(){
        return clientService;
    }

}
