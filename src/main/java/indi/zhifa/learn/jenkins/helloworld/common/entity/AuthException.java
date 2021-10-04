package indi.zhifa.learn.jenkins.helloworld.common.entity;

public class AuthException extends ServiceException{
    public AuthException(String pMsg){
        super(401,pMsg);
    }
}
