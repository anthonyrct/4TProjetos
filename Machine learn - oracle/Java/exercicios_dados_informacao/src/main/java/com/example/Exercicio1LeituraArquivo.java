// package com.example;

// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.nio.Buffer;

// public class Exercicio1LeituraArquivo {
//     //arquivos de entrada e saida
//     String inputFile = "alunos_notas.txt";

//     //lista para armazenar os alunos 


//     //metodo
//     public void app(){
//         try {
//             while(BufferedReader br = new BufferedReader(new FileReader(inputFile))){
//                 String linha;
//                 while((linha = br.readLine()) != null){
//                     String[] partes = linha.split(",");
//                     String nom = partes[0];
//                     double somaNotas = 0;
//                     int numeroNotas = 0;
//                     try{for(int i = 1; i < partes.length; i++){
//                         somaNotas += Double.parseDouble(partes[i]);
//                         numeroNotas++;
//                     }
//                 }catch(NumberFormatException e){
//                     somaNotas += 0;
//                 }
//             }
//         } catch (Exception e){

//         }
//     }

// }
// }
