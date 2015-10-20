/*
 * Copyright 10/20/2015 Ryan Harrington and Zack Layne
 */
package edu.elon.cs;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.Math;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author jdharring and zlayne
 */
@WebServlet(name = "InterestServlet", urlPatterns = {"/calculate"})
public class InterestServlet extends HttpServlet {

   
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/input.jsp";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "input";  // default action
        }
        
        if(action.equals("input")){
            url = "/404Error.jsp";
        }
        else if(action.equals("calculate")){
            String amount = request.getParameter("investment");
            double amountD = Double.parseDouble(amount);
            String rate = request.getParameter("interestRate");
            double rateD = Double.parseDouble(rate);
            String years = request.getParameter("numberYears");
            int yearsI = Integer.parseInt(years);
            
            rateD = rateD/100;
            double fValue = amountD * Math.pow((1+(rateD/1)), yearsI);

            Locale locale = new Locale("en","US");
            String fString = "";
            fString = NumberFormat.getCurrencyInstance(locale).format(fValue);
            String amtStr = NumberFormat.getCurrencyInstance(locale).format(amountD);
            
            Intrest intrest = new Intrest(amtStr,rateD,yearsI,fString);
                
            url = "/results.jsp";
           
            request.setAttribute("intrest", intrest);
            
        }
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        

    }


}
