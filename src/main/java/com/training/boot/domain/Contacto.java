package com.training.boot.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "contacto")
@Data
public class Contacto {
	@Id
	private String id;
	private String name;
	private Number phone;
	private Boolean enabled;
}
