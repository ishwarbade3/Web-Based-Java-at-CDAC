package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@Data
@Entity
@Table
public class InstructorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String youtube_channel;
	@Column
	private String hobby;
	public InstructorDetails(String youtube_channel, String hobby) {
		super();
		this.youtube_channel = youtube_channel;
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return  id + "\t"+ youtube_channel +"\t" + hobby;
	}
	
	

}
