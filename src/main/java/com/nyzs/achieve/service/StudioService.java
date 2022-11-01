package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.ProfileDto;
import com.nyzs.achieve.bean.vo.ProfileVo;

import java.util.List;

public interface StudioService {
    List<ProfileDto> getProfiles(String type) throws Exception;

    ProfileDto getProfileById(Integer id) throws Exception;

    void submitProfileInfo(ProfileVo profileVo) throws Exception;

    void deleteProfileById(Integer id) throws Exception;
}
