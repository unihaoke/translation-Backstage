package com.hzu.translate.controller;

import com.hzu.translate.common.Result;
import com.hzu.translate.common.StatusCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一异常处理类
 */
@RestControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Result exception(Exception e){
        e.printStackTrace();
        return new Result(false,StatusCode.ERROR,e.getMessage());
    }
}
