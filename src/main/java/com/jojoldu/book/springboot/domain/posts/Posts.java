package com.jojoldu.book.springboot.domain.posts;


import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor//기본 생성자
@Entity//테이블과 매칭될 클래스다
public class Posts extends BaseTimeEntity {

    @Id//PK로 들어오는 값
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title,String content,String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }

    public void update(String title,String content){
        this.title=title;
        this.content=content;
    }
}
