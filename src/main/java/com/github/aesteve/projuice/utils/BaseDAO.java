package com.github.aesteve.projuice.utils;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public abstract class BaseDAO {

  @Autowired
  protected EntityManager em;

  private CriteriaBuilder cb() {
    return em.getCriteriaBuilder();
  }

  private<T> CriteriaQuery<T> createQuery(Class<T> clazz) {
    return cb().createQuery(clazz);
  }

  protected <T> CriteriaQuery<T> from(Class<T> clazz) {
    CriteriaQuery<T> query = createQuery(clazz);
    query.from(clazz);
    return query;
  }

  protected <T> List<T> select(CriteriaQuery<T> query) {
    return em.createQuery(query).getResultList();
  }

}
