import java.util.Scanner;
import java.util.Random;
public class JogoDinamic {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random gerador = new Random();
        
        int option, numPc, numUsuario, pontoComputador=0, tentativas=0;
        String nome;
        
        System.out.print("Olá, Digite seu nome: ");
        nome = in.next();
        
        System.out.println(nome + ", vamos jogar? \n1 -> SIM\n2 -> NÃO");
        option = in.nextInt();
        
        if(option == 2){
            System.out.println("Que pena! até a próxima então...");
        }else if(option == 1){
            System.out.println("Oba!!! Vamos lá, o jogo vai funcionar da seguinte forma: ");
            System.out.println("É bem simples. " + nome + 
                    ", vou escolher um número de 0 a 10 e você terá "
                            + "\nque adivinhar qual foi o número escolhido por mim."
                            + "\nSe você errar é ponto meu, caso contrario você será o vencedor!!!\nBoa sorte!!!\n");
            
            System.out.println("DEFINA A DIFICULDADE: \n1 -> Fácil\n2 -> Médio\n3 ->Dificil");
            int nivel = in.nextInt();
            
            if(nivel == 1){
                tentativas = 10;
            }else if(nivel == 2){
                tentativas = 5;
            }else if(nivel == 3){
                tentativas = 3;
            }
            
            numPc = gerador.nextInt(11);
            
            System.out.println(nome + ", Eu ja escolhi meu número. \nAgora é sua vez, tente adivinhar: ");
            
            do{
                numUsuario = in.nextInt();
                if(numUsuario != numPc){
                    pontoComputador++;
                    tentativas--;
                    if(tentativas > 0){
                        System.out.println("Resposta errada! Ponto para mim :D");
                        System.out.println("Computador " + pontoComputador + " X 0 " + nome);
                        System.out.print("\nTente outra vez: ");
                    }else{
                        System.out.println("GAME OVER!!!");
                    }
                }else{
                    System.out.println("Ahhh, você me venceu ;(\nO número escolhido por mim foi: " + numPc);
                    System.out.println("Parabéns, " + nome + "!" );
                    break;
                }
            }while(tentativas > 0);
        }
    }
}
