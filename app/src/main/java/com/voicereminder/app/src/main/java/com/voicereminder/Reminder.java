package com.voicereminder;

public class Reminder {
    private int id;
    private String text;
    private String status;
    private String timestamp;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }
}
