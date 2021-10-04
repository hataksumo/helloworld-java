package indi.zhifa.learn.jenkins.helloworld.controller.view;

import indi.zhifa.learn.jenkins.helloworld.common.entity.RestResponse;
import indi.zhifa.learn.jenkins.helloworld.common.entity.ServiceException;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "TestApi:测试接口")
@RequestMapping("/api/v1.0/test")
@AllArgsConstructor
@RestController
public class HelloWorld {
    @Operation(summary = "hello_world")
    @PostMapping("")
    public RestResponse<String> hello() throws ServiceException {
        return RestResponse.ok("hello");
    }
}
