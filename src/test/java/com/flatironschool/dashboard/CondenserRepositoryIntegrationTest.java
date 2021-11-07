package com.flatironschool.dashboard;

import com.flatironschool.dashboard.model.Condenser;
import com.flatironschool.dashboard.model.repository.CondenserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class CondenserRepositoryIntegrationTest {

    @Autowired
    private CondenserRepository condenserRepository;

    @Test
    public void whenCalledSave_thenCorrectNumberOfUsers() {
        condenserRepository.save(new Condenser(
                "Ben",
                UUID.randomUUID().toString(),
                "condenser1.png",
                LocalDateTime.now()));
        List<Condenser> condensers = (List<Condenser>) condenserRepository.findAll();

        assertThat(condensers.size()).isEqualTo(1);
    }
}
