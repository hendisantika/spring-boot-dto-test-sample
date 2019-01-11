package com.hendisantika.springbootdtotestsample.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hendisantika.springbootdtotestsample.dto.PeopleDTO;
import com.hendisantika.springbootdtotestsample.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-dto-test-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-12
 * Time: 05:29
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class PersonRestController {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    @Autowired
    private ObjectMapper objectMapper;

    @RequestMapping("/getPersonDTO")
    public PersonDTO getPersonDTO(@RequestParam(value = "personDTO") String jsonPersonDTO)
            throws IOException {
        return getPersonDTOFromJson(jsonPersonDTO);
    }

    private PersonDTO getPersonDTOFromJson(final String jsonPersonDTO) throws IOException {
        return objectMapper.setDateFormat(simpleDateFormat).readValue(jsonPersonDTO, PersonDTO.class);
    }

    @RequestMapping("/getPersonDTOList")
    public List<PersonDTO> getPersonDTOList(
            @RequestParam(value = "personDTO") String jsonPersonDTO,
            @RequestParam(value = "personDTO2") String jsonPersonDTO2)
            throws IOException {
        final PersonDTO personDTO = getPersonDTOFromJson(jsonPersonDTO);
        final PersonDTO personDTO2 = getPersonDTOFromJson(jsonPersonDTO2);
        return Arrays.asList(personDTO, personDTO2);
    }

    @RequestMapping("/getPeopleDTO")
    public PeopleDTO getPeopleDTO(
            @RequestParam(value = "personDTO") String jsonPersonDTO,
            @RequestParam(value = "personDTO2") String jsonPersonDTO2)
            throws IOException {
        final PersonDTO personDTO = getPersonDTOFromJson(jsonPersonDTO);
        final PersonDTO personDTO2 = getPersonDTOFromJson(jsonPersonDTO2);
        return new PeopleDTO(Arrays.asList(personDTO, personDTO2));
    }
}

