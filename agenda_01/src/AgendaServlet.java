

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AgendaServlet")
public class AgendaServlet extends HttpServlet { //As classes que o Tomcat levanta est�o do lado do Servidor; As requisi��es do Browser chegam do lado do servidor
	private static final long serialVersionUID = 1L;
       
   
    public AgendaServlet() {
        super();
    } 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(">>>>>>>>REQUEST " + request.getMethod());
		
		String login = request.getParameter("login"); //name � um atributo que vem como par�metro, e esse nome tem que ser convertido para String
		String senha = request.getParameter("senha");
		
		System.out.println("O nome que veio da requisi��o � " + login);
		System.out.println("A senha que veio da requisi��o � " + senha);
		
		request.setAttribute("login", login);//Colocando valores na requisi��o do Servidor para o cliente (Browser)
		
		
		if(login.equals("SuzanaF")&& senha.contentEquals("12345")) { //Fazendo uma valida��o para o login e a senha
			//RequestDispatcher rd = request.getRequestDispatcher("bemVindo.html");
			//rd.forward(request, response); //O forward envia informa��es
			PrintWriter	out	=	response.getWriter();
			out.println("<center><p> Seja Bem-Vindo(a), Sr(a). "+ login + "!"+ "</p></center");
			
	
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}
		
		
		
		
//		if(login.equals("SuzanaF")&& senha.contentEquals("12345")) { //Fazendo uma valida��o para o login e a senha 
//			response.sendRedirect("bemVindo.html"); //Faz um redirecionamento para a p�gina .html informada
//		}else {
//			response.sendRedirect("index.html");
//		}
		
		
		
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		doGet(request, response);
//	}
	
	
	//<<<<<<<<<< Explicando todo o processo>>>>>>>>>>
	
	//As requisi��es(dados em String) s�o enviadas ao servidor pelo browser por meio de um protocolo Http, manda do browser recebe no servidor e apresenta ao browser(cliente) novamente.

}
