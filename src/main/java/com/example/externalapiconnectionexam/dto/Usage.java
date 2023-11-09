package com.example.externalapiconnectionexam.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Usage(
        @JsonProperty("prompt_tokens")
        Integer promptTokens,
        @JsonProperty("generated_tokens")
        Integer generatedTokens,
        @JsonProperty("total_tokens")
        Integer totalTokens) {
}
