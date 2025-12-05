package org.yasindu.sptask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yasindu.sptask.entity.NewsEntity;

public interface NewsRepository extends JpaRepository<NewsEntity, Long> {
}
