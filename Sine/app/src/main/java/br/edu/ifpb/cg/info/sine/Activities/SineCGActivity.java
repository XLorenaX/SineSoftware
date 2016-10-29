package br.edu.ifpb.cg.info.sine.Activities;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import br.edu.ifpb.cg.info.sine.Classes.ListarAsyncTask;
import br.edu.ifpb.cg.info.sine.Classes.ListarCGAsyncTask;
import br.edu.ifpb.cg.info.sine.Classes.Sine;
import br.edu.ifpb.cg.info.sine.R;

public class SineCGActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sine_cg);
        ListView listSine = (ListView) findViewById(R.id.listaSineCG);
        ListarCGAsyncTask listarCGAsyncTask = new ListarCGAsyncTask();
        ArrayList<Sine> lista = new ArrayList<Sine>();
        try {
            lista = listarCGAsyncTask.execute().get();
            ArrayAdapter<Sine> adapta = new ArrayAdapter<Sine>(SineCGActivity.this, android.R.layout.simple_list_item_1, lista);
            listSine.setAdapter(adapta);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
