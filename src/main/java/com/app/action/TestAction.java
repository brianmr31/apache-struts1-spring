package com.app.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.app.form.TestForm;

public class TestAction extends Action {
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        TestForm testForm = (TestForm) form;
        // Atur pesan yang akan ditampilkan di JSP
        testForm.setMessage("heeee heee"); 

        // Mengembalikan "success" untuk diarahkan ke hello.jsp
        return mapping.findForward("success"); 
    }
}
