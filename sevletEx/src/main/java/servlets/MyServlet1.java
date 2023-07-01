package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet1 extends HttpServlet {
//    doGet(req, resp)
//        요청 정보를 분석
//        필요한 자원을 찾거나 가공
//        응답
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8"); // content-type : text/html
        //resp.setCharacterEncoding("UTF-8"); -> 위로 합쳐버림
        PrintWriter out = resp.getWriter();
        out.print("<h1>안녕하세요</h1>");
    }
}
