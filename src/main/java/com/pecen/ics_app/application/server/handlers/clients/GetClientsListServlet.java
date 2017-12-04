package com.pecen.ics_app.application.server.handlers.clients;

import com.google.gson.Gson;
import com.pecen.ics_app.application.server.datasource.dao.ClientDAOImpl;
import com.pecen.ics_app.application.server.datasource.dao.IClientDAO;
import com.pecen.ics_app.application.server.datasource.entities.TClientPOJO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by pechen on 05.12.2017.
 */
@WebServlet("/get_clients")
public class GetClientsListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doRequest(req, resp);
    }

    private void doRequest(HttpServletRequest req, HttpServletResponse response) throws IOException {
        response.setContentType("application/json;charset=UTF-8");

        PrintWriter out = response.getWriter();
        IClientDAO clientsDao = new ClientDAOImpl();
        List<TClientPOJO> clients = (List<TClientPOJO>) clientsDao.findAll();
        out.print(new Gson().toJson(clients));
    }
}
