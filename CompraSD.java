package com.bonite.bon.stepDefinitions;

import com.bonite.bon.questions.CompraQ;
import com.bonite.bon.tasks.ComprasT;
import com.bonite.bon.tasks.InformacionDetalleT;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CompraSD {
    @Cuando("selecciona y agregue el producto al carito de compra")
    public void selecciona_y_agregue_el_producto_al_carito_de_compra() {
        OnStage.theActorCalled("actor")
                .attemptsTo(ComprasT.compras());
    }

    @Cuando("llene la la informacion del detalle de factura")
    public void llene_la_la_informacion_del_detalle_de_factura() {
        OnStage.theActorCalled("actor")
                .attemptsTo(InformacionDetalleT.informacionDetalleCompra());
    }

    @Entonces("se visualizara mensaje de finalizacion de compra")
    public void se_visualizara_mensaje_de_finalizacion_de_compra() {
        OnStage.theActorCalled("actor")
                .should(seeThat(CompraQ.validarCompra()));
    }
}
