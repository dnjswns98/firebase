package com.example.firebaseemailaccount;

/**
 * 사용자 계정 정보 모델 클래스
 * 닉네임이나 유저메세지 등 더 많은 것을 저장가능
 */

public class UserAccount {
    private String emailId;
    private String password;
    private String idToken; //Firebase Uid (고유 토큰정보) 사용자 하나의 계정만 고유하게 가질 수 있음

    //firebase realtime database를 쓸때는 모델클래스를 이용해서 정보를 가져올때 기본생성자를 넣어줘야한다 아니면 오류 생김
    public UserAccount() { }

    public String getIdToken() {
        return idToken;
    }
    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
