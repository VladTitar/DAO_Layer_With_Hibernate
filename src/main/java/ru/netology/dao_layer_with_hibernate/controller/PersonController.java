package ru.netology.dao_layer_with_hibernate.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.netology.dao_layer_with_hibernate.entity.Person;
import ru.netology.dao_layer_with_hibernate.service.PersonService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    @GetMapping("/by-city")
    @ResponseBody
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return personService.getPersonsByCity(city);
    }
}
