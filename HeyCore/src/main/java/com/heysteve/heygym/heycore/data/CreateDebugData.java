/*Daro 09/17/2017: This class sets the data for debugin the app*/
package com.heysteve.heygym.heycore.data;

import com.heysteve.heygym.heycore.model.User;
import com.heysteve.heygym.heycore.dao.UserDao;


public class CreateDebugData {
		
	public static void initialize () {
		//Testing IntelliJ

		User myuser = new User();
		System.out.println("EAAAA");
		myuser.setUserName("Dario");
		myuser.setEmail("d@d.com");
    }
	
}
