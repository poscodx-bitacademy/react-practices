package com.poscodx.emaillist.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.poscodx.emaillist.dto.JsonResult;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
	@ResponseBody
	@ExceptionHandler(Exception.class)
	public JsonResult handlerException(Exception e) {
		// 로깅(Logging)
		StringWriter errors = new StringWriter();
		e.printStackTrace(new PrintWriter(errors));
		log.error(errors.toString());

		// 응답
		JsonResult jsonResult =
				(e instanceof NoHandlerFoundException) ?
						JsonResult.fail("Unknown Request") :
						JsonResult.fail(errors.toString());
		
		return jsonResult;
	}
}