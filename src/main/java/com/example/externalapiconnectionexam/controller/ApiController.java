package com.example.externalapiconnectionexam.controller;

import com.example.externalapiconnectionexam.dto.GptApiResponse;
import com.example.externalapiconnectionexam.service.ApiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/test")
public class ApiController {

    private final ApiService apiService;


    @GetMapping
    public ResponseEntity<GptApiResponse> getApiMethod() {
        GptApiResponse res = apiService.getApiMethod();
        return ResponseEntity.ok().body(res);
    }
}
