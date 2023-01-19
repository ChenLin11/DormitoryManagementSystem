package com.cl.entity.exception;

import com.cl.utils.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class EIExceptionHandler {
    //指定出现什么异常执行该方法
    @ExceptionHandler(EIException.class)
    @ResponseBody  //返回数据
    public R error(Exception e){
        e.printStackTrace();
        return R.error("执行全局异常处理");
    }
}