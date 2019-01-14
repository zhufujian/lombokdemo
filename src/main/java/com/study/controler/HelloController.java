package com.study.controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.study.dto.Goods;

@Slf4j
@Controller
public class HelloController {

	@RequestMapping("/good")
	public String getGood(ModelAndView modelAndView, HttpServletRequest request, HttpServletResponse response){
		int id = Integer.valueOf(request.getParameter("id"));
		log.info("getGood请求");
		Goods goods=new Goods();
		if(1000==id){
			goods.setId(1000);
			goods.setName("testA");
			goods.setPrice(12.00f);
			goods.setQuantity(10);
		}
		log.info("getGood请求返回报文："+goods.toString());
		modelAndView.addObject("good", goods);
		return "success";
	}
}
