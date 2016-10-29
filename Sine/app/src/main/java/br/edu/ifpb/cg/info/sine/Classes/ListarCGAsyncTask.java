package br.edu.ifpb.cg.info.sine.Classes;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Diego A. Gama on 29/10/2016.
 */
public class ListarCGAsyncTask extends AsyncTask<String, Void, ArrayList<Sine>> {

    @Override
    protected ArrayList<Sine> doInBackground(String... strings) {
        URL url = null;
        try {
            url = new URL("http://mobile-aceite.tcu.gov.br/mapa-da-saude/rest/emprego/latitude/-7.242662/longitude/-35.971605/raio/100");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            InputStream correDados;
            correDados = connection.getInputStream();
            InputStreamReader respostaJSON = new InputStreamReader(correDados, "UTF-8");
            Gson gson = new Gson();

            Type listType = new TypeToken<ArrayList<Sine>>(){}.getType();
            ArrayList<Sine> lista = new ArrayList<Sine>();
            lista = gson.fromJson(respostaJSON, listType);

            return lista;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(ArrayList<Sine> lista) {
        super.onPostExecute(lista);
    }
}
