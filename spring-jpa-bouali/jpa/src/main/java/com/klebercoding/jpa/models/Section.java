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
public class Section
{
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private int sectionOrder;
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;
	@OneToMany(mappedBy = "section")
	private List<Lecture> lectures;
}
