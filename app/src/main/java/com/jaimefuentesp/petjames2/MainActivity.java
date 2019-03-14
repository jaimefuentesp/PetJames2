package com.jaimefuentesp.petjames2;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        agregarFAB();
    }

    public void agregarFAB() {
        FloatingActionButton miFAB = findViewById(R.id.fqbMiFab);
        miFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getBaseContext(),getResources().getString(R.string.texto_FAVButton), Toast.LENGTH_SHORT).show();
                //Snackbar.make(v,getResources().getString(R.string.texto_FAVButton),Snackbar.LENGTH_SHORT).show();
                Snackbar.make(v,getResources().getString(R.string.texto_FAVButton),Snackbar.LENGTH_SHORT)
                        .setAction(getResources().getString(R.string.texto_accion), new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Log.i("Snackbar","Click en snack bar");
                            }
                        })
                        .setActionTextColor(getResources().getColor(R.color.colorPrimary))
                        .show();
            }
        });
    }
}
