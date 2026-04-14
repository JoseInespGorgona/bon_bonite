package com.bonite.bon.stepDefinitions;

import com.bonite.bon.questions.RegistroUsuarioQ;
import com.bonite.bon.tasks.IniciarSesionT;
import com.bonite.bon.utils.AbrirNavegador;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class IniciarSesionSD {
    @Dado("que el usuario esta en la pagina de login")
    public void que_el_usuario_esta_en_la_pagina_de_login() {
        OnStage.theActorCalled("actor")
                .attemptsTo(AbrirNavegador.cargarNavegador());
    }

    @Cuando("ingresa un documento y clave valido")
    public void ingresa_un_documento_y_clave_valido() {
        OnStage.theActorCalled("actor")
                .attemptsTo(IniciarSesionT.iniciarSesion());
    }

    @Entonces("accede al panel principal")
    public void accede_al_panel_principal() {
        OnStage.theActorCalled("actor")
                .should(seeThat(RegistroUsuarioQ.validarMensaje()));
    }
}
