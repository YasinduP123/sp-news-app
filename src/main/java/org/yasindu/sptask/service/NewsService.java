package org.yasindu.sptask.service;

import org.jspecify.annotations.Nullable;
import org.yasindu.sptask.dto.NewsDto;
import org.yasindu.sptask.response.NewsResponse;

import java.util.List;

public interface NewsService {
	NewsResponse createNews(NewsDto request);
	List<NewsResponse> getAllNews();
	NewsResponse getNewsByCategory(Long id);
	NewsResponse updateNews(Long id, NewsDto request);
	void deleteNews(Long id);
}
