package com.example.externalapiconnectionexam.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GptApiRequest(
        @JsonProperty("prompt")
        String prompt,
        @JsonProperty("max_tokens")
        Integer maxTokens) {
}
