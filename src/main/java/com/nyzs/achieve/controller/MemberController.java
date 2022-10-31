package com.nyzs.achieve.controller;

import com.nyzs.achieve.bean.dto.MemberDto;
import com.nyzs.achieve.bean.dto.RuleDto;
import com.nyzs.achieve.bean.vo.MemberVo;
import com.nyzs.achieve.bean.vo.ResponseResult;
import com.nyzs.achieve.bean.vo.RuleVo;
import com.nyzs.achieve.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：成员管理 Controller
 * @date ：2022/10/31 13:52
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/studio")
@RestController
public class MemberController {

    private static Logger logger = LoggerFactory.getLogger(MemberController.class);

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/getMembers", method = RequestMethod.GET)
    public ResponseResult getMembers(String name, String type, String academic, String skillName1, String techName) {
        try {
            List<MemberDto> memberDtoList = memberService.getMembers(name, type, academic, skillName1, techName);
            System.out.println(memberDtoList);
            return ResponseResult.ok(memberDtoList, "成员信息查询成功");
        } catch (Exception e) {
            logger.error("成员信息查询错误", e);
            return ResponseResult.failed(e.getMessage(), "成员信息查询失败");
        }
    }

    @RequestMapping(value = "/getMemberById", method = RequestMethod.GET)
    public ResponseResult getMemberById(Integer id) {
        try {
            MemberDto memberDto = memberService.getMemberById(id);
            return ResponseResult.ok(memberDto, "成员信息查询成功");
        } catch (Exception e) {
            logger.error("成员信息查询错误", e);
            return ResponseResult.failed(e.getMessage(), "成员信息查询失败");
        }
    }

    @RequestMapping(value = "/submitMemberInfo", method = RequestMethod.POST)
    public ResponseResult submitMemberInfo(
            MemberVo memberVo
    ) {
        try {
            memberService.submitMemberInfo(memberVo);
            return ResponseResult.ok("成员信息登记成功");
        } catch (Exception e) {
            logger.error("成员信息提交错误", e);
            return ResponseResult.failed(e.getMessage(), "成员信息登记失败");
        }
    }

    @RequestMapping(value = "/deleteMemberById", method = RequestMethod.DELETE)
    public ResponseResult deleteMemberById(Integer id) {
        try {
            memberService.deleteMemberById(id);
        } catch (Exception e) {
            logger.error("成员信息删除错误", e);
            return ResponseResult.failed(e.getMessage(), "成员信息删除失败");
        }
        return ResponseResult.ok("成员信息删除成功");
    }

}
