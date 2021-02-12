package com.example.proyectodialogexten;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogPerso extends DialogFragment {
    private EditText etEmail;
    private EditText etPaswd;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflador = requireActivity().getLayoutInflater();
        View vista = inflador.inflate(R.layout.pantalla_dialog,null);
        etEmail = vista.findViewById(R.id.etEmail);
        etPaswd = vista.findViewById(R.id.etPaswd);
        builder.setView(vista);
        builder.setPositiveButton(R.string.aceptar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Log.d("Datos: ",etEmail.getText().toString()+" "+etPaswd.getText().toString());
            }
        });
        builder.setNegativeButton(R.string.cancelar, null);
        return builder.create();
    }
}
