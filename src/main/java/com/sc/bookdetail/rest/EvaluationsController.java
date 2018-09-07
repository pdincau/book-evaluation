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

        System.out.println("Received request!");

        if (isbn.equals("12345")) {
            return asList(A_GREAT_BOOK_EVALUATION);
        }
        return asList(AN_AMAZING_BOOK_EVALUATION, A_MUST_READ_EVALUATION);
    }

    private static final Evaluation A_GREAT_BOOK_EVALUATION = new Evaluation("Great Book!");
    private static final Evaluation AN_AMAZING_BOOK_EVALUATION = new Evaluation("Amazing :)");
    private static final Evaluation A_MUST_READ_EVALUATION = new Evaluation("Must Read!");
}
