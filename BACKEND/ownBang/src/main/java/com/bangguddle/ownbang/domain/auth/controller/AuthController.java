package com.bangguddle.ownbang.domain.auth.controller;

import com.bangguddle.ownbang.domain.auth.dto.DuplicateResponse;
import com.bangguddle.ownbang.domain.auth.dto.LoginRequest;
import com.bangguddle.ownbang.domain.auth.dto.UserSignUpRequest;
import com.bangguddle.ownbang.domain.auth.service.AuthService;
import com.bangguddle.ownbang.global.dto.Tokens;
import com.bangguddle.ownbang.global.enums.NoneResponse;
import com.bangguddle.ownbang.global.response.Response;
import com.bangguddle.ownbang.global.response.SuccessResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auths")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;


    @PostMapping("/sign-up")
    public ResponseEntity<Response<NoneResponse>> signUp(@RequestBody UserSignUpRequest request) {
        SuccessResponse<NoneResponse> response = authService.signUp(request);
        return Response.success(response);
    }

    @GetMapping("/duplicates/email")
    public ResponseEntity<Response<DuplicateResponse>> checkEmailDuplicate(@RequestParam String email) {
        SuccessResponse<DuplicateResponse> response = authService.checkEmailDuplicate(email);
        return Response.success(response);
    }

    @GetMapping("/duplicates/phone")
    public ResponseEntity<Response<DuplicateResponse>> checkPhoneNumberDuplicate(@RequestParam String phoneNumber) {
        SuccessResponse<DuplicateResponse> response = authService.checkPhoneNumberDuplicate(phoneNumber);
        return Response.success(response);
    }

    @PostMapping("/login")
    public ResponseEntity<Response<Tokens>> login(@RequestBody LoginRequest request) {
        SuccessResponse<Tokens> response = authService.login(request);
        return Response.success(response);
    }

}

