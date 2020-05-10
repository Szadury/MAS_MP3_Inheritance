package com.pjwstk.MAS.Actors;

public class UserPremium extends User {

    private String phoneNumber;

    public UserPremium(String imie, String nazwisko, String email, String password, String nickname) {
        super(imie, nazwisko, email, password, nickname);
    }

    public UserPremium(User user, String phoneNumber){
        super(user.getImie(), user.getNazwisko(), user.getEmail(), user.getPassword(), user.getNickname());
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "UserPremium{" +
                "nickname='" + nickname + '\'' +
                ", level=" + level +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
