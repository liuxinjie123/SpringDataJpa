package com.spring.data;

import com.spring.data.dto.UnionKey;
import com.spring.data.entity.IdClassDemo;
import com.spring.data.repository.IdClassDemoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootTest
class SpringDataJpaApplicationTests {
	@Autowired
	private IdClassDemoRepository idClassDemoRepository;

	@Test
	void contextLoads() {
		System.out.println(" test : " + LocalDateTime.now());
	}

	@Test
	public void test() {
		IdClassDemo demo = new IdClassDemo();
		demo.setIdOne("IdOne");
		demo.setIdTwo("IdTwo");
		demo.setContext("hello");

		idClassDemoRepository.save(demo);

		Optional<IdClassDemo> op = idClassDemoRepository.findById(new UnionKey("IdOne", "IdTwo"));
		Assertions.assertEquals("hello", op.get().getContext());
	}
}
