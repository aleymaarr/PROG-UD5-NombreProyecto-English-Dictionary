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

    private boolean agregarVerboFrasal(String verboFrasal) {
        Character inicial = Character.toLowerCase(verboFrasal.charAt(0));
        verboFrasal = verboFrasal.trim().toLowerCase();

        if (!mapaVerbosFrases.containsKey(inicial)) {
            mapaVerbosFrases.put(inicial, new TreeSet<>());
        }

        return mapaVerbosFrases.get(inicial).add(verboFrasal);
    }

    public boolean eliminarPalabra(String palabra) {
        Character inicial = Character.toLowerCase(palabra.charAt(0));
        palabra = palabra.trim().toLowerCase();

        if (mapaPalabras.containsKey(inicial)) {
            return mapaPalabras.get(inicial).remove(palabra);
        }

        return false;
    }

    public boolean palabraExiste(String palabra) {
        Character inicial = Character.toLowerCase(palabra.charAt(0));
        palabra = palabra.trim().toLowerCase();

        if (mapaPalabras.containsKey(inicial)) {
            return mapaPalabras.get(inicial).contains(palabra);
        }

        return false;
    }

    public Set<Character> obtenerInicialesDisponibles() {
        return mapaPalabras.keySet();
    }

    public Set<String> obtenerPalabrasPorInicial(char inicial) {
        inicial = Character.toLowerCase(inicial);

        if (mapaPalabras.containsKey(inicial)) {
            return mapaPalabras.get(inicial);
        }

        return null;
    }
}
