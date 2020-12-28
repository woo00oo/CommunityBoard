package com.web.repository;

import com.web.domain.Board;
import com.web.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board,Long> {

    Board findByUser(User user);
}
