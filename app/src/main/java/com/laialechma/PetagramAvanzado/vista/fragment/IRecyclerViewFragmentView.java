package com.laialechma.PetagramAvanzado.vista.fragment;

import com.laialechma.PetagramAvanzado.adapter.ContactoAdaptador;
import com.laialechma.PetagramAvanzado.model.Contacto;

import java.util.ArrayList;

/**
 * Created by anahisalgado on 21/04/16.
 */
public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();
    public void generarGridLayout();

    public ContactoAdaptador crearAdaptador(ArrayList<Contacto> contactos);

    public void inicializarAdaptadorRV(ContactoAdaptador adaptador);
}