package com.bonite.bon.stepDefinitions;

import com.bonite.bon.tasks.NavegacionT;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class NavegacionSD {

    @Cuando("selecciona cada categoría")
    public void selecciona_cada_categoría() {
        OnStage.theActorCalled("actor")
                .attemptsTo(NavegacionT.navegacionT());
    }
    @Entonces("se visualiza los productos de la categoria seleccionada")
    public void se_visualiza_los_productos_de_la_categoria_seleccionada() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
