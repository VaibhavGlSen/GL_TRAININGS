package com.vaibhav.Week2Project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Customers")
public class Customer {


		@Id
		@GeneratedValue
		private int cid;
		private String customerName;
		private String clocation;
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getClocation() {
			return clocation;
		}
		public void setClocation(String clocation) {
			this.clocation = clocation;
		}
		
}
