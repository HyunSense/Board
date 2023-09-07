package com.board.entity;

import lombok.Data;

@Data
public class Notice {


    private Integer num;
    private String category;
    private String title;
    private String noticeDate;
    private Integer hit;


}
