import java.util.*;

public class Contador {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroDois < parametroUm){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = parametroDois - parametroUm;

            for(int i = 0; i < contagem; i++){
                System.out.println("Interação número:" + (i + 1));
            }
        }
    }

}
