import java.util.Random;
import java.util.concurrent.ThreadLocalRandom; 
public class Candidatura{

    public static void main (String [] args){
        String [] candidatos = {"Rafaela", "Rezon", "Larissa", "Sofia", "Jeremias", "Elen"};
        for (String candidato: candidatos){
            entrandoEmContato (candidato, true);
        }
    }

    static void entrandoEmContato (String candidato, boolean b){
        
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do { 
            atendeu=atender();
            continuarTentando = !atendeu;
            if (continuarTentando);
            tentativasRealizadas++; 
            if (atendeu)
            System.out.println("Contato realizado com sucesso");
            
        } while (continuarTentando && tentativasRealizadas<3);

        if (atendeu);
        System.out.println("Conseguimos contato com" + candidato + "na tentaviva");
        if (!atendeu);
        System.out.println("Não conseguimos contato com" + candidato + "número máximo de tentativas" + tentativasRealizadas); 
    }

    //metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }


    static void imprimirSelecionados() {
        String [] candidatos = {"Rafaela", "Rezon", "Larissa", "Sofia", "Jeremias", "Elen"};
        System.out.println("imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice=0; indice < candidatos.length;indice++){
            System.out.println("O candidato de n°" + (indice+1) + "é o" + candidatos [indice]);
        }

        System.out.println("Forma abreviada de interação for each");
        for (String candidato: candidatos ){
            System.out.println("O candidato selecionado foi" + candidato);
        }
    
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Rezon", "Sofia", "Larissa", "Elen", "Rafaela", "Sara", "Bruno", "Ester", "Lorran", "Enoque", "Jeremias", "Emily"};
        
        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados > 5 && candidatosAtuais < candidatos.length){
            String candidato = candidatos [candidatosAtuais];
            double salarioPretendido = valorPretendido();
            
            System.out.println("O candidato" + candidato + "Solicitou este valor de salário" + salarioPretendido);    

            if (salarioBase >= salarioPretendido) {
            System.out.println("O candidato" + candidato + "foi selecionado para a vaga");
            candidatosSelecionados++;
            }
            candidatosAtuais++;
        }
    }

    static double valorPretendido (){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidatos(double salarioPretendido){
        double salarioBase = 2000;
        if (salarioBase > salarioPretendido){
        System.out.println("Ligar para o Candidato");
        
    }else if (salarioBase < salarioPretendido);
    System.out.println("Ligar para candidato com contra proposta");

    if (salarioBase == salarioPretendido) {
    System.out.println("Aguardando resultado dos demais candidatos");
      }
    }
}
