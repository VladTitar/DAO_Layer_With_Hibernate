package ru.netology.dao_layer_with_hibernate.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.dao_layer_with_hibernate.repository.PersonDAO;
import ru.netology.dao_layer_with_hibernate.entity.Person;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MyPersonService implements PersonService {

    private final PersonDAO personDao;

    @Override
    public List<Person> getPersonsByCity(String city) {
        return personDao.getPersonsByCity(city);
    }
}
