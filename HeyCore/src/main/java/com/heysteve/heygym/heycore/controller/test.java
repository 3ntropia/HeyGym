package com.heysteve.heygym.heycore.controller;

import com.heysteve.heygym.heycore.dao.SessionDao;
import com.heysteve.heygym.heycore.model.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by marti on 1/5/2017.
 */
@Controller
public class test {

    @Autowired
    private SessionDao userDao;

    @RequestMapping("/create")
    @ResponseBody
    public String create(String email, String name) {
        String userId = "";
        try {
            Session user = new Session(email, name);
            userDao.save(user);
            userId = String.valueOf(user.getSessionId());
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created with id = " + userId;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(int id) {
        try {
            Session user = new Session(id);
            userDao.delete(user);
        }
        catch (Exception ex) {
            return "Error deleting the user:" + ex.toString();
        }
        return "User succesfully deleted!";
    }

    /**
     * GET /get-by-email  --> Return the id for the user having the passed
     * email.
     */
   /* @RequestMapping("/get-by-email")
    @ResponseBody
    public String getByEmail(String email) {
        String userId = "";
        try {
            Session user = userDao.findByEmail(email);
            userId = String.valueOf(user.getSessionId());
        }
        catch (Exception ex) {
            return "User not found";
        }
        return "The user id is: " + userId;
    }*/

    /**
     * GET /update  --> Update the email and the name for the user in the
     * database having the passed id.
     */
    @RequestMapping("/update")
    @ResponseBody
    public String updateUser(long id, String email, String name) {
        try {
            Session user = userDao.findOne(id);
            user.setEmail(email);
            user.setEmail(name);
            userDao.save(user);
        }
        catch (Exception ex) {
            return "Error updating the user: " + ex.toString();
        }
        return "User succesfully updated!";
    }
}
