package org.example;

public class RnaTranscription {
    public String transcribe(String dnaStrand) {
        StringBuilder rnaComplement = new StringBuilder();

        for (char nucleotide : dnaStrand.toCharArray()) {
            switch (nucleotide) {
                case 'G':
                    rnaComplement.append('C');
                    break;
                case 'C':
                    rnaComplement.append('G');
                    break;
                case 'T':
                    rnaComplement.append('A');
                    break;
                case 'A':
                    rnaComplement.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Invalid DNA nucleotide: " + nucleotide);
            }
        }

        return rnaComplement.toString();    }

}
