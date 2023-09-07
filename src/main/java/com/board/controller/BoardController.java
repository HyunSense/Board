package com.board.controller;


import com.board.entity.Notice;
import com.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/notice")
    public String displayNotice(@ModelAttribute Notice notice, Model model) {

        List<Notice> noticeList = boardService.findNoticeList(notice);
        int count = boardService.findByNoticeCount(notice);

        log.info("Notice = {}", noticeList.get(0));
        log.info("notice count = {}", count);

        model.addAttribute("noticeList", noticeList);
        model.addAttribute("count", count);

        return "view/board/notice_list";
    }

}
