package com.lukaszstyk.AddNumbers;

public class RandomWrapper {
    String[] data;
    String completionTime;

    public RandomWrapper(String[] data, String completionTime) {
        this.data = data;
        this.completionTime = completionTime;
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    public String getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(String completionTime) {
        this.completionTime = completionTime;
    }
}
