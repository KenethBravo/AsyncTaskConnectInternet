package com.example.pc_12.asynctask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



/**
 * Created by pc-12 on 5/04/17.
 */

public class HttpManager {
    public static String getData(String uri) throws IOException {
        //clase para manejar archivo
        BufferedReader reader = null; // procesar archivo html

        // clase URL de java (manejar rutas)
        URL url = new URL(uri);

        // Clase para hacer conecion
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // creando objeto -- declarar objeto de tipo StringBuilder para el manejo de tipo de archivo
        StringBuilder stringBuilder = new StringBuilder();

        // Conectar y leer archivo de internet
        //http://186.116.10.48/zeusacad/img/usuarios.xml
        reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String line;
        while ((line=reader.readLine())!= null){
            stringBuilder.append(line+"\n");
        }

        return stringBuilder.toString();
    }
}
