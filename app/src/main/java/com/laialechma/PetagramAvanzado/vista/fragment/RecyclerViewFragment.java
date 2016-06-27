package com.laialechma.PetagramAvanzado.vista.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.laialechma.recyclerviewfragments.R;
import com.laialechma.PetagramAvanzado.adapter.ContactoAdaptador;
import com.laialechma.PetagramAvanzado.model.Contacto;
import com.laialechma.PetagramAvanzado.presentador.IRecylerViewFragmentPresenter;
import com.laialechma.PetagramAvanzado.presentador.RecyclerViewFragmentPresenter;

import java.util.ArrayList;


public class RecyclerViewFragment extends Fragment implements IRecyclerViewFragmentView {
    private ArrayList<Contacto> contactos;
    private RecyclerView rvContactos;
    private IRecylerViewFragmentPresenter presenter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        rvContactos = (RecyclerView) v.findViewById(R.id.rvContactos);
        presenter = new RecyclerViewFragmentPresenter(this, getContext());
        return v;
    }



    /*
    public void inicializarDatos(){
        contactos = new ArrayList<>();
        contactos.add(new Contacto(R.drawable.candy_icon, "Anahi Salgado", "77779999", "anahi@gmail.com", likes));
        contactos.add(new Contacto(R.drawable.yammi_banana_icon, "Pedro Sanchez", "88882222", "pedro@gmail.com", likes));
        contactos.add(new Contacto(R.drawable.shock_rave_bonus_icon, "Mireya Lopez", "33331111", "mireya@gmail.com", likes));
        contactos.add(new Contacto(R.drawable.forest_mushroom_icon, "Juan Lopez", "44442222", "juan@gmail.com", likes));

    }*/



    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvContactos.setLayoutManager(llm);

    }

    @Override
    public void generarGridLayout() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        rvContactos.setLayoutManager(gridLayoutManager);
    }

    @Override
    public ContactoAdaptador crearAdaptador(ArrayList<Contacto> contactos) {
        ContactoAdaptador adaptador = new ContactoAdaptador(contactos, getActivity()  );
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(ContactoAdaptador adaptador) {
        rvContactos.setAdapter(adaptador);
    }
}
