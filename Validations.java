package com.lmj;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.*;

public class Validations {
	
    public static boolean clientValidation (JSONObject client) {
    
		if(!client.has("clientId") || !client.has("type") || !client.has("account") || !client.has("person")) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return false;
		} else {
			JSONObject account = new JSONObject(request.getParameter("account"));
			JSONObject account = new JSONObject(request.getParameter("person"));
			accountValidation(account);
			personValidation(person);
		}
		//Aca van los ifs en cascada
	}
	
	public void accountValidation (JSONObject account) {
		
		if(!account.has("accountId") || (!account.has("balance")) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
		} else {
			String accountId = account.getString("accountId");
			String balance = account.getString("balance");
		}
	}
            
	public void personValidation (JSONObject person){
            
		if(!person.has("name") || !person.has("surname") || !person.has("dni") || !person.has("birthday") 
		|| !person.has("nationality") || !person.has("contactInformation")) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
		} else {
			String name = person.getString("name");
			String surname = person.getString("surname");
			String dni = person.getString("dni");
			String birthday = person.getString("birthday");
			String nationality = person.getString("nationality");
			
			JSONObject contactInformation = new JSONObject(request.getParameter("contactInformation"));
			contactInformationValidation(contactInformation);
		}
	}
	
	public void contactInformationValidation (JSONObject contactInformation) {
            
		if(!contactInformation.has("phone") || !contactInformation.has("mobilePhone") || !contactInformation.has("email")
		 || !contactInformation.has("locationInformation")) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
		} else {
			String phone = contactInformation.getString("phone");
			String mobilePhone = contactInformation.getString("mobilePhone");
			String email = contactInformation.getString("email");
			
			JSONObject locationInformation = new JSONObject(request.getParameter("locationInformation"));
			locationInformationValidation(locationInformation);
		}
	}
	
	public void locationInformationValidation (JSONObject locationInformation) {
		
		JSONObject locationInformationStatus = new JSONObject();
		
		if(!locationInformation.has("address") || !locationInformation.has("zipcode") 
			|| !locationInformation.has("province") || !locationInformation.has("country")) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			locationInformationStatus.put(false);
		} else {
			String address = locationInformation.getString("address");
			String zipcode = locationInformation.getString("zipcode");
			String province = locationInformation.getString("province");
			String country = locationInformation.getString("country");
            locationInformationStatus.put(true);
		}
	}
}
