package com.westefns.atividade_android_1.Fragments;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.westefns.atividade_android_1.R;

public class InfoDialogFragment extends DialogFragment implements
        DialogInterface.OnClickListener{

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Informações");
        builder.setMessage("Westefns Damião de Souza Silva");

        builder.setPositiveButton("Ver site", (dialog, whichButton) -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/westefns-souza/atividade-android-1"));
            startActivity(browserIntent);
        });
        builder.setNegativeButton("Sair",this);

        return builder.create();
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        Activity activity = getActivity();

        if(activity instanceof AoClicarEmInfo){
            AoClicarEmInfo listener = (AoClicarEmInfo) activity;
            listener.aoClicar(which);
        }
    }

    public interface AoClicarEmInfo{
        public void aoClicar(int botao);
    }
}