package com.klebercoding.jpa.repositories;

import com.klebercoding.jpa.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer>
{
}
