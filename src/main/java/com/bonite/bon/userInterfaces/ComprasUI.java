package com.bonite.bon.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprasUI {

    public static final Target BTN_CATEGORIA =
            Target.the(("Seleccionar la categoria"))
                    .locatedBy("(//a[contains(text(),'{0}')])[1]");
}
