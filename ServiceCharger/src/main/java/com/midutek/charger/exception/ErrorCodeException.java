package com.midutek.charger.exception;

/**
 * 用户自定义异常抛出格式
 */
public class ErrorCodeException extends Exception {

    ErrorCode errorCode;

    public static final ErrorCode PARAM_INVALID = new ErrorCode(1001, "参数异常");
    public static final ErrorCode DATA_NULL = new ErrorCode(1002, "数据不存在");
    public static final ErrorCode DELETE_ERR = new ErrorCode(1003, "删除失败");
    public static final ErrorCode SYSTEM_ERROR = new ErrorCode(1004, "系统错误");

    public ErrorCodeException(ErrorCode errorCode){
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
