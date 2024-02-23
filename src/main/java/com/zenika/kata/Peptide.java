package com.zenika.kata;

public enum Peptide {
    Phe,
    Leu,
    Ser,
    Tyr,
    Stop,
    Sys,
    Trp,
    Arg,
    Gln,
    Pro,
    Ile,
    Met,
    Thr,
    Asn,
    Lys,
    Val,
    Ala,
    Asp,
    Glu,
    Gly;

    public static Peptide fromCordon(Cordon cordon) {
        throw new RuntimeException("Not yet implemented");
    }
}
