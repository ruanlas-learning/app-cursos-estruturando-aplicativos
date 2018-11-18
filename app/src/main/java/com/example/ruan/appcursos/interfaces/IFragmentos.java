package com.example.ruan.appcursos.interfaces;

import android.support.v4.app.Fragment;

import com.example.ruan.appcursos.fragmentos.BemVindoFragmento;
import com.example.ruan.appcursos.fragmentos.ConsultarCursoFragmento;
import com.example.ruan.appcursos.fragmentos.ConsultarListaCursosFragmento;
import com.example.ruan.appcursos.fragmentos.DesenvolvedorFragmento;
import com.example.ruan.appcursos.fragmentos.RegistrarCursoFragmento;

// Esta interface deve-se extender da interface OnFragmentInteractionListener que está contida
// dentro dos fragmentos criados. Todos os fragmentos criado no projeto possuem este evento
// OnFragmentInteractionListener, e desta forma, todos eles devem ser incluídos como extensão
// desta interface IFragmentos
public interface IFragmentos extends
        BemVindoFragmento.OnFragmentInteractionListener,
        ConsultarCursoFragmento.OnFragmentInteractionListener,
        ConsultarListaCursosFragmento.OnFragmentInteractionListener,
        DesenvolvedorFragmento.OnFragmentInteractionListener,
        RegistrarCursoFragmento.OnFragmentInteractionListener {

}
