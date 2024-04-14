package com.klebercoding.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
public class Resource extends BaseEntity
{
	private String name;
	private int size;
	private String url;
	@OneToOne
	@JoinColumn(name = "lecture_id")
	private Lecture lecture;
}
