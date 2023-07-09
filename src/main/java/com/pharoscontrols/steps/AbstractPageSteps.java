package com.pharoscontrols.steps;

import com.pharoscontrols.views.AbstractPageView;
import io.qameta.allure.Step;

public abstract class AbstractPageSteps {
    @Step("Open page in browser")
    abstract AbstractPageSteps open();
}
