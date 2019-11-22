package com.family.constant;

/**
 * @author ajie
 * @Description 返回状态码对应的错误信息
 * @date 2019-11-20 17:28
 */
public enum CodeEnum {

    user_not_exist("1001", "用户不存在！"),
    user_password_error("1002", "用户或密码错误！")
    ;

    private String code;

    private String message;


    public String getCode() {

        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    CodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static CodeEnum getReturnCode(String code) {
        for (CodeEnum r : CodeEnum.values()) {
            if (r.code.equals(code)) {
                return r;
            }
        }
        return null;
    }
}
