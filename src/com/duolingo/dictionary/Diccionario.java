package com.duolingo.dictionary;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Diccionario {
    private final Map<Character, Set<String>> mapaPalabras;
    private final Map<Character, Set<String>> mapaVerbosFrases;

    public Diccionario() {
        mapaPalabras = new TreeMap<>();
        mapaVerbosFrases = new TreeMap<>();
    }
}
