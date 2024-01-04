package org.son.day07.exception.oop;

public class Student {
    // 필드(멤버변수)
    private String name;
    private int firstScore;
    private int secondScore;

    // 생성자
    public Student() {

    }

    // setter 메소드
    public void setName(String name) {
        this.name = name;
    }

    public void setFirstScore(int firstScore) {
        this.firstScore = firstScore;
    }

    public void setSecondScore(int secondScore) {
        this.secondScore = secondScore;
    }

    // getter 메소드
    public String getName() {
        return name;
    }

    public int getFirstScore() {
        return firstScore;
    }

    public int getSecondScore() {
        return secondScore;
    }
}