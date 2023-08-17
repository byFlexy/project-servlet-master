package com.quest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "LogicServlet", value = "/logic")
public class LogicServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        HttpSession currentSession = req.getSession();

        ParserJson situation = extractSituation(currentSession);

        String id = String.valueOf(currentSession.getAttribute("id"));

        if ("first".equals(req.getParameter("answer"))) {
            id = String.valueOf(situation.getNextFirstScene(id));
        }
        if ("second".equals(req.getParameter("answer"))) {
            id = String.valueOf(situation.getNextSecondScene(id));
        }

        currentSession.setAttribute("id", id);
        currentSession.setAttribute("question", situation.getQuestion(id));
        currentSession.setAttribute("answer1", situation.getFirstAnswer(id));
        currentSession.setAttribute("answer2", situation.getSecondAnswer(id));
        currentSession.setAttribute("answer", null);


        if (id.equals("8") || id.equals("11") || id.equals("13")) {
            resp.sendRedirect("/lose.jsp");
        } else if (id.equals("15")) {
            resp.sendRedirect("/win.jsp");
        } else {
            resp.sendRedirect("/situation.jsp");
        }
    }

    private ParserJson extractSituation(HttpSession currentSession) {
        Object situationAttribute = currentSession.getAttribute("objSituation");
        if (ParserJson.class != situationAttribute.getClass()) {
            currentSession.invalidate();
            throw new RuntimeException("Session is broken, try one more time");
        }
        return (ParserJson) situationAttribute;
    }

}
