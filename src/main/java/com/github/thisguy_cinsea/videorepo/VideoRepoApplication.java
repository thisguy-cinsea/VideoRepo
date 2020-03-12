package com.github.thisguy_cinsea.videorepo;

import com.github.thisguy_cinsea.videorepo.model.User;
import com.github.thisguy_cinsea.videorepo.model.Video;
import com.github.thisguy_cinsea.videorepo.repository.UserRepository;
import com.github.thisguy_cinsea.videorepo.repository.VideoRepository;
import com.github.thisguy_cinsea.videorepo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VideoRepoApplication implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;
    @Autowired
    VideoRepository videoRepository;


    public static void main(String[] args) {
        SpringApplication.run(VideoRepoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        User will = new User();
        will.setUserName("w.ancona");
        will.setPassword("password123");

        User william = new User();
        william.setPassword("password");
        william.setUserName("ancona.w");

        userRepository.save(will);
        userRepository.save(william);

        Video video1 = new Video();
        video1.setVideoLink("https://www.youtube.com/embed/ouwCWDbBskU");
        video1.setVideoDescription("Kanye West - Power");

        Video video2 = new Video();
        video2.setVideoLink("https://www.youtube.com/embed/1aEImx74gLA");
        video2.setVideoDescription("Young Jeezy - Put On");

        videoRepository.save(video1);
        videoRepository.save(video2);
    }
}
