package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
        //jsp 파일 viewpath 선언
        /*
        WEB-INF 아래 자원들은 외부에서 호출되지 않는다.
        */
        String viewPath = "/WEB-INF/views/new-form.jsp";
        //컨트롤러에서 view로 이동
        RequestDispatcher dispatcher = requset.getRequestDispatcher(viewPath);
        //서블릿에서 jsp 호출
        //서버 내부에서 다시 호출
        //다시 클라이언트 - 서버 왔다갔다가 아님
        /*
        redirect와는 다르다. redirect 는 URL도 변경
        */
        dispatcher.forward(requset,response);

    }
}
