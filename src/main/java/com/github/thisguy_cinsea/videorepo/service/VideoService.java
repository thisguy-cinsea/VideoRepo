package com.github.thisguy_cinsea.videorepo.service;

import com.github.thisguy_cinsea.videorepo.model.Video;
import com.github.thisguy_cinsea.videorepo.model.VideoInterface;
import com.github.thisguy_cinsea.videorepo.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService implements ServiceInterface<VideoRepository, VideoInterface, Video>{

    @Autowired
    private VideoRepository repository;
    @Override
    public VideoRepository getRepository() {
        return this.repository;
    }
//    private VideoRepository repository;
//
//    @Autowired
//    public VideoService(VideoRepository repository) {
//        this.repository = repository;
//    }
//
//    public List<Video> getAll() {
//        return repository.findAll();
//    }
//
//    public Video getById(Integer videoId) {
//        return repository.findById(videoId).orElse(null);
//    }
//
    public Video create(Video video) {
        Video newVideo = new Video();
        newVideo.setVideoDescription(video.getVideoDescription());
        newVideo.setVideoLink(video.getVideoLink());
        return repository.save(newVideo);
    }
//
//    public Video update(Integer videoId, Video video) {
//        Video foundVideo = getById(videoId);
//        foundVideo.setVideoLink(video.getVideoLink());
//        foundVideo.setVideoDescription(video.getVideoDescription());
//        return repository.save(foundVideo);
//    }
//
//    public Video delete(Integer videoId) {
//        Video deletedVideo = getById(videoId);
//        repository.delete(deletedVideo);
//        return deletedVideo;
//    }
}
