package com.spring.book.hellospring.web.dao;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloReponseDto {

    private final String name;
    private final int amount;
}
