package com.app.form;

import org.apache.struts.action.ActionForm;

public class TestForm extends ActionForm {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
