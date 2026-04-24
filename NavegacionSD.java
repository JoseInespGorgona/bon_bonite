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

}
