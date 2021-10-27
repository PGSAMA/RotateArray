package com.Paolo.Controllers;


import com.Paolo.bean.newArray;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/demo")
public class DemoController {

 @RequestMapping(value="/Array2", method = RequestMethod.GET)
 public newArray getArray(HttpServletRequest request){
     newArray p=new newArray();

   return p;
 }

}
