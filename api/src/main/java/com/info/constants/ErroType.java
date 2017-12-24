package com.info.constants;

public enum ErroType {

    INNER_ERROR(1,"异常错误"),
    PARAMETER_ERROR(2,"参数不合法"),
    BUSINESS_ERROR(3,"业务执行错误");

    private int value;
    private String message;

    private ErroType(int value, String message) {
        this.value = value;
        this.message = message;
    }

    public String message() {
        return message;
    }

    public int value() {
        return value;
    }
}
