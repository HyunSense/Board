package com.board.dto;

import lombok.Data;

@Data
public class PageDTO {

    private int pageStart;
    private int pageEnd;
    private boolean next, prev;
    private int total;
    private SearchDto cri;

    public PageDTO(SearchDto cri, int total) {

        this.cri = cri;
        this.total = total;

        this.pageEnd = (int) (Math.ceil(cri.getPage() / 10.0)) * 10;

        this.pageStart = this.pageEnd - 9;




    }

}