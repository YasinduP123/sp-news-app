package org.yasindu.sptask.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="category")
public class CategoryEntity {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String commentText;

	@ManyToMany
	@JoinTable(
			name = "news_category",
			joinColumns = @JoinColumn(name = "category_id", nullable = false),
			inverseJoinColumns = @JoinColumn(name = "news_id", nullable = false)
	)
	private List<NewsEntity> news;

	@ManyToMany(mappedBy = "categories")
	private List<NewsEntity> categories;
}
