package me.desu.springjpatest;

import me.desu.springjpatest.repository.TableParentOneToManyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJpaTestApplicationTests {

    @Autowired
    private TableParentOneToManyRepository repository;

    @Test
    void selectAllTest() {
        repository.findAll();
    }
}
