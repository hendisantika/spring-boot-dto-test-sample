package com.hendisantika.springbootdtotestsample.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-dto-test-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-12
 * Time: 05:31
 * To change this template use File | Settings | File Templates.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PersonRestControllerTest {
    @Autowired
    private PersonRestController controller;

    @Test
    public void controllerInitializedCorrectly() {
        assertThat(controller).isNotNull();
    }
}