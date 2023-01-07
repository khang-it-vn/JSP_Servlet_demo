package com.example.JSPTutorial.Controllers;

import com.example.JSPTutorial.Data.DbConnection;
import com.example.JSPTutorial.Entities.Person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/login"})
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
        requestDispatcher.include(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ArrayList<Person> personArrayList = new ArrayList<>();
        for(int i =0; i < 5; i++)
        {
            Person person = new Person("Demo" + i, "093785" +i , "Dia chi" + i);
            personArrayList.add(person);
        }
        DbConnection.getInstance();
        ArrayList<Account> accounts =    DbConnection.executeQuery("select  * from account");

        req.setAttribute("accounts",accounts);
        req.setAttribute("persons",personArrayList);
        String numberPhone = req.getParameter("numberphone");
        req.setAttribute("numberPhone",numberPhone);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("register.jsp");
        requestDispatcher.forward(req,resp);
    }
}
