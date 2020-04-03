package br.com.ericsanches.wagnermoribe.fatec_ipi_noite_chat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irParaCadastro (View view){
        startActivity (new Intent(this, NovoUsuarioActivity.class));
    }
}
