package com.sda.spring.mvc.hibernate.dao;

import com.sda.spring.mvc.hibernate.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User findOne(long id) {
        return entityManager.find(User.class, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> findAll() {
        return entityManager.createQuery("from User").getResultList();
    }

    // persist se foloseste pentru entitatile nou create
    @Override
    public void create(User user) {
        entityManager.persist(user);
    }

    // merge se foloseste pentru entitatile care au fost create, dar au fost detasate
    @Override
    public User update(User user) {
        return entityManager.merge(user);
    }

    @Override
    public void delete(User user) {
        entityManager.remove(user);
    }

    @Override
    public void deleteById(long id) {
        final User user = findOne(id);
        delete(user);
    }
}
