package com.midutek.charger.response;


import com.midutek.charger.exception.ErrorCode;

/**
 * Created by z1ven on 2018/3/14.
 */
public class JsonBean<T> {

    private int error_code;

    private boolean success;

    private String msg;

    private T data;

    public JsonBean() {

    }

    public JsonBean(ErrorCode errorCode, T data) {
        this.error_code = errorCode.getCode();
        this.success = errorCode.isSuccess();
        this.msg = errorCode.getMsg();
        this.data = data;
    }

    public JsonBean(ErrorCode errorCode) {
        this.error_code = errorCode.getCode();
        this.success = errorCode.isSuccess();
        this.msg = errorCode.getMsg();
        this.data = null;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
