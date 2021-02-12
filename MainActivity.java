package com.example.proyectodialogexten;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_llamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_llamar=findViewById(R.id.btn_llamar);

        btn_llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogPerso d = new DialogPerso();
                d.show(getSupportFragmentManager(),"dialogo");
            }
        });


    }
}