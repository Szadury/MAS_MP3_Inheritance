package com.pjwstk.MAS.Actors;

public class UserStandard extends User {

    public UserStandard(String imie, String nazwisko, String email, String password, String nickname) {
        super(imie, nazwisko, email, password, nickname);
    }

    public UserStandard(User user){
        super(user.getImie(), user.getNazwisko(), user.getEmail(), user.getPassword(), user.getNickname());
    }


    @Override
    public String toString() {
        return "UserStandard{" +
                "nickname='" + nickname + '\'' +
                ", level=" + level +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
