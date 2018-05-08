package wq.exception;

/**
 * 活动业务异常类
 * @author FCG
 */
public class ActivityServiceException extends RuntimeException {
    private static final long serialVersionUID = -9142937352935713735L;
    /**
     * 错误代码
     */
    private int exceptionCode;

    public ActivityServiceException(int exceptionCode,String message){
        super(message);
        this.exceptionCode = exceptionCode;
    }
    public ActivityServiceException() {
        super();
    }

    public ActivityServiceException(String message) {
        super(message);
    }

    public ActivityServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ActivityServiceException(Throwable cause) {
        super(cause);
    }

    protected ActivityServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public int getExceptionCode() {
        return exceptionCode;
    }

    public void setExceptionCode(int exceptionCode) {
        this.exceptionCode = exceptionCode;
    }
}
