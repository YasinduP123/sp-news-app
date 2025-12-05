package org.yasindu.sptask.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.yasindu.sptask.dto.NewsDto;
import org.yasindu.sptask.entity.NewsEntity;
import org.yasindu.sptask.repository.NewsRepository;
import org.yasindu.sptask.service.NewsService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {

	private final ModelMapper mapper;
	private final NewsRepository repository;

	@Override
	public NewsDto createNews(NewsDto request) {
		NewsEntity news = mapper.map(request, NewsEntity.class);
		repository.save(news);
		return mapper.map(news, NewsDto.class);
	}

	@Override
	public List<NewsDto> getAllNews() {
		List<NewsEntity> all = repository.findAll();
		return List.of(all);
	}

	@Override
	public NewsDto getNewsByCategory(Long id) {
		return null;
	}

	@Override
	public NewsDto updateNews(Long id, NewsDto request) {
		return null;
	}

	@Override
	public void deleteNews(Long id) {

	}
}
