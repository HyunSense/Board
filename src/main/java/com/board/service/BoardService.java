package com.board.service;


import com.board.entity.Notice;
import com.board.repository.MybatisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final MybatisRepository mybatisRepository;





    public List<Notice> findNoticeList(Notice notice) {

        return mybatisRepository.findAll(notice);
    }

    public Optional<Notice> findByNum(Long num) {

        return mybatisRepository.findByNum(num);
    }

    public int findByNoticeCount(Notice notice){
        return mybatisRepository.findAllCnt(notice);

    }


}
