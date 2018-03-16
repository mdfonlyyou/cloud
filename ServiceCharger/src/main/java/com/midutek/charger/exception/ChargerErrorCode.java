package com.midutek.charger.exception;

/**
 * Created by z1ven on 2018/3/14
 * 系统自定义错误
 */
public class ChargerErrorCode extends ErrorCode {

    public static final ChargerErrorCode ACCOUNT_NULL = new ChargerErrorCode(2001, "账号不存在");

    public ChargerErrorCode(int code, String msg) {
        super(code, msg);
    }
}
