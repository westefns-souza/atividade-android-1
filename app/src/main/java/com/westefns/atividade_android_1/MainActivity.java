package com.westefns.atividade_android_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.westefns.atividade_android_1.Fragments.AgendamentosListFragment;
import com.westefns.atividade_android_1.Fragments.InfoDialogFragment;
import com.westefns.atividade_android_1.Model.Agendamento;

public class MainActivity extends AppCompatActivity implements AgendamentosListFragment.clicladoNoAgendamento {

    private FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFragmentManager = getSupportFragmentManager();
    }

    @Override
    public void SelecionouAgendamento(Agendamento agendamento) {
        Intent it = new Intent(this, DetalhesAgendamentoActivity.class);

        it.putExtra("agendamento", agendamento);

        startActivity(it);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.acao_info:
                InfoDialogFragment infoDialogFragment = new InfoDialogFragment();
                infoDialogFragment.show(mFragmentManager, "INFO");
        }

        return super.onOptionsItemSelected(item);
    }
}