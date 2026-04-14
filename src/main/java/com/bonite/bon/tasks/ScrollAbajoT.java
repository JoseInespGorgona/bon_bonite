package com.bonite.bon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Evaluate;

public class ScrollAbajoT implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Evaluate.javascript("window.scrollBy(0, 400);")
        );
    }

    public static ScrollAbajoT unPoco() {
        return new ScrollAbajoT();
    }
}