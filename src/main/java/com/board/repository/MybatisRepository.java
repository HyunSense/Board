package com.board.repository;

import com.board.entity.Notice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MybatisRepository {

    private final BoardMapper boardMapper;

    public List<Notice> findAll(Notice notice) {
        return boardMapper.findAll(notice);
    }

    public Optional<Notice> findByNum(Long num) {

        return boardMapper.findByNum(num);
    }

    public int findAllCnt(Notice notice) {
        return boardMapper.findAllCnt(notice);
    }


}
