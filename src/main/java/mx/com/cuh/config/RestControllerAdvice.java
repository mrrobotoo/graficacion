package mx.com.cuh.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import mx.com.cuh.pojo.Response;

@org.springframework.web.bind.annotation.RestControllerAdvice
public class RestControllerAdvice  {
	@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Response> handleIllegalArgument(Exception e) {
		Response errorResponse = new Response(e.getMessage(), HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
