package com.lukaszstyk.AddNumbers;

public class RequestResult {

    RandomWrapper random;
    String bitsUsed;
    String bitsLeft;
    String requestsLeft;
    String advisoryDelay;

    public RequestResult(RandomWrapper random, String bitsUsed, String bitsLeft, String requestsLeft, String advisoryDelay) {
        this.random = random;
        this.bitsUsed = bitsUsed;
        this.bitsLeft = bitsLeft;
        this.requestsLeft = requestsLeft;
        this.advisoryDelay = advisoryDelay;
    }

    public RandomWrapper getRandom() {
        return random;
    }

    public void setRandom(RandomWrapper random) {
        this.random = random;
    }

    public String getBitsUsed() {
        return bitsUsed;
    }

    public void setBitsUsed(String bitsUsed) {
        this.bitsUsed = bitsUsed;
    }

    public String getBitsLeft() {
        return bitsLeft;
    }

    public void setBitsLeft(String bitsLeft) {
        this.bitsLeft = bitsLeft;
    }

    public String getRequestsLeft() {
        return requestsLeft;
    }

    public void setRequestsLeft(String requestsLeft) {
        this.requestsLeft = requestsLeft;
    }

    public String getAdvisoryDelay() {
        return advisoryDelay;
    }

    public void setAdvisoryDelay(String advisoryDelay) {
        this.advisoryDelay = advisoryDelay;
    }
}
