package com.bonite.bon.stepDefinitions;

import com.bonite.bon.questions.RegistroUsuarioQ;
import com.bonite.bon.tasks.EnvioFormularioT;
import com.bonite.bon.tasks.RegistrarUsuarioT;
import com.bonite.bon.utils.AbrirNavegador;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;


public class RegistroUsuarioSD {

    @Before
    public void configuracion() {
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario esta en la pagina de registro")
    public void que_el_usuario_esta_en_la_pagina_de_registro() {
        OnStage.theActorCalled("actor")
                .attemptsTo(AbrirNavegador.cargarNavegador());
    }

    @Cuando("ingresa datos validos")
    public void ingresa_datos_validos() {
        OnStage.theActorCalled("actor")
                .attemptsTo(RegistrarUsuarioT.registrar());
    }

    @Cuando("envia el formulario")
    public void envia_el_formulario() {
        OnStage.theActorCalled("actor")
                .attemptsTo(EnvioFormularioT.envioFormulario());
    }

    @Entonces("se visualiza el saludo de bienvenida")
    public void se_visualiza_el_saludo_de_bienvenida() {
        OnStage.theActorCalled("actor")
                .should(seeThat(RegistroUsuarioQ.validarMensaje()));
    }
}
