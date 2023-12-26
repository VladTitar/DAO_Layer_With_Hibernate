package ru.netology.dao_layer_with_hibernate.service;

import ru.netology.dao_layer_with_hibernate.entity.Person;

import java.util.List;

public interface PersonService {

    List<Person> getPersonsByCity(String city);
}
