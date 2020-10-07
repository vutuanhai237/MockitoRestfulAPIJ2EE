package com.tma.week3Practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Score")
@Setter
@Getter
public class Score {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int student_id;
	private String name;
	private double point;
//	@ManyToOne()
//	@JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
//	private Student student;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

}
