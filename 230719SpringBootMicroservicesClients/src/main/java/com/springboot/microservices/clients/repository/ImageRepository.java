package com.springboot.microservices.clients.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.microservices.clients.bean.Image;
import com.springboot.microservices.clients.entity.ImageEntity;

@Repository
public interface ImageRepository extends JpaRepository<ImageEntity, Long>{

	ImageEntity save(Image imageInfo);

}
