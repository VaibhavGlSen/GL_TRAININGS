package com.vaibhav.week3.BookeCommerce.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
@Table(name="Books")
public class Books {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long bid;
    private String name;
    private String category;
    @OneToOne
   // @JoinColumn(name="ub_fid")
    private User student;

}
