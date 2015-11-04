package com.scott.dev.taobao.api.fenxiao.domain;

//查询分页结构
public class QueryPagination {

    //当前页码数
    private Number pageIndex;

    //分页记录个数，如果用户输入的记录数大于50，则一页显示50条记录
    private Number pageSize;

    public Number getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Number pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Number getPageSize() {
        return pageSize;
    }

    public void setPageSize(Number pageSize) {
        this.pageSize = pageSize;
    }
}
