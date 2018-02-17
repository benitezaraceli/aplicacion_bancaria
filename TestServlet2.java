package com.lmj;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.*;

public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        
        JSONObject loginCredentials = new JSONObject(request.getParameter("loginCredentials"));
        
        String username = loginCredentials.getString("username");
        String password = loginCredentials.getString("password");
        
		response.setContentType("application/json; charset=UTF-8");
        response.setStatus(HttpServletResponse.SC_OK);
        
        JSONObject loginStatus = new JSONObject();
		
		if (loginStatus.has("username") && (loginStatus.has("password"))) { 
        {
            if(username.equals("ara") && password.equals("1234")) {
                loginStatus.put("connected", true);
            }
        else
        {
            loginStatus.put("connected", false);
        }
		
		pw.println(loginStatus.toString());
    }
}
