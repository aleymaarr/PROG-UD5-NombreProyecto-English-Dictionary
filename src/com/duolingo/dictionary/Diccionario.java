package com.duolingo.dictionary;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Diccionario {

    private final Map<Character, Set<String>> mapaPalabras;
    private final Map<Character, Set<String>> mapaVerbosFrases;

    public Diccionario() {
        mapaPalabras = new TreeMap<>();
        mapaVerbosFrases = new TreeMap<>();
    }

    public boolean agregarPalabra(String palabra) {
        if (palabra.contains(" ")) {
            return agregarVerboFrasal(palabra);
        }

        Character inicial = Character.toLowerCase(palabra.charAt(0));
        palabra = palabra.trim().toLowerCase();

        if (!mapaPalabras.containsKey(inicial)) {
            mapaPalabras.put(inicial, new TreeSet<>());
        }

        return mapaPalabras.get(inicial).add(palabra);
    }



}
