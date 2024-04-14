package com.klebercoding.jpa.models;

import jakarta.persistence.*;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Course
{
	@Id
	@GeneratedValue
	private Integer id;
	private String title;
	private String description;
	@ManyToMany
	@JoinTable(
		name = "courses_authors",
		joinColumns = {
			@JoinColumn(name = "course_id")
		},
		inverseJoinColumns = {
			@JoinColumn(name = "author_id")
		}
	)
	private List<Author> authors;
	@OneToMany(mappedBy = "course")
	private List<Section> sections;
}
