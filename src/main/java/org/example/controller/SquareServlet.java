package org.example.controller;




import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet("/sq")
public class SquareServlet extends HttpServlet {



//    The servlet service() method that perform the task of determining the method that has been called i.e.
//            get/post/trace/head/options/put/delete.
//    These are the 'big seven' methods since they are the most commonly used ones.

//    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        int i = Integer.parseInt(request.getParameter("num1"));
//        int j = Integer.parseInt(request.getParameter("num2"));
//        int k = i + j;
//
//        PrintWriter out =  response.getWriter();
//        out.println("result i s" + k);
//        System.out.println(k);
//    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       PrintWriter out = response.getWriter();
       int k = (int) request.getAttribute("k");

       out.println("hello to square servlet and result was " + k);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }
}
