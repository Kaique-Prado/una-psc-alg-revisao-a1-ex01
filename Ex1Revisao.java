import java.util.Scanner;

public class Ex1Revisao {
    public static void main(String[] args) {
        
        System.out.println("Sistema de indentificação de H5N1");

        //Entradas
        Scanner scanner = new Scanner(System.in);

        
        //Lendo nome e idade
        System.out.print("Por favor, escreva seu nome para o iníciar: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, coloque sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("");

        
        
        //Declarando um Array de resposta e porcentagem
        String[] resposta = new String[4];

        float[] porcentagem = new float[4];

        int tentativa =0;
       
        
        
        
        //Perguntas para o paciente
        System.out.println("Agora responda com Sim ou Não");
        
        while( tentativa <= 3) { 
          System.out.print("Seu cartão de vacina está em dia? "); 
          resposta[0] = scanner.next();
          System.out.println("");
           
          if (resposta[0].equals("Sim") || resposta[0].equals("sim") || resposta[0].equals("Nao") || resposta[0].equals("Não") || resposta[0].equals("não") || resposta[0].equals("nao")) {
               break;
          } else if (tentativa == 2) {
               System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
               System.exit(0);
          } else {
               System.out.println("Resposta enválida, tente de novo");
               tentativa++;
          }

        }
        
        tentativa = 0;

        while( tentativa <= 3) { 
          System.out.print("Teve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe) "); 
          resposta[1] = scanner.next();
          System.out.println("");
           
          if (resposta[1].equals("Sim") || resposta[1].equals("sim") || resposta[1].equals("Nao") || resposta[1].equals("Não") || resposta[1].equals("não") || resposta[1].equals("nao")) {
               break;
          } else if (tentativa == 2) {
               System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
               System.exit(0);
          } else {
               System.out.println("Resposta enválida, tente de novo");
               tentativa++;
          }
        }

        tentativa = 0;

        while( tentativa <= 3) { 
          System.out.print("Teve contato com pessoas com sintomas gripais nos últimos dias? "); 
          resposta[2] = scanner.next();
          System.out.println("");
           
          if (resposta[2].equals("Sim") || resposta[2].equals("sim") || resposta[2].equals("Nao") || resposta[2].equals("Não") || resposta[2].equals("não") || resposta[2].equals("nao")) {
               break;
          } else if (tentativa == 2) {
               System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
               System.exit(0);
          } else {
               System.out.println("Resposta enválida, tente de novo");
               tentativa++;
          }
         }
         
         tentativa =0;

        while( tentativa <= 3) { 
          System.out.print("Está retornando de viagem realizada no exterior? "); 
          resposta[3] = scanner.next();
          System.out.println("");
           
          if (resposta[3].equals("Sim") || resposta[3].equals("sim") || resposta[3].equals("Nao") || resposta[3].equals("Não") || resposta[3].equals("não") || resposta[3].equals("nao")) {
               break;
          } else if (tentativa == 2) {
               System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
               System.exit(0);
          } else {
               System.out.println("Resposta enválida, tente de novo");
               tentativa++;
          }

        }

        

        //Validando respostas e dando porcentagem

       if (resposta[0].equals("Não") || resposta[0].equals("Nao") || resposta[0].equals("nao") || resposta[0].equals("não")) {
            porcentagem[0] = 0.1f;
       } if (resposta[1].equals("Sim") || resposta[1].equals("sim")) {
            porcentagem[1] = 0.3f;
       } if (resposta[2].equals("Sim") || resposta[2].equals("sim")) {
            porcentagem[2] = 0.3f;
       } if (resposta[3].equals("Sim") || resposta[3].equals("sim")) {
            porcentagem[3] = 0.3f;
       }

       float  calculoInfeccao = (porcentagem[0] + porcentagem[1] + porcentagem[2] + porcentagem[3]) *100;

       
       //Orientações

       System.out.print("Probabilidade de infecção");
       System.out.printf("%.2f", calculoInfeccao ,"\n");

        if (resposta[3].equals("sim") || resposta[3].equals("Sim")) {
          System.out.println("Você está retornando de viagem, ficará sob observação durante 5 dias");
     }

       if (calculoInfeccao <= 30) {
            System.out.println("Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.");
       } else if (calculoInfeccao <=60) {
           System.out.println("Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");
       } else if (calculoInfeccao >= 90) {
            System.out.println("Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado");
       }

  }
  
}