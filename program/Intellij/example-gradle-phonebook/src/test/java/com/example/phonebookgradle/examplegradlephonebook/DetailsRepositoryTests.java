package com.example.phonebookgradle.examplegradlephonebook;

import com.example.phonebookgradle.examplegradlephonebook.entity.Details;
import com.example.phonebookgradle.examplegradlephonebook.entity.Person;
import com.example.phonebookgradle.examplegradlephonebook.repo.DetailsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class DetailsRepositoryTests {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private DetailsRepository detailsRepository;

    @Test
    public void testCreateDetails(){

        Person person = entityManager.persist(new Person(1,"Hema","Rajan","hema.rajan@gmail.com"));

        Details details = detailsRepository.save(new Details(1,"9876767890","work"));

        assertThat(details).isNotNull();
        assertThat(details.getDetailId()).isGreaterThan(0);
    }

}
