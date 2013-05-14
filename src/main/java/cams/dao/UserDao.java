package cams.dao;

import cams.service.domain.User;
import cams.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Сергей
 * Date: 12.05.13
 * Time: 22:07
 */
@Repository
public class UserDao implements IUserDao {
    @Override
    public long createUser(String login, String phone) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User temp = new User();
        temp.setLogin(login);
        temp.setPhone(phone);
        session.save(temp);
        session.getTransaction().commit();
        return temp.getId();
    }

    @Override
    public void updateUser(int id, String login, String phone) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User temp = new User();
        temp.setLogin(login);
        temp.setPhone(phone);
        temp.setId(id);
        session.saveOrUpdate(temp);
        session.getTransaction().commit();
    }

    @Override
    public void deleteUser(int id) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(session.get(User.class,id));
        session.getTransaction().commit();
    }

    @Override
    public List<User> getAllUsers() throws Exception {
        return HibernateUtil.getSessionFactory().openSession()
                .createQuery("select usr from User as usr").list();
    }

    @Override
    public User getUsersByLogin(String login) throws Exception {
        List<User> usrs = HibernateUtil.getSessionFactory().openSession()
                .createQuery("select usr from User as usr where usr.login=:login").setString("login",login).list();
        if (usrs.size()>0)
            return usrs.get(0);
        else
            return null;
    }

    @Override
    public User getUsersById(int id) throws Exception {
        return (User)HibernateUtil.getSessionFactory().openSession().get(User.class,id);
    }


    /**
     * This method returns list of ${@link cams.service.domain.User} by appropriate search key.
     * <p/>
     * The method should search by login, phone and partial matches.
     *
     * @param key search key
     * @return list of ${@link cams.service.domain.User}
     */

    @Override
    public List<User> findByKey(String key) throws Exception {
        return HibernateUtil.getSessionFactory().openSession()
                .createQuery("select usr from User as usr where usr.login like %:keyparam% or " +
                        "usr.phone like %:keyparam%").setString("keyparam",key).list();
    }

}
