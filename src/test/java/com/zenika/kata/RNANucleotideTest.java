package com.zenika.kata;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RNANucleotideTest {
    @Nested
    class fromDNANucleotide {
        @Test
        void when_we_give_A_we_get_U() {
            assertThat(RNANucleotide.fromDNANucleotide(DNANucleotide.A))
                    .isEqualTo(RNANucleotide.U);
        }

        @Test
        void when_we_give_T_we_get_A() {
            assertThat(RNANucleotide.fromDNANucleotide(DNANucleotide.T))
                    .isEqualTo(RNANucleotide.A);
        }

        @Test
        void when_we_give_C_we_get_G() {
            assertThat(RNANucleotide.fromDNANucleotide(DNANucleotide.C))
                    .isEqualTo(RNANucleotide.G);
        }

        @Test
        void when_we_give_G_we_get_C() {
            assertThat(RNANucleotide.fromDNANucleotide(DNANucleotide.G))
                    .isEqualTo(RNANucleotide.C);
        }
    }
}
