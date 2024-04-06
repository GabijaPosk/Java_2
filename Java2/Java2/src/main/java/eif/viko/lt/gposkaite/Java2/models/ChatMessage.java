package eif.viko.lt.gposkaite.Java2.models;

public class ChatMessage {
    private String content;
    private String sender;
    private long time = System.currentTimeMillis();

    // Getters and setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}