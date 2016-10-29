package br.edu.ifpb.cg.info.sine.Activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.edu.ifpb.cg.info.sine.R;

public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void butListar(View view) {
        Intent intent = new Intent(MenuActivity.this, ListaDeTodosActivity.class);
        intent.putExtra("", "");
        startActivity(intent);
    }

    public void butEncontrar(View view) {
        Intent intent = new Intent(MenuActivity.this, SineCGActivity.class);
        intent.putExtra("", "");
        startActivity(intent);
    }

}
