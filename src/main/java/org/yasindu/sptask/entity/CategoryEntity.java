package org.yasindu.sptask.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="comments")
public class CategoryEntity {
	private Long id;
	private String commentText;

	@ManyToMany(
			mappedBy = "comments"
	)
	private Long newsId;
}
