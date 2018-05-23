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

@WebServlet(urlPatterns = { "/rozkladList" })
public class RozkladListServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public RozkladListServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection conn = MyUtils.getStoredConnection(request);

        String errorString = null;
        List<Rozklad> list = null;
        try {
            list = DBUtils.queryRozklad(conn);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            errorString = e.getMessage();
        }
        request.setAttribute("errorString", errorString);
        request.setAttribute("rozkladList", list);

        RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/views/rozkladListView.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
