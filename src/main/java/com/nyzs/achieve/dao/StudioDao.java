package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.ProfileDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudioDao {
    List<ProfileDto> getProfiles(String type) throws Exception;

    ProfileDto getProfileById(Integer id) throws Exception;

    void updateProfileInfo(ProfileDto profileDto) throws Exception;

    void insertProfileInfo(ProfileDto profileDto) throws Exception;

    void deleteProfileById(Integer id) throws Exception;
}
