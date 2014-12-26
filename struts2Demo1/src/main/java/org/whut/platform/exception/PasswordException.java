package org.whut.platform.exception;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-12-12
 * Time: 上午10:33
 * To change this template use File | Settings | File Templates.
 */
public class PasswordException extends Exception {

    private String message;


    public PasswordException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
