package com.klebercoding.jpa.repositories;

import com.klebercoding.jpa.models.Text;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextRepository extends JpaRepository<Text,Integer>
{
}
