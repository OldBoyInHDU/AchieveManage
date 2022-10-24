package com.nyzs.achieve.bean.dto;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/10/24 10:12
 */
public class File {
    private String fileName;
    private String storagePath;

    public File() {
    }

    public File(String fileName, String storagePath) {
        this.fileName = fileName;
        this.storagePath = storagePath;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileName='" + fileName + '\'' +
                ", storagePath='" + storagePath + '\'' +
                '}';
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }
}
