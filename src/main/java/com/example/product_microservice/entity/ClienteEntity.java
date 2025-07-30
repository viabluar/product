package com.example.product_microservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(value="proveedor")
@Getter
@Setter
@NoArgsConstructor

public class ClienteEntity {


    @Id
	private String id;
	private String Name;
	private String descuento;
	private String clienteRFC;

}
