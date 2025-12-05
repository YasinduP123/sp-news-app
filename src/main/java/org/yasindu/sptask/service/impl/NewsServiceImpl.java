package org.yasindu.sptask.service.impl;

import org.yasindu.sptask.dto.NewsDto;
import org.yasindu.sptask.response.NewsResponse;
import org.yasindu.sptask.service.NewsService;

import java.util.List;

public class NewsServiceImpl implements NewsService {
	@Override
	public NewsResponse createNews(NewsDto request) {
		return null;
	}

	@Override
	public List<NewsResponse> getAllNews() {
		return List.of();
	}

	@Override
	public NewsResponse getNewsByCategory(Long id) {
		return null;
	}

	@Override
	public NewsResponse updateNews(Long id, NewsDto request) {
		return null;
	}

	@Override
	public void deleteNews(Long id) {

	}
}
