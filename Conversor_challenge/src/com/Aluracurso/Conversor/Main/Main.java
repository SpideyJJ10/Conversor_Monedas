package com.Aluracurso.Conversor.Main;

import com.Aluracurso.Conversor.Moneda.Moneda;
import com.Aluracurso.Conversor.Moneda.MoneyEx;
import com.google.gson.Gson;
import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.function.Function;

public class Main {


    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner teclado = new Scanner(System.in);


        while (true){

            System.out.println("""
                    ******************************************

                    Bienvenido/a a Alura Conversor
                    ¿Qué conversión te gustaría realizar?

                    1. Dólar (USD) ---> Peso Argentino (ARS)
                    2. Peso Argentina (ARS) ---> Dólar (USD)

                    3. Dólar (USD) ---> Real Brasileño (BRL)
                    4. Real Brasileño (BRL) ---> Dólar (USD)

                    5. Dólar (USD) ---> Peso Colombiano (COP)
                    6.Peso Colombiano (COP) ---> Dólar (USD)

                    Ingresar 0 para Salir

                    *******************************************

                    Elegir una opción válida:

                    *******************************************
                    """);
            var lectura = teclado.nextInt();

            if (lectura == 1){

             var moneda1 = "USD";
             var moneda2 = "ARS";

                var direccion = "https://v6.exchangerate-api.com/v6/7a396575634862e059fd0293/pair/" + moneda1 + "/" + moneda2;

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                var json = response.body();

                Gson gson = new Gson();

                Moneda mimoneda = gson.fromJson(json, Moneda.class);

                System.out.println("Ingresar valor a convertir: ");
                var cantidad = teclado.nextInt();
                mimoneda.setCantidad(cantidad);

 
                System.out.println("""
                        ****************************************
                        """);

                mimoneda.convertir();

                System.out.println("""

                        ****************************************
                        """);

            }
            else if (lectura == 2) {
                var moneda1 = "ARS";
                var moneda2 = "USD";

                var direccion = "https://v6.exchangerate-api.com/v6/7a396575634862e059fd0293/pair/" + moneda1 + "/" + moneda2;

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                var json = response.body();

                Gson gson = new Gson();

                Moneda mimoneda = gson.fromJson(json, Moneda.class);

                System.out.println("Ingresar valor a convertir: ");
                var cantidad = teclado.nextInt();
                mimoneda.setCantidad(cantidad);


                System.out.println("""
                        ****************************************
                        """);

                mimoneda.convertir();

                System.out.println("""

                        ****************************************
                        """);
            }
            else if (lectura == 3) {
                var moneda1 = "USD";
                var moneda2 = "BRL";

                var direccion = "https://v6.exchangerate-api.com/v6/7a396575634862e059fd0293/pair/" + moneda1 + "/" + moneda2;

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                var json = response.body();

                Gson gson = new Gson();

                Moneda mimoneda = gson.fromJson(json, Moneda.class);

                System.out.println("Ingresar valor a convertir: ");
                var cantidad = teclado.nextInt();
                mimoneda.setCantidad(cantidad);


                System.out.println("""
                        ****************************************
                        """);

                mimoneda.convertir();

                System.out.println("""

                        ****************************************
                        """);
            }
            else if (lectura == 4) {
                var moneda1 = "BRL";
                var moneda2 = "USD";

                var direccion = "https://v6.exchangerate-api.com/v6/7a396575634862e059fd0293/pair/" + moneda1 + "/" + moneda2;

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                var json = response.body();

                Gson gson = new Gson();

                Moneda mimoneda = gson.fromJson(json, Moneda.class);

                System.out.println("Ingresar valor a convertir: ");
                var cantidad = teclado.nextInt();
                mimoneda.setCantidad(cantidad);


                System.out.println("""
                        ****************************************
                        """);

                mimoneda.convertir();

                System.out.println("""

                        ****************************************
                        """);
            }
            else if (lectura == 5) {
                var moneda1 = "USD";
                var moneda2 = "COP";

                var direccion = "https://v6.exchangerate-api.com/v6/7a396575634862e059fd0293/pair/" + moneda1 + "/" + moneda2;

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                var json = response.body();

                Gson gson = new Gson();

                Moneda mimoneda = gson.fromJson(json, Moneda.class);

                System.out.println("Ingresar valor a convertir: ");
                var cantidad = teclado.nextInt();
                mimoneda.setCantidad(cantidad);


                System.out.println("""
                        ****************************************
                        """);

                mimoneda.convertir();

                System.out.println("""

                        ****************************************
                        """);
            }
            else if (lectura == 6) {
                var moneda1 = "COP";
                var moneda2 = "USD";

                var direccion = "https://v6.exchangerate-api.com/v6/7a396575634862e059fd0293/pair/" + moneda1 + "/" + moneda2;

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                var json = response.body();

                Gson gson = new Gson();

                Moneda mimoneda = gson.fromJson(json, Moneda.class);

                System.out.println("Ingresar valor a convertir: ");
                var cantidad = teclado.nextInt();
                mimoneda.setCantidad(cantidad);


                System.out.println("""
                        ****************************************
                        """);

                mimoneda.convertir();

                System.out.println("""

                        ****************************************
                        """);
            } else if (lectura == 0) {
                break;
            } else {
                System.out.println("¡¡Opción no válida!! ¡Verificar y Volver a intentar!");
            }

        }

        System.out.println("¡Gracias por usar nuestro conversor :))!!!");

   }
}

