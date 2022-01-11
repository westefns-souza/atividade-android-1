package com.westefns.atividade_android_1.Fragments;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.ListFragment;

import com.westefns.atividade_android_1.Model.Agendamento;

import java.util.ArrayList;
import java.util.List;

public class AgendamentosListFragment extends ListFragment {

    List<Agendamento> mAgendamentos;
    ArrayAdapter<Agendamento> mAdapter;

    public AgendamentosListFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAgendamentos = carregarAgendamentos();

        mAdapter = new ArrayAdapter<Agendamento>(getActivity(), android.R.layout.simple_list_item_1, mAgendamentos);

        setListAdapter(mAdapter);
    }

    private List<Agendamento> carregarAgendamentos() {
        List<Agendamento> agendamentos = new ArrayList<>();

        agendamentos.add(new Agendamento("Oftal", "Dr. Pedro", "12/01/2022", "08h00"));
        agendamentos.add(new Agendamento("Ortopedia", "Dra. Maria", "12/01/2022", "08h00"));
        agendamentos.add(new Agendamento("Ortopedia", "Dra. Maria", "22/01/2022", "10h00"));
        agendamentos.add(new Agendamento("Odontologica", "Dr. Marcos", "10/02/2022", "16h00"));

        return agendamentos;
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Activity activity = getActivity();

        if (activity instanceof clicladoNoAgendamento){
            Agendamento agendamento = (Agendamento) l.getItemAtPosition(position);

            clicladoNoAgendamento listener = (clicladoNoAgendamento) activity;

            listener.SelecionouAgendamento(agendamento);
        }
    }

    public interface clicladoNoAgendamento {
        void SelecionouAgendamento(Agendamento agendamento);
    }
}