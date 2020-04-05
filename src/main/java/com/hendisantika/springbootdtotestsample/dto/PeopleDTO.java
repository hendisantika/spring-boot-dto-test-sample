package com.hendisantika.springbootdtotestsample.dto;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-dto-test-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-12
 * Time: 05:26
 * To change this template use File | Settings | File Templates.
 */
public class PeopleDTO {
    private List<PersonDTO> people;

    public PeopleDTO() {
    }

    public PeopleDTO(List<PersonDTO> people) {
        this.people = people;
    }

    public List<PersonDTO> getPeople() {
        return people;
    }

    public void setPeople() {
        this.people = people;
    }
}
