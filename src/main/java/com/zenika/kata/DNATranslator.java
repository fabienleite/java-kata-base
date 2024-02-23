package com.zenika.kata;

import java.util.Arrays;
import java.util.List;

public class DNATranslator {

    public String getProteinsFromDNA(String dnaStreamAsString) {
        var dnaAsList = this.convertToDNAStream(dnaStreamAsString);
        var rnaStream = this.convertToRNA(dnaAsList);
        return "";
    }

    private List<RNANucleotide> convertToRNA(List<DNANucleotide> dnaStream) {
        return dnaStream.reversed().stream()
                .map(RNANucleotide::fromDNANucleotide)
                .toList();
    }

    private List<DNANucleotide> convertToDNAStream(String dnaStreamAsString) {
        return Arrays.stream(dnaStreamAsString.split(""))
                .map(DNANucleotide::valueOf)
                .toList();
    }
}
