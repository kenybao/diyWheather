package com.controller;
import com.domain.UserConfig;
import com.service.UserConfigService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 * Created by bb on 2018/03/12.
 */
@Controller
@RequestMapping("/userConfig/")
public class UserConfigController {

    @Autowired
    UserConfigService userConfigService;

    @RequestMapping("add")
    @ResponseBody
    public String add(UserConfig userConfig) {
        userConfigService.save(userConfig);
        return "";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete(@RequestParam Integer id) {
	    userConfigService.deleteById(id);
	    return "";
    }

    @RequestMapping("update")
    @ResponseBody
    public String update(UserConfig userConfig) {
	    userConfigService.update(userConfig);
	    return "";
    }

    @RequestMapping("detail")
    @ResponseBody
    public String detail(@RequestParam Integer id) {
        UserConfig userConfig = userConfigService.findById(id);
        return userConfig.toString();
    }

    @RequestMapping("list")
    @ResponseBody
    public String list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserConfig> list = userConfigService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return list.toString();
    }
}
