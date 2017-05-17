package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		log("[start]");

		// ContentType設定
        response.setContentType("text/html; charset=Shift_JIS");
        // Writer取得
        PrintWriter writer = response.getWriter();
        // HTML作成
        writer.print("<HTML><BODY>");
        writer.print("doGetが実行されました。<BR/>");
        writer.print("<form method=\"post\"><input type=\"submit\" name=\"doPost実行用のボタン\"></form>");
        writer.print("</BODY></HTML>");

//        log("[end]");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
        // ContentType設定
        response.setContentType("text/html; charset=Shift_JIS");
        // Writer取得
        PrintWriter writer = response.getWriter();
        // HTML作成
        writer.print("<HTML><BODY>");
        writer.print("doPostが実行されました。<BR/>");
        writer.print("</BODY></HTML>");
	}

}
