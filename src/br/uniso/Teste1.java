package br.uniso;

import java.io.*;

public class Teste1 {

    public static void main(String args[]){

        // Ler o arquivo em Java
        File f = new File("alunos.txt");



        // Vou pegar o conteudo do arquivo e jogar em memoria
        // para tal eu preciso de um fluxo de entrada, que parta do disco -> memoria
        try {
            InputStream is = new FileInputStream(f);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            // a hora KARATE KID - a hora de verdade
            // amador
            /*String cabecalho = br.readLine();
            String primeiraLinha = br.readLine();
            String segundaLinha = br.readLine();
            String terceiraLinha = br.readLine();

            System.out.println(cabecalho);
            System.out.println(primeiraLinha);
            System.out.println(segundaLinha);
            System.out.println(terceiraLinha);*/

            // profiçionau
            String linha = br.readLine();
            // enquanto a linha nao for nula, ou seja, tiver conteudo
            while(linha != null){
                // imprimo ela
                System.out.println(linha);
                // passo pa 'prossima
                linha = br.readLine();
            }

            //estagiarice

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}

