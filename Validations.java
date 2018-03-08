package com.lmj;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.*;

public class Validations {
	
    public static boolean clientValidation (JSONObject client) {
    
		if(!client.has("clientId") || !client.has("type") || !client.has("account") || !client.has("person")) {
			return false;
		} else {
			JSONObject account = new JSONObject(request.getParameter("account"));
			JSONObject account = new JSONObject(request.getParameter("person"));
			accountValidation(account);
			personValidation(person);
			
			if( !accountValidation && !personValidation == true) {
                return false;
            } else {
                return true;
			}
		}
	}
	
	public void accountValidation (JSONObject account) {
		
		if(!account.has("accountId") || (!account.has("balance")) {
			return false;
		} else {
			return true;
		}
	}
            
	public static boolean personValidation (JSONObject person){
            
		if(!person.has("name") || !person.has("surname") || !person.has("dni") || !person.has("birthday") 
		|| !person.has("nationality") || !person.has("contactInformation")) {
			return false;
		} else {
			JSONObject contactInformation = new JSONObject(request.getParameter("contactInformation"));
			contactInformationValidation(contactInformation);
			
			if( !contactInformationValidation == true) {
                return false;
            } else {
                return true;
			}
		}
	}
	
	public static boolean contactInformationValidation (JSONObject contactInformation) {
            
		if(!contactInformation.has("phone") || !contactInformation.has("mobilePhone") || !contactInformation.has("email")
		 || !contactInformation.has("locationInformation")) {
			return false;
		} else {
			JSONObject locationInformation = new JSONObject(request.getParameter("locationInformation"));
			locationInformationValidation(locationInformation);
			
			if( !locationInformationValidation == true) {
                return false;
            } else {
                return true;
			}
		}
	}
	
	public static boolean locationInformationValidation (JSONObject locationInformation) {
		
		if(!locationInformation.has("address") || !locationInformation.has("zipcode") 
			|| !locationInformation.has("province") || !locationInformation.has("country")) {
			return false;
		} else {
            return true;
		}
	}
}
