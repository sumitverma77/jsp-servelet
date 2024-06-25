package com.example.jsp_servelets;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AddServelet" , urlPatterns = "/add")
    public class AddServelet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int val1 = Integer.parseInt(request.getParameter("num1"));
        int val2 = Integer.parseInt(request.getParameter("num2"));
        response.getWriter().println("Sum: " + (val1 + val2));
        request.getRequestDispatcher("HalloServlet").forward(request, response);
    }
}