package com.sonatel.domain;

import static com.sonatel.domain.CommandeTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.sonatel.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class CommandeTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Commande.class);
        Commande commande1 = getCommandeSample1();
        Commande commande2 = new Commande();
        assertThat(commande1).isNotEqualTo(commande2);

        commande2.setId(commande1.getId());
        assertThat(commande1).isEqualTo(commande2);

        commande2 = getCommandeSample2();
        assertThat(commande1).isNotEqualTo(commande2);
    }
}
