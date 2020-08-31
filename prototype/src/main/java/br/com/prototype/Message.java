package br.com.prototype;

import java.time.LocalDateTime;

public class Message extends CommunicationTool {

    private String from;
    private String to;
    private LocalDateTime time;
    private String text;

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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CommunicationTool clone() throws CloneNotSupportedException {
        return (Message) super.clone();
    }
}