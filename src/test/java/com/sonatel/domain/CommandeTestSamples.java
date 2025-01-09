package com.sonatel.domain;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class CommandeTestSamples {

    private static final Random random = new Random();
    private static final AtomicLong longCount = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));

    public static Commande getCommandeSample1() {
        return new Commande().id(1L).referentiel("referentiel1").userId("userId1");
    }

    public static Commande getCommandeSample2() {
        return new Commande().id(2L).referentiel("referentiel2").userId("userId2");
    }

    public static Commande getCommandeRandomSampleGenerator() {
        return new Commande()
            .id(longCount.incrementAndGet())
            .referentiel(UUID.randomUUID().toString())
            .userId(UUID.randomUUID().toString());
    }
}
