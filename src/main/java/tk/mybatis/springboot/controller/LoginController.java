package tk.mybatis.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.springboot.model.UserInfo;
import tk.mybatis.springboot.service.UserInfoService;

/**
 * Created with IntelliJ IDEA.
 * User: kimpan
 * Date: 2017/6/21
 * Time: 9:58
 * Do some description for this class
 */
@RestController
@RequestMapping("/auth")
public class LoginController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "login/{id}/{password}")
    public String login(@PathVariable Integer id, @PathVariable String password){
        UserInfo userInfo = userInfoService.getById(id);
        return "dsafafsafsafdsafsafdsa";
    }

}
