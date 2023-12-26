package ru.netology.dao_layer_with_hibernate.repository;

import ru.netology.dao_layer_with_hibernate.entity.Person;

import java.util.List;

public interface PersonDAO {

    List<Person> getPersonsByCity(String city);
}
