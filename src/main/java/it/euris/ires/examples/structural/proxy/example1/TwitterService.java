package it.euris.ires.examples.structural.proxy.example1;

public interface TwitterService {
    String getTimeline(String screenName);

    void postToTimeline(String screenName, String message);
}
