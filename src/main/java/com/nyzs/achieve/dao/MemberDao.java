package com.nyzs.achieve.dao;

import com.nyzs.achieve.bean.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberDao {

    List<MemberDto> getMembers(String name, String type, String academic, String skillName1, String techName) throws Exception;

    MemberDto getMemberById(Integer id) throws Exception;

    void deleteMemberById(Integer id) throws Exception;

    void updateMemberInfo(MemberDto memberDto) throws Exception;

    void insertMemberInfo(MemberDto memberDto) throws Exception;
}
