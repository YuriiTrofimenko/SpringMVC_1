package org.tyaa.springmvc1.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.print("<!DOCTYPE html>");
        writer.print("<html>\n" +
                "<head>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<title>Insert title here</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\tStudent name: " + req.getParameter("studentName"));
        writer.print("<br>\n" +
                "\t" + 2 * 2 + "\n" +
                "</body>\n" +
                "</html>");
    }
}
