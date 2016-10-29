package br.edu.ifpb.cg.info.sine.Activities;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import br.edu.ifpb.cg.info.sine.Classes.ListarAsyncTask;
import br.edu.ifpb.cg.info.sine.Classes.Sine;
import br.edu.ifpb.cg.info.sine.Listener.OnItemClick;
import br.edu.ifpb.cg.info.sine.R;

public class ListaDeTodosActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_todos);
        ListView listSine = (ListView) findViewById(R.id.listaSine);
        listSine.setOnItemClickListener(new OnItemClick());
        ListarAsyncTask listarAsyncTask = new ListarAsyncTask();
        ArrayList<Sine> lista = new ArrayList<Sine>();
        try {
            lista = listarAsyncTask.execute().get();
            ArrayAdapter<Sine> adapta = new ArrayAdapter<Sine>(ListaDeTodosActivity.this, android.R.layout.simple_list_item_1, lista);

            listSine.setAdapter(adapta);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
