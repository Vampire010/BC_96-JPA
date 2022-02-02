package com.entity;

import java.io.Serializable;

import java.lang.String;
import javax.persistence.*;




@Entity
@Table(name="student")
public class Student implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3077817771476073923L;

	@Id
	private int id;
	
	private String name;
	

	private long fees;
	

	public Student() 
	{
		super();

	}  
 
	public Student(int id , String name,long fees ) 
	{
		super();
		this.id=id;
		this.name=name;
		this.fees=fees;
	}  
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public long getFees() {
		return this.fees;
	}

	public void setFees(long fees) {
		this.fees = fees;
	} 
   
}
