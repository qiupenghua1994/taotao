package com.taotao.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.pojo.DataPo;

@Controller
public class GridTestController {

	@RequestMapping(value="/grid", method=RequestMethod.POST)
	@ResponseBody
	public void test(@RequestBody  Map<String,String> map){
		
		System.out.println(map.toString());
	}
}
  