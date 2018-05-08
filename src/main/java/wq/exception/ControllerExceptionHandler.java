package wq.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import wq.entity.ResponseBean;


/**
 * 全局异常处理类
 */
@ControllerAdvice
public class ControllerExceptionHandler {


    /**
     * 处理ActivityServiceException
     * @param ex ServiceException
     * @return 异常信息
     */
    @ExceptionHandler(ActivityServiceException.class)
    @ResponseBody
    public ResponseBean activityExceptionHandle(ActivityServiceException ex) {
        ex.printStackTrace();
        return new ResponseBean(ex,ex.getExceptionCode());
    }

    /**
     * 处理系统异常
     * @param ex
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseBean exceptionHandle(Exception ex) {
        ex.printStackTrace();
        return new ResponseBean(ex,1);
    }
}
















