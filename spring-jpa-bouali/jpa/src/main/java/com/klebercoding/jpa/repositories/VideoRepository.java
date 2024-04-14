package com.klebercoding.jpa.repositories;

import com.klebercoding.jpa.models.Video;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer>
{
}
