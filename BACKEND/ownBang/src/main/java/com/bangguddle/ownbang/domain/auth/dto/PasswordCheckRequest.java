package com.bangguddle.ownbang.domain.auth.dto;

import jakarta.validation.constraints.NotBlank;

public record PasswordCheckRequest(@NotBlank String password) {
}