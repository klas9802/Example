package com.mycompany.example.repository;

import com.mycompany.example.model.Unit;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UnitRepository {
    @PersistenceContext(unitName = "example")
    private EntityManager em;
    public Unit FindById(Integer id){
        return em.find(Unit.class, id);
    }
}
