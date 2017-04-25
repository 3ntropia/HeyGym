package com.heysteve.heygym.heycore.business;

import com.heysteve.heygym.heycore.dao.SessionDao;
import com.heysteve.heygym.heycore.model.Session;

/**
 * Created by martinh on 26/3/2017.
 */
public class SessionBO {

    private SessionDao sessionDao;

    public void save(Session session){
        sessionDao.saveSession(session);
    }

    public SessionDao getSessionDao() {
        return sessionDao;
    }

    public void setSessionDao(SessionDao sessionDao) {
        this.sessionDao = sessionDao;
    }
}
