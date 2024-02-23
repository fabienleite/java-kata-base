package com.zenika.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DNATranslatorTest {

    DNATranslator dnaTranslator = new DNATranslator();

    @Test
    void test_dna_translates_correctly_when_we_have_proteins() {
        // Given
        var dnaStream = "AGGACGGGCTAACTCCGCTCGTCACAAAGCGCAATGCAGCTATGGCAGATGTTCATGCCG";

        // When
        var proteins = dnaTranslator.getProteinsFromDNA(dnaStream);

        // Then
        assertThat(proteins).isEqualTo("MNICHSCIALCDERS");
    }

}
