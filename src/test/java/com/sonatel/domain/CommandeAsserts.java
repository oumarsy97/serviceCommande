package com.sonatel.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class CommandeAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertCommandeAllPropertiesEquals(Commande expected, Commande actual) {
        assertCommandeAutoGeneratedPropertiesEquals(expected, actual);
        assertCommandeAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertCommandeAllUpdatablePropertiesEquals(Commande expected, Commande actual) {
        assertCommandeUpdatableFieldsEquals(expected, actual);
        assertCommandeUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertCommandeAutoGeneratedPropertiesEquals(Commande expected, Commande actual) {
        assertThat(expected)
            .as("Verify Commande auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertCommandeUpdatableFieldsEquals(Commande expected, Commande actual) {
        assertThat(expected)
            .as("Verify Commande relevant properties")
            .satisfies(e -> assertThat(e.getReferentiel()).as("check referentiel").isEqualTo(actual.getReferentiel()))
            .satisfies(e -> assertThat(e.getUserId()).as("check userId").isEqualTo(actual.getUserId()))
            .satisfies(e -> assertThat(e.getDateCommande()).as("check dateCommande").isEqualTo(actual.getDateCommande()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertCommandeUpdatableRelationshipsEquals(Commande expected, Commande actual) {
        // empty method
    }
}
