package br.edu.ifpb.cg.info.sine.Listener;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import br.edu.ifpb.cg.info.sine.Activities.DetalhaActivity;
import br.edu.ifpb.cg.info.sine.Activities.ListaDeTodosActivity;
import br.edu.ifpb.cg.info.sine.Classes.Sine;

import static android.support.v4.app.ActivityCompat.startActivity;

/**
 * Created by Diego A. Gama on 29/10/2016.
 */
public class OnItemClick implements AdapterView.OnItemClickListener {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Sine incomingObject = (Sine) adapterView.getAdapter().getItem(i);

        Intent intent = new Intent(null, DetalhaActivity.class);
        intent.putExtra("chave", incomingObject.getCodPost());
        startActivity(new DetalhaActivity(), intent, null);
    }

}
