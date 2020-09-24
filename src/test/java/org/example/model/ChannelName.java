package org.example.model;

public enum ChannelName {
    FACE("FACE"),
    EC("EC");

    public final String name;

    ChannelName(String name) {
        this.name = name;
    }

    public static ChannelName getChannelNameFromString(String name) {
        for (ChannelName channelName : ChannelName.values()) {
            if (channelName.name.equalsIgnoreCase(name)) {
                return channelName;
            }
        }
        return null;
    }
}
