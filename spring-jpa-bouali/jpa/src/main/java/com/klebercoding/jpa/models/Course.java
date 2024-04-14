package com.klebercoding.jpa.models;

import jakarta.persistence.*;
import java.util.List;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
public class Course extends BaseEntity
{

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
