package com.vaibhav.week3.BookeCommerce.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="Admin")
public class Admin {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long aid;
    private String aname;
    private String aemail;
    private String apassword;

}
