package com.spring.book.hellospring.web.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String title;
    private String content;

    public PostsUpdateRequestDto (String title, String content) {
        this.title = title;
        this.content = content;
    }
}
