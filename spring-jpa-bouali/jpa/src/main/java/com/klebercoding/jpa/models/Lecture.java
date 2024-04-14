package com.klebercoding.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Lecture
{
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "section_id")
	private Section section;
}
