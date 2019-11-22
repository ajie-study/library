package com.family.exception;

import com.family.constant.CodeEnum;
import com.family.model.ResultModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

/**
 * 
 * @author ajie
 * @Description 全局异常返回类
 * @date 2019-11-22 9:41
 *
 */

@ControllerAdvice //全局异常的处理
@Slf4j
@ResponseBody
public class MyExceptionHandler {


    //    @ExceptionHandler(value={RuntimeException.class,MyRuntimeException.class})针对不同类型的异常
    //    @ExceptionHandler//默认处理所有异常
    @ExceptionHandler
    public ResponseEntity<ResultModel> exceptionHandler(Exception e, HttpServletResponse response) {

        ResultModel resultModel = new ResultModel();
        resultModel.setStatus(CodeEnum.getCode(e.getMessage()));
        resultModel.setMessage(e.getMessage());
        // 记录日志
        e.printStackTrace();
        log.warn(e.getMessage(),e);
        return ResponseEntity.status(response.getStatus()).body(resultModel);

    }

}
