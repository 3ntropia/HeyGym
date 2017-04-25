package com.heysteve.heygym.heycore.dao;

import com.heysteve.heygym.heycore.model.Session;

/**
 * Created by martinh on 26/3/2017.
 */
public class SessionDao extends DaoImpl {

    SessionDao sessionDao;

    public void saveSession(Session session){
        sessionDao.save(session);
    }
}
