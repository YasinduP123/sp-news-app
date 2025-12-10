package org.yasindu.sptask.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yasindu.sptask.dto.NewsDto;
import org.yasindu.sptask.service.NewsService;

import java.util.List;


@RestController
@RequestMapping("/api/v1/news")
@RequiredArgsConstructor
public class NewsController {

	private final NewsService newsService;

	@PostMapping
	public ResponseEntity<NewsDto> createNews(@Valid @RequestBody NewsDto request) {
		return ResponseEntity.ok(newsService.createNews(request));
	}

	@GetMapping
	public ResponseEntity<List<NewsDto>> getAllNews() {
		return ResponseEntity.ok(newsService.getAllNews());
	}

	@GetMapping("/{id}")
	public ResponseEntity<NewsDto> getNewsById(@PathVariable Long id) {
		return ResponseEntity.ok(newsService.getNewsByCategory(id));
	}

	@PutMapping("/{id}")
	public ResponseEntity<NewsDto> updateNews(
			@PathVariable Long id,
			@RequestBody NewsDto request) {
		return ResponseEntity.ok(newsService.updateNews(id, request));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteNews(@PathVariable Long id) {
		newsService.deleteNews(id);
		return ResponseEntity.ok("News successfully deleted");
	}
}
