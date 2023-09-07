package com.board.repository;


import com.board.entity.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface BoardMapper {

    List<Notice> findAll(Notice notice);

    Optional<Notice> findByNum(Long num);

    int findAllCnt(Notice notice);

}
