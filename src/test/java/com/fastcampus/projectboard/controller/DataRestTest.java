package com.fastcampus.projectboard.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@DisplayName("Data REST API est")
@Transactional
@AutoConfigureMockMvc
@SpringBootTest
public class DataRestTest {

    private final MockMvc mvc;

    public DataRestTest(@Autowired MockMvc mvc){
        this.mvc = mvc;
    }

    @DisplayName("[api] board list search")
    @Test
    void givenNothing_whenRequestArticles_thenReturnArticlesJsonResponse () throws Exception {
        //given

        //when & Then
        mvc.perform(get("/api/articles"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));

    }

    @DisplayName("[api] board one article search")
    @Test
    void givenNothing_whenRequestArticle_thenReturnArticleJsonResponse () throws Exception {
        //given

        //when & Then
        mvc.perform(get("/api/articles/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));

    }
    @DisplayName("[api] board comments list search")
    @Test
    void givenNothing_whenRequestArticleCommentsFromArticle_thenReturnArticleCommentsJsonResponse () throws Exception {
        //given

        //when & Then
        mvc.perform(get("/api/articles/1/articleComments"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));

    }
    @DisplayName("[api] comments list search")
    @Test
    void givenNothing_whenRequestArticleComments_thenReturnArticleCommentsJsonResponse () throws Exception {
        //given

        //when & Then
        mvc.perform(get("/api/articleComments"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));

    }
    @DisplayName("[api] a comment search")
    @Test
    void givenNothing_whenRequestArticleComment_thenReturnArticleCommentJsonResponse () throws Exception {
        //given

        //when & Then
        mvc.perform(get("/api/articleComments/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));
    }
    
}
