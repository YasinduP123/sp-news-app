package org.yasindu.sptask.dto;

import jakarta.validation.constraints.NotEmpty;

public record NewsDto(
		Long id,
		@NotEmpty
		String title,
		@NotEmpty
		String content,
		CategoryDto category
) {
}
