package com.bonite.bon.tasks;

import com.bonite.bon.utils.LeerDatosExcel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.io.IOException;

import static com.bonite.bon.userInterfaces.ComprasUI.*;

public class ComprasT implements Task {

    LeerDatosExcel excel;

    public ComprasT() throws IOException{
        excel = new LeerDatosExcel();
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        String categoria;
        categoria = excel.leerDatos("Compras", 1, 0);

        t.attemptsTo(Click.on(BTN_CATEGORIA.of(categoria)));
    }

    public static ComprasT compras() {
        return Instrumented.instanceOf(ComprasT.class).withProperties();
    }
}
