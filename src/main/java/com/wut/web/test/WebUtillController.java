package com.wut.web.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //스프링이 패키지를 읽어 web.이하 하위 파일들 중 특정 어노테이션이 붙어있는 클래스 파일들을 new에서 (IOC) 스프링 컨테이너에서 관리해줍니다.
public class WebUtillController {

	@GetMapping("/test/hello")
	public String hello() {
		
		return "<h1>hello spring boot<h2>";
	}
}
