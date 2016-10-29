package br.edu.ifpb.cg.info.sine.Classes;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class ListarAsyncTask extends AsyncTask<String, Void, ArrayList<Sine>> {

    @Override
    protected ArrayList<Sine> doInBackground(String... strings) {
        ArrayList<Sine> sineList = new ArrayList<Sine>();
        try {
            URL url = new URL("http://mobile-aceite.tcu.gov.br/mapax-da-saude/rest/emprego/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            InputStream correDados;
            correDados = connection.getInputStream();
            InputStreamReader respostaJSON = new InputStreamReader(correDados, "UTF-8");
            Gson gson = new Gson();

            Type listType = new TypeToken<ArrayList<Sine>>() {
            }.getType();
            sineList = gson.fromJson(respostaJSON, listType);
            return sineList;

        } catch (IOException e) {
            e.printStackTrace();

            return sineList;
        }

    }

    @Override
    protected void onPostExecute(ArrayList<Sine> lista) {
        super.onPostExecute(lista);
    }
}
