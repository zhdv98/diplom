package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Rozklad;
import utils.DBUtils;
import utils.MyUtils;

@WebServlet(urlPatterns = { "/searchRozkladAuditoria" })
public class SearchRozkladAuditoriaServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public SearchRozkladAuditoriaServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/views/rozkladListView.jsp");
        dispatcher.forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection conn = MyUtils.getStoredConnection(request);

        String Auditoria = (String) request.getParameter("auditoria");
        int awesomeParsedInteger  = Integer.parseInt(Auditoria);
        String errorString = null;

        List<Rozklad> list = null;
        if (errorString == null) {
            try {

                list = DBUtils.findRozkladAuditoria(conn, awesomeParsedInteger);
                if (list.isEmpty())
                errorString = "Аудиторії " + Auditoria + " не існує!";

            } catch (SQLException e) {
                e.printStackTrace();
                errorString = e.getMessage();
            }
        }
        request.setAttribute("errorString", errorString);
        request.setAttribute("rozkladList", list);

        if (errorString != null) {
            RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/views/rozkladListView.jsp");
            dispatcher.forward(request, response);
        }
        else {
            RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/views/rozkladListView.jsp");
            dispatcher.forward(request, response);
        }

    }

}
