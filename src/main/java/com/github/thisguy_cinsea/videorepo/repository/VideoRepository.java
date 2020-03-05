package com.github.thisguy_cinsea.videorepo.repository;

import com.github.thisguy_cinsea.videorepo.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {
}
