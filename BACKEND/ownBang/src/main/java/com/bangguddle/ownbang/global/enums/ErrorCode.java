package com.bangguddle.ownbang.global.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode implements ResponseCode {
    // Auth API
    EMAIL_DUPLICATED(HttpStatus.CONFLICT, "이미 가입한 회원입니다."),
    // Reservation API
    Reservation_DUPLICATED(HttpStatus.CONFLICT, " 이미 다른 사람이 신청된 예약 시간입니다. "),
    Reservation_COMPLETED(HttpStatus.CONFLICT, " 각 매물은 한 건씩만 예약이 가능합니다. "),
    // Common Error Code
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부적 에러가 발생했습니다."),
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "유효하지 않은 요청입니다."),
    NOT_FOUND(HttpStatus.NOT_FOUND, "해당 요청을 찾을 수 없습니다.");
    private final HttpStatus httpStatus;
    private final String message;
}
