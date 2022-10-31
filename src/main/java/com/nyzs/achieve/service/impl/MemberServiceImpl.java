package com.nyzs.achieve.service.impl;

import com.nyzs.achieve.bean.dto.MemberDto;
import com.nyzs.achieve.bean.vo.MemberVo;
import com.nyzs.achieve.dao.MemberDao;
import com.nyzs.achieve.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：成员管理Service
 * @date ：2022/10/31 13:53
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    @Override
    public void deleteMemberById(Integer id) throws Exception {
        memberDao.deleteMemberById(id);
    }

    @Override
    public void submitMemberInfo(MemberVo memberVo) throws Exception {
        MemberDto memberDto = new MemberDto();
        memberDto.setName(memberVo.getName());
        memberDto.setType(memberVo.getType());
        memberDto.setGender(memberVo.getGender());
        memberDto.setBirthday(memberVo.getBirthday());
        memberDto.setAcademic(memberVo.getAcademic());
        memberDto.setDegree(memberVo.getDegree());
        memberDto.setSkillName1(memberVo.getSkillName1());
        memberDto.setSkillLevel1(memberVo.getSkillLevel1());
        memberDto.setSkillName2(memberVo.getSkillName2());
        memberDto.setSkillLevel2(memberVo.getSkillLevel2());
        memberDto.setTechName(memberVo.getTechName());
        memberDto.setTechLevel(memberVo.getTechLevel());

        if (memberDao.getMemberById(memberVo.getId()) != null) {
            memberDto.setId(memberVo.getId());
            System.out.println("update:" + memberDto);
            memberDao.updateMemberInfo(memberDto);
        } else {
            System.out.println("insert:" + memberDto);
            memberDao.insertMemberInfo(memberDto);
        }
    }

    @Override
    public MemberDto getMemberById(Integer id) throws Exception {
        return memberDao.getMemberById(id);
    }

    @Override
    public List<MemberDto> getMembers(String name, String type, String academic, String skillName1, String techName) throws Exception {
        return memberDao.getMembers(name, type, academic, skillName1, techName);
    }
}
