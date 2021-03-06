package com.example.spring.dubbo.consumer.controller;

import com.example.spring.dubbo.consumer.consumer.Consumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@Slf4j
public class ConsumerController {

    @Autowired
    private Consumer consumer;

    @Autowired
    private ConversionService conversionService;

    @RequestMapping("consumer")
    public Map<String, Object> consumer() throws Exception {
        System.out.println("start consumer with controller");
        consumer.consumer("consumerController stat");
        return Collections.emptyMap();
    }

    @RequestMapping("conversion/{id}")
    public Person conversion(@PathVariable("id") Integer id) {
        return conversionService.convert(id, Person.class);
    }


    class Person {
        private Integer id;
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
