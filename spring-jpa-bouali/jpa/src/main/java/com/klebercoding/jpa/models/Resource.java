package com.klebercoding.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "resource_type") --> ONLY with SINGLE_TABLE
public class Resource
{
	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	private int size;

	private String url;

	@OneToOne
	@JoinColumn(name = "lecture_id")
	private Lecture lecture;
}
