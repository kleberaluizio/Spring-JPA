package com.klebercoding.jpa.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author
{
	@Id
	@GeneratedValue
	private Integer id;
	@Column(
		name = "f_name",
		length = 35
	)
	private String firstName;
	private String lastName;
	@Column(
		unique = true,
		nullable = false
	)
	private String email;
	private int age;
	@ManyToMany(mappedBy = "authors")
	private List<Course> courses;
}