package ir.maktab;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MathFormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");

        out.println("<title>MyMathFormPage</title>");
        out.println("</head>");
        out.println("<body>");

        ServletConfig servletConfig = getServletConfig();
        String value = servletConfig.getInitParameter("operationName");

        Double num1 = Double.parseDouble(req.getParameter("num1"));
        Double num2 = Double.parseDouble(req.getParameter("num2"));

        if (value.equals("add")) {
            out.println("<h1> " + num1 + " + " + num2 + " = " + (num1+num2) + " </h1>");
        }
        else if (value.equals("minus")) {
            out.println("<h1> " + num1 + " - " + num2 + " = " + (num1-num2) + " </h1>");
        }
        else if (value.equals("product")) {
            out.println("<h1> " + num1 + " * " + num2 + " = " + (num1*num2) + " </h1>");
        }
        else if (value.equals("division")) {
            out.println("<h1> " + num1 + " / " + num2 + " = " + (num1/num2) + " </h1>");
        }

        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");

        out.println("<title>MyMathPage</title>");
        out.println("</head>");
        out.println("<body>");

        ServletConfig servletConfig = getServletConfig();
        String value = servletConfig.getInitParameter("operationName");

        Double num1 = Double.parseDouble(req.getParameter("num1"));
        Double num2 = Double.parseDouble(req.getParameter("num2"));

        if (value.equals("add")) {
            out.println("<h1> " + num1 + " + " + num2 + " = " + (num1+num2) + " </h1>");
        }
        else if (value.equals("minus")) {
            out.println("<h1> " + num1 + " - " + num2 + " = " + (num1-num2) + " </h1>");
        }
        else if (value.equals("product")) {
            out.println("<h1> " + num1 + " * " + num2 + " = " + (num1*num2) + " </h1>");
        }
        else if (value.equals("division")) {
            out.println("<h1> " + num1 + " / " + num2 + " = " + (num1/num2) + " </h1>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
