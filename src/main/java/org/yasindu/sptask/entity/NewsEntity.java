package org.yasindu.sptask.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.yasindu.sptask.dto.CategoryDto;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "news")
public class NewsEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String content;

	@ManyToMany
	@JoinTable(
			name = "place_category",
			joinColumns = @JoinColumn(name = "place_id", nullable = false),
			inverseJoinColumns = @JoinColumn(name = "category_id", nullable = false)
	)
	private List<CategoryEntity> categories;

	@OneToMany(
			mappedBy = "news"
	)
	private List<CommentsEntity> news;
}
