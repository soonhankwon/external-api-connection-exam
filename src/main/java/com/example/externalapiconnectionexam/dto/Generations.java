package com.example.externalapiconnectionexam.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Generations(
        @JsonProperty("text")
        String text,
        @JsonProperty("tokens")
        Integer tokens) {
}
