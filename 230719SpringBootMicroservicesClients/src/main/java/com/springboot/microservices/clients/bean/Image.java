package com.springboot.microservices.clients.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Image {
	private int imageId;
	private String imageName;
	private String imageUrl;
	
	public Image() {
		
	}

}
