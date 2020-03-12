package com.github.thisguy_cinsea.videorepo.model;

public interface VideoInterface extends EntityInterface {
    String getVideoDescription();
    String getVideoLink();

    void setVideoDescription(String description);
    void setVideoLink(String link);
}
