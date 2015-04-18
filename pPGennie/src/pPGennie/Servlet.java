package pPGennie;


import java.io.IOException;
import java.util.Random;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Questions1 q1 = new Questions1();
		Questions2 q2 = new Questions2();
		String question1 = q1.random();
		String question2 = q2.random();
		request.setAttribute("question1", question1);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		request.setAttribute("question2", question2);
		request.getRequestDispatcher("index.jsp").forward(request, response);
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String answer1 = request.getParameter("Answer1");
		String answer2 = request.getParameter("Answer2");
		String autogen = request.getParameter("autogen");
		
		if((answer1==""&&answer2=="")||(answer1==null&&answer2==null)){
			Random inputRan = new Random();
			int num = inputRan.nextInt(11);
			int num1 = inputRan.nextInt(11);
			while(num == num1){
				num1 = inputRan.nextInt(11);
			}
			DictionaryInput input1 = new DictionaryInput();
			String first_word = input1.getwords(num);
			String second_word = input1.getwords(num1);
			Randomizer r2 = new Randomizer();
			String autopassword = r2.Randomizer(first_word, second_word );
			request.setAttribute("first_word", first_word);
			request.setAttribute("second_word",second_word);
			request.setAttribute("password", autopassword);
			request.getRequestDispatcher("password.jsp").forward(request, response);
			
			
		}
		else{
			System.out.println("i am here");
			Randomizer r1 = new Randomizer();
			String password = r1.Randomizer(answer1, answer2);
			//response(response, password);
			request.setAttribute("first_word", answer1);
			request.setAttribute("second_word",answer2);
			request.setAttribute("password", password);
			request.getRequestDispatcher("password.jsp").forward(request, response);
			
		}
		
	}
	private void response(HttpServletResponse response, String password)
			throws IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		
		out.println("<t1>" + password + "</t1>");
		
		out.println("</body></html>");
	}
}
