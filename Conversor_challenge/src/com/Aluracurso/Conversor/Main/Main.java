package com.Aluracurso.Conversor.Main;

import com.google.gson.Gson;
import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner teclado = new Scanner(System.in);


        while (true){

            System.out.println("""
                    Bienvenido/a a Alura Conversor
                    ¿Qué conversión te gustaría realizar?
                    
                    1. Dólar (USD) ---> Peso Argentino (ARS)
                    2. Peso Argentina (ARS) ---> Dólar (USD)
                    
                    3. Dólar (USD) ---> Real Brasileño (BRL)
                    4. Real Brasileño (BRL) ---> Dólar (USD)
                    
                    5. Dólar (USD) ---> Peso Colombiano (COP)
                    6.Peso Colombiano (COP) ---> Dólar (USD)
                    
                    Ingresar 0 para Salir
                    
                    Elegir una opción válida:
                    """);


            var lectura = teclado.nextInt();
            if (lectura == 0 ){
                break;
            }

        }






        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/7a396575634862e059fd0293/latest/COP"))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        var json = response.body();
    }

}
