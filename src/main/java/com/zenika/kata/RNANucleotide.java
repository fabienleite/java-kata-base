package com.zenika.kata;

public enum RNANucleotide {
    A,
    U,
    C,
    G;

    public static RNANucleotide fromDNANucleotide(DNANucleotide dnaNucleotide) {
        return switch (dnaNucleotide) {
            case A -> U;
            case T -> A;
            case C -> G;
            case G -> C;
        };
    }
}
