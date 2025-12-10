package org.yasindu.sptask.dto;

import jakarta.validation.constraints.NotEmpty;

public record CategoryDto(
		Long id,
		@NotEmpty
		String name
) {
}
