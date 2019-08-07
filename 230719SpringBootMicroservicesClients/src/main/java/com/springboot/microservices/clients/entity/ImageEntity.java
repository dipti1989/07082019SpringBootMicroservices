package com.springboot.microservices.clients.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "image")
@Data
public class ImageEntity {
	
	@Id
	@Column(name = "imageid")
	private int imageId;
	@Column(name = "imagename")
	private String imageName;
	@Column(name = "imageurl")
	private String imageUrl;


}
