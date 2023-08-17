package com.quest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "InitServlet", value = "/start")
public class InitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession currentSession = req.getSession(true);

        ParserJson situation = new ParserJson();
        situation.init("config/situations.json");
        String id = "1";

        currentSession.setAttribute("id",id);
        currentSession.setAttribute("objSituation", situation);

        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }

}
