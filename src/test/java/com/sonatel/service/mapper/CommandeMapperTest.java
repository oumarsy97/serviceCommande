package com.sonatel.service.mapper;

import static com.sonatel.domain.CommandeAsserts.*;
import static com.sonatel.domain.CommandeTestSamples.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CommandeMapperTest {

    private CommandeMapper commandeMapper;

    @BeforeEach
    void setUp() {
        commandeMapper = new CommandeMapperImpl();
    }

    @Test
    void shouldConvertToDtoAndBack() {
        var expected = getCommandeSample1();
        var actual = commandeMapper.toEntity(commandeMapper.toDto(expected));
        assertCommandeAllPropertiesEquals(expected, actual);
    }
}
