package com.nyzs.achieve.service;

import com.nyzs.achieve.bean.dto.MemberDto;
import com.nyzs.achieve.bean.vo.MemberVo;

import java.util.List;

public interface MemberService {
    void deleteMemberById(Integer id) throws Exception;

    void submitMemberInfo(MemberVo memberVo) throws Exception;

    MemberDto getMemberById(Integer id) throws Exception;

    List<MemberDto> getMembers(String name, String type, String academic, String skillName1, String techName) throws Exception;
}
