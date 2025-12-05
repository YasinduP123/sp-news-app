package org.yasindu.sptask.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record CommentsDto(
		Long id,
		@NotEmpty
		String commentText,
		@NotNull
		NewsDto news
) {
}
