package com.example.externalapiconnectionexam.service;

import com.example.externalapiconnectionexam.dto.GptApiRequest;
import com.example.externalapiconnectionexam.dto.GptApiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ApiService {

    @Value("${kakao.api.key}")
    private String apiKey;

    public GptApiResponse getApiMethod() {
        return WebClient.builder()
                .baseUrl("https://api.kakaobrain.com")
                .build()
                .post()
                .uri("/v1/inference/kogpt/generation")
                .header("Content-Type", "application/json")
                .header("Authorization", "KakaoAK " + apiKey)
                .bodyValue(new GptApiRequest("오늘 먹을 점심 추천해줘" + aiPrompting(), 100))
                .retrieve()
                .bodyToMono(GptApiResponse.class)
                .block();
    }

    private String aiPrompting() {
        return "예를 들어 [파스타가 좋은 선택입니다.!!!!!!!!]";
    }
}
