package com.westefns.atividade_android_1.Fragments;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.westefns.atividade_android_1.Model.Agendamento;
import com.westefns.atividade_android_1.R;

public class DetalheAgendamentoFragment extends Fragment {

    TextView tvEspecialidade;
    TextView tvProfissional;
    TextView tvData;
    TextView tvHora;

    public static final String TAG_DETALHE = "tagDetalhe";
    public static final String TAG_AGENDAMENTO = "tagAgendamento";

    Agendamento mAgendamento;

    public static DetalheAgendamentoFragment novaInstancia(Agendamento agendamento) {

        DetalheAgendamentoFragment detalheAgendamentoFragment = new DetalheAgendamentoFragment();

        Bundle param = new Bundle();
        param.putSerializable(TAG_AGENDAMENTO, agendamento);

        detalheAgendamentoFragment.setArguments(param);

        return detalheAgendamentoFragment;
    }

    public DetalheAgendamentoFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAgendamento = (Agendamento) getArguments().getSerializable(TAG_AGENDAMENTO);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View layout = inflater.inflate(R.layout.fragment_detalhe_agendamento, container, false);

        tvEspecialidade = layout.findViewById(R.id.tvEspecialidade);
        tvProfissional = layout.findViewById(R.id.tvProfissional);
        tvData = layout.findViewById(R.id.tvData);
        tvHora = layout.findViewById(R.id.tvHora);

        if (mAgendamento != null) {
            tvEspecialidade.setText(mAgendamento.getEspecialidade());
            tvProfissional.setText(mAgendamento.getProfissional());
            tvData.setText(mAgendamento.getData());
            tvHora.setText(mAgendamento.getHorario());
        }

        return layout;
    }
}