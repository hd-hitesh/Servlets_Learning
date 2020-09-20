package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;

public class FirstServlet implements Servlet
{

    ServletConfig conf;
    
    //Life Cycle Methods
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.conf = config;
        System.out.println("Creating Objects..");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Servicing...");
        
        //set the content type of response
        res.setContentType("text/html");
        PrintWriter out= res.getWriter();
        out.println("<h1>Hello</h1>");
        out.println("<h1>"+ new Date().toString()+"</h1>");
    }
    
    @Override
    public void destroy() {
        System.out.println("Destroying object....");
    }
    
    //Non-Lifecycle methods
    
    @Override
    public ServletConfig getServletConfig() {
        return conf;
    }

    @Override
    public String getServletInfo() {
        return "Created by Hitesh";
    }
    
}
