package com.gxchain.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GxcMemoData extends GxcEntity {

    private String from;

    private String to;

    private String nonce;

    private String message;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"from\":\"").append(from).append('\"');
        sb.append(", \"to\":\"").append(to).append('\"');
        sb.append(", \"nonce\":\"").append(nonce).append('\"');
        sb.append(", \"message\":\"").append(message).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
