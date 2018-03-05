package com.lmj;

import javax.servlet.http.HttpServletResponse;
import org.json.*;

public class ClientValidation {
    public void clientValidation {
    
        if(!request.getParameterMap().containsKey("client")) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
        } else {
            JSONObject client = new JSONObject(request.getParameter("client"));

            if(!client.has("type")) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST);
            } else {
                String type = client.getString("type");
            }
            
            JSONObject person = new JSONObject(request.getParameter("person"));
            
            if(!person.has("name") || !person.has("surname") || !person.has("dni") || !person.has("birthday") || !person.has("nationality")) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST);
            } else {
                String name = person.getString("name");
                String surname = person.getString("surname");
                String dni = person.getString("dni");
                String birthday = person.getString("birthday");
                String nationality = person.getString("nationality");
            }
            
            JSONObject contactInformation = new JSONObject(request.getParameter("contactInformation"));
            
            if(!contactInformation.has("phone") || !contactInformation.has("mobilePhone") || !contactInformation.has("email")) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST);
            } else {
                String phone = contactInformation.getString("phone");
                String mobilePhone = contactInformation.getString("mobilePhone");
                String email = contactInformation.getString("email");
            }
            
            JSONObject locationInformation = new JSONObject(request.getParameter("locationInformation"));
            
            if(!locationInformation.has("address") || !locationInformation.has("zipcode") 
                || !locationInformation.has("province") || !locationInformation.has("country")) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST);
            } else {
                String address = locationInformation.getString("address");
                String zipcode = locationInformation.getString("zipcode");
                String province = locationInformation.getString("province");
                String country = locationInformation.getString("country");
            }
        }
    }
}
