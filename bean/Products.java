package com.te.ProductManagementSystem.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Products_info")
public class Products implements Serializable{
	
	@Id
	@Column(name="prod_id")
	private int id;
	@Column(name="prod_name")
	private String name;
	@Column(name="release_date")
	private String date;
	private String category;
}
