package com.klebercoding.jpa.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Author extends BaseEntity
{
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
