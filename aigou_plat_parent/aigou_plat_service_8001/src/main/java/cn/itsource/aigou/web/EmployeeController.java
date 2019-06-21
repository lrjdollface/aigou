package cn.itsource.aigou.web;

import cn.itsource.aigou.AjaxResult;
import cn.itsource.aigou.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    //RequestBody 用于接收页面的对象值
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult employeecontroller(@RequestBody Employee employee){
            if ("admin".equals(employee.getUsername())&& "admin".equals(employee.getPassword())){
                return AjaxResult.me();
            }else {
                return AjaxResult.me().setSuccess(false).setMsg("失败");
            }
    }
    @RequestMapping(value = "/login1",method = RequestMethod.GET)
    public AjaxResult employeecontroller1(){
            return AjaxResult.me();
    }
}
