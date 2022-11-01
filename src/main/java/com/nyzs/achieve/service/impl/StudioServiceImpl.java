package com.nyzs.achieve.service.impl;

import com.nyzs.achieve.bean.dto.ProfileDto;
import com.nyzs.achieve.bean.vo.ProfileVo;
import com.nyzs.achieve.dao.StudioDao;
import com.nyzs.achieve.service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：工作室设置Service
 * @date ：2022/11/1 8:21
 */
@Service
public class StudioServiceImpl implements StudioService {

    @Autowired
    private StudioDao studioDao;

    @Override
    public List<ProfileDto> getProfiles(String type) throws Exception {
        return studioDao.getProfiles(type);
    }

    @Override
    public ProfileDto getProfileById(Integer id) throws Exception {
        return studioDao.getProfileById(id);
    }

    @Override
    public void submitProfileInfo(ProfileVo profileVo) throws Exception {
        ProfileDto profileDto = new ProfileDto();
        profileDto.setType(profileVo.getType());
        profileDto.setProfile(profileVo.getProfile());
        profileDto.setProfileStoragePath(profileVo.getProfileStoragePath());

        if (studioDao.getProfileById(profileVo.getId()) != null) {
            profileDto.setId(profileVo.getId());
            System.out.println("update:" + profileDto);
            studioDao.updateProfileInfo(profileDto);
        } else {
            System.out.println("insert:" + profileDto);
            studioDao.insertProfileInfo(profileDto);
        }
    }

    @Override
    public void deleteProfileById(Integer id) throws Exception {
        studioDao.deleteProfileById(id);
    }
}
