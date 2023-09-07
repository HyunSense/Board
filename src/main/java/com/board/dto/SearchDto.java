package com.board.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchDto {

    private int page;
    private int recordSize;
    private int pageSize;
    private String searchType;
    private String keyword;

    public SearchDto() {
        this(1, 10);
    }

    public String[] getTypeArray() {
        return searchType == null ? new String[]{} :searchType.split("");
    }

    public void setPage(int page) {
        this.page = page;
    }

    public SearchDto(int page, int pageSize) {
        this.page = page;
        this.pageSize = pageSize;
    }


}
