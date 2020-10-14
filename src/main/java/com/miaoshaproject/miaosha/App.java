package com.miaoshaproject.miaosha;

import com.miaoshaproject.miaosha.dao.UserDOMapper;
import com.miaoshaproject.miaosha.dataObject.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
@SpringBootApplication
@RestController
// MapperScan作用：指定要变成实现类的接口所在的包，然后包下面的所有接口在编译之后都会生成相应的实现类
@MapperScan("com.miaoshaproject.miaosha.dao")
public class App extends SpringBootServletInitializer {

//    @Autowired
//    private UserDOMapper userDOMapper;
//
//
//    @RequestMapping("/")
//    public String home() {
//        UserDO userDO = userDOMapper.selectByPrimaryKey(1);
//
//        if (userDO == null) {
//            return "用户对象不存在";
//        } else {
//            return userDO.getName();
//        }
//
////        return "springmvc!";
//    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(App.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}
