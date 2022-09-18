package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookslimDto {
    @JsonProperty("id")
    private int id;

    @JsonProperty("title")
    private String title;
}
