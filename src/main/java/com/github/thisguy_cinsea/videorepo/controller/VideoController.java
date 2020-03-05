package com.github.thisguy_cinsea.videorepo.controller;

import com.github.thisguy_cinsea.videorepo.model.Video;
import com.github.thisguy_cinsea.videorepo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/video")
public class VideoController {

    @Autowired
    private VideoService service;

    @GetMapping("/")
    public List<Video> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Video getById(@PathVariable(value = "id") Integer videoId){
        return service.getById(videoId);
    }

    @PostMapping("/")
    public Video create(@Valid @RequestBody Video video){
        return service.create(video);
    }

    @PutMapping("/{id}")
    public Video update(@PathVariable (value = "id") Integer videoId,
                       @Valid @RequestBody Video video){
        return service.update(videoId, video);
    }

    @DeleteMapping("/{id}")
    public Video delete(@PathVariable (value = "id") Integer videoId){
        return service.delete(videoId);
    }
}
