package com.vaibhav.week3.BookeCommerce.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name="User")
public class User {


		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		private long uid;
	    private String name;
	    private String email;
	    private String password;
	    @OneToMany ( targetEntity =Books.class, fetch = FetchType.LAZY)
	    @JoinColumn( name = "ub_fid", referencedColumnName = "uid")
	    private List<Books> books;
}
