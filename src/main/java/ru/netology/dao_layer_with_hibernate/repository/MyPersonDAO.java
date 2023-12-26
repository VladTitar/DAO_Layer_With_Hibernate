package ru.netology.dao_layer_with_hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.netology.dao_layer_with_hibernate.entity.Person;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MyPersonDAO implements PersonDAO {

    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    public List<Person> getPersonsByCity(String city) {
        return entityManager
                .createQuery("select p from Person p where p.cityOfLiving = :city", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
