package com.tourist;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.tourist.model.Tourist;
import com.tourist.repository.TouristRepository;


@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
public class TouristRepositoryTests {
	
	@Autowired
	private TouristRepository trepo;
	
	@Test
	public void saveTouristTest() {
		Tourist t=new Tourist();
		t.setId(1016L);
		t.setFirstname("Tanu");
		t.setLastname("Mishra");
		t.setGender("Male");
		t.setAge(23);
		t.setFromplace("Kanpur");
		t.setVisitdays(4);
		trepo.save(t);
		Assertions.assertThat(t.getId()).isGreaterThan(0);			
	}
	
	@Test
	public void getAllTouristTest() {
		List<Tourist> t=(List<Tourist>) trepo.findAll();
		Assertions.assertThat(t.size()).isGreaterThan(0);
	}
}
