package br.edu.ifpb.cg.info.sine.Activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

import br.edu.ifpb.cg.info.sine.Classes.DetalharAsyncTask;
import br.edu.ifpb.cg.info.sine.Classes.Sine;
import br.edu.ifpb.cg.info.sine.R;

public class DetalhaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalha);
        Intent intent = new Intent();
        Bundle bundle = intent.getExtras();
        String codPost = bundle.getString("chave");
        Sine sine = null;
        DetalharAsyncTask detalharAsyncTask = new DetalharAsyncTask();
        TextView nome = (TextView) findViewById(R.id.nome);
        TextView codPosto = (TextView) findViewById(R.id.codPosto);
        TextView entidadeConveniada = (TextView) findViewById(R.id.entidadeConveniada);
        TextView endereco = (TextView) findViewById(R.id.endereco);
        TextView bairro = (TextView) findViewById(R.id.bairro);
        TextView cep = (TextView) findViewById(R.id.cep);
        TextView telefone = (TextView) findViewById(R.id.telefone);
        TextView municipio = (TextView) findViewById(R.id.municipio);
        TextView uf = (TextView) findViewById(R.id.uf);
        TextView lat = (TextView) findViewById(R.id.lat);
        TextView lon = (TextView) findViewById(R.id.lon);
        try {
            sine = detalharAsyncTask.execute("codPost").get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        nome.setText(sine.getNome());
        codPosto.setText(sine.getCodPost());
        entidadeConveniada.setText(sine.getEntidadeConveniada());
        endereco.setText(sine.getEndereco());
        bairro.setText(sine.getBairro());
        cep.setText(sine.getCep());
        telefone.setText(sine.getTelefone());
        municipio.setText(sine.getMunicipio());
        uf.setText(sine.getUf());
        lat.setText(sine.getLat());
        lon.setText(sine.getLon());
    }
}
