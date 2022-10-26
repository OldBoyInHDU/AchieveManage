package com.nyzs.achieve.bean.vo;

import com.nyzs.achieve.bean.dto.ImgFile;

import java.io.Serializable;

/**
 * @author ：RukiHuang
 * @description：wangedit 富文本插入图片 res
 * @date ：2022/10/25 9:32
 */
public class ImgResponseResult implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer errno;
    private ImgFile data;



    public Integer getErrno() {
        return errno;
    }

    public void setErrno(Integer errno) {
        this.errno = errno;
    }

    public ImgFile getData() {
        return data;
    }

    public void setData(ImgFile data) {
        this.data = data;
    }
}
