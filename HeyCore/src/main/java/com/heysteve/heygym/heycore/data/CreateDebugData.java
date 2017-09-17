/*Daro 09/17/2017: This class sets the data for debugin the app*/
package com.heysteve.heygym.heycore.data;

import com.heysteve.heygym.heycore.model.User;
import com.heysteve.heygym.heycore.dao.UserDao;


public class CreateDebugData {
		
	public static void initialize () {
		User myuser = new User();
		System.out.println("eaaaa");
		myuser.setUserName("Dario");
		myuser.setEmail("d@d.com");
		userDao.create(myuser);
    }
	
}
