package org.example.model;

public class Channel {

    private ChannelName name;

    public Channel(String name) {
        this.name = ChannelName.getChannelNameFromString(name);
    }

    public ChannelName getName() {
        return name;
    }

    public void setName(ChannelName name) {
        this.name = name;
    }
}
