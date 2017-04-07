package data.config;

/**
 * Created by Mathias on 07/04/2017.
 */
public class Config {
    private String host;
    private int port;
    private int numberOfGroups;
    private String victimsListPath;
    private String messagesListPath;

    public Config(String host, int port, int numberOfGroups, String victimsListPath, String messagesListPath) {
        this.host = host;
        this.port = port;
        this.numberOfGroups = numberOfGroups;
        this.victimsListPath = victimsListPath;
        this.messagesListPath = messagesListPath;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public String getVictimsListPath() {
        return victimsListPath;
    }

    public String getMessagesListPath() {
        return messagesListPath;
    }
}
