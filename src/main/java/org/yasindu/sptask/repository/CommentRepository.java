package org.yasindu.sptask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yasindu.sptask.entity.CommentsEntity;

public interface CommentRepository extends JpaRepository<CommentsEntity	, Long> {
}
