package com.example.externalapiconnectionexam.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record GptApiResponse(
        @JsonProperty("id")
        String id,
        @JsonProperty("generations")
        List<Generations> generations,
        @JsonProperty("usage")
        Usage usage) {
}
