package com.pjwstk.MAS.Actors;

public abstract class User extends Person{
    String nickname;
    int level;

    public User(String imie, String nazwisko, String email, String password, String nickname) {
        super(imie, nazwisko, email, password);
        this.nickname = nickname;
        this.level = 1;
    }

    @Override
    public void showOwnedList() {
        System.out.println("Does not own anything");
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void addOwnedElement(Object object) throws Exception {
        throw new Exception("User doesn't own anything");
    }
}
