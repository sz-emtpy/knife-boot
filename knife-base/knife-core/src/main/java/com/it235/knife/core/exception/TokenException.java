package com.it235.knife.core.exception;

import com.it235.knife.core.http.ResultCode;

/**
 * @description:
 * @author: jianjun.ren
 * @date: Created in 2020/9/25 14:10
 */
public class TokenException extends BaseException {
    public TokenException(ResultCode resultCode) {
        super(resultCode);
    }

    public TokenException(Integer code, String message) {
        super(code, message);
    }
}
