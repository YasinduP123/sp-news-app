package org.yasindu.sptask.service;

import org.jspecify.annotations.Nullable;
import org.yasindu.sptask.dto.NewsDto;

import java.util.List;

public interface NewsService {
	NewsDto createNews(NewsDto request);
	List<NewsDto> getAllNews();
	NewsDto getNewsByCategory(Long id);
	NewsDto updateNews(Long id, NewsDto request);
	void deleteNews(Long id);
}
