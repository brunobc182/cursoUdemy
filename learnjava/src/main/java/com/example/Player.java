package com.example;

/**
 * Created by bruno on 07/07/16.
 */
public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;

    public Player() {
        handleName = "Unknown player";
    }

    public Player(String handle) {
        setHandleName(handle);
        this.lives = 3;
        this.level = 1;
        this.score = 0;
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handle) {
        if (handle.length() < 4)
            return;
        handleName = handle;
    }

    public void setNameAndLevel(String name, int level) {
        this.handleName = name;
        this.level = 1;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
