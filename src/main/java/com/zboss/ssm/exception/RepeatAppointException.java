package com.zboss.ssm.exception;

/**
 * 重复预约异常
 *
 * @author zbooss
 */
public class RepeatAppointException extends RuntimeException {

    public RepeatAppointException(String message) {
        super(message);
    }

    public RepeatAppointException(String message, Throwable cause) {
        super(message, cause);
    }

}

