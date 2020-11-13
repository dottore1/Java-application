package com.BrewMES.demo.API;
//Class for wrapping string responses in a simple object assosiating the http response code.
public class StringResponse {

    private String response;
    private int status;

    public StringResponse(String response, int status) {
        this.response = response;
        this.status = status;
    }

    public String getResponse() {
        return response;
    }

    public int getStatus() {
        return status;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
