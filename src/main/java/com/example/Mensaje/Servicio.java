package com.example.Mensaje;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService (name = "Servicio", targetNamespace = "Utez")
@SOAPBinding (style = SOAPBinding.Style.RPC)
public class Servicio {

    @WebMethod (operationName = "devulveMensaje")
    public String devulveMensaje (@WebParam String valor){
        return "Hola "+valor;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7777/Servicio",new Servicio());
    }
}
