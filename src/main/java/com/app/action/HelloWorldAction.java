package com.app.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.form.HelloWorldForm;
import com.app.service.GreetingService;

public class HelloWorldAction extends Action {

    @Autowired
    private GreetingService greetingService;

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        HelloWorldForm helloForm = (HelloWorldForm) form;
        String resultMessage = greetingService.getPersonalizedGreeting("brian");
        // Atur pesan yang akan ditampilkan di JSP
        helloForm.setMessage( resultMessage ); 

        // Mengembalikan "success" untuk diarahkan ke hello.jsp
        return mapping.findForward("success"); 
    }
}