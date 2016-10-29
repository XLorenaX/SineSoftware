package br.edu.ifpb.cg.info.sine.Classes;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Diego A. Gama on 29/10/2016.
 */
public class DetalharAsyncTask extends AsyncTask<String, Void, Sine> {

    @Override
    protected Sine doInBackground(String... strings) {
        String codigo = strings[0];
        String urlEspecifica = "http://mobile-aceite.tcu.gov.br/mapax-da-saude/rest/emprego/cod/";
        Sine sine = null;
        try {
            URL url = new URL(urlEspecifica+codigo);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            InputStream correDados;
            correDados = connection.getInputStream();
            InputStreamReader respostaJSON = new InputStreamReader(correDados, "UTF-8");
            Gson gson = new Gson();
            sine = gson.fromJson(respostaJSON, Sine.class);

            return sine;

        } catch (IOException e) {
            e.printStackTrace();

            return sine;
        }

    }

    @Override
    protected void onPostExecute(Sine sine) {
        super.onPostExecute(sine);
    }
}
