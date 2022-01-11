package com.westefns.atividade_android_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.westefns.atividade_android_1.Fragments.DetalheAgendamentoFragment;
import com.westefns.atividade_android_1.Model.Agendamento;

public class DetalhesAgendamentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_agendamento);

        Intent it = getIntent();

        Agendamento agendamento = (Agendamento)  it.getExtras().getSerializable("agendamento");

        DetalheAgendamentoFragment detalheAgendamentoFragment = DetalheAgendamentoFragment.novaInstancia(agendamento);

        FragmentManager fm = getSupportFragmentManager();

        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.detalheAgendamento, detalheAgendamentoFragment, DetalheAgendamentoFragment.TAG_DETALHE);

        ft.commit();
    }
}