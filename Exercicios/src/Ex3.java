import classes.ex3.Dicionario;

import java.util.HashMap;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        HashMap<String,String> teste = new HashMap<>();

        teste.put(dicionario.setNome("Bola -> "),dicionario.setCor("Azul"));
        teste.put(dicionario.setNome("Boneca -> "),dicionario.setCor("Amarela"));
        teste.put(dicionario.setNome("Dado -> "),dicionario.setCor("Rosa"));

        teste.forEach((key,value)-> System.out.println(key + value));


    }
    }
