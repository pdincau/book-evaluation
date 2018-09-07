package com.sc.bookdetail.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
public class EvaluationsController {

    @GetMapping("/evaluations/{isbn}")
    List<Evaluation> find(@PathVariable("isbn") String isbn) {
        if (isbn.equals("12345")) {
            return asList(new Evaluation("Great Book!"));
        }
        return asList(new Evaluation("Amazing :)"), new Evaluation("Must Read!"));
    }
    private class Evaluation {

        private String text;

        public Evaluation(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}
