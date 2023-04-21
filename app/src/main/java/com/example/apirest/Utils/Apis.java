package com.example.apirest.Utils;

public class Apis {

    public static final String URL_001="http://192.168.10.23:8080/personas/";

    public static PersonaService getPersonaService(){
        return  Cliente.getClient(URL_001).create(PersonaService.class);
    }
}
