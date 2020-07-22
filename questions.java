package com.example.quiz;

public class questions {
    private int mques_id;
    private boolean mans_true;

    public questions(int mques_id, boolean mans_true) {
        this.mques_id = mques_id;
        this.mans_true = mans_true;
    }

    public void setques_id(int mques_id) {
        this.mques_id = mques_id;
    }

    public void setans_true(boolean mans_true) {
        this.mans_true = mans_true;
    }

    public int getques_id() {
        return mques_id;
    }

    public boolean isans_true() {
        return mans_true;
    }
}
