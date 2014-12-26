package org.whut.platform.exception;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-12-11
 * Time: 下午5:03
 * To change this template use File | Settings | File Templates.
 */
public class UsernameException extends Exception {

    private String message;

    public UsernameException(String message) {
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
