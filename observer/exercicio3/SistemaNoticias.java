package observer.exercicio3;

public class SistemaNoticias {
 public static void main(String[] args) {
     AgenciaNoticias agencia = new AgenciaNoticias();
     ObservadorNoticias observador = new ObservadorNoticiasImpl();

     agencia.adicionarObservador(observador);

     agencia.publicarNoticia("Lanšamento de um novo produto!");

     agencia.removerObservador(observador);

     agencia.publicarNoticia("Resultado de uma pesquisa recente!");
 }
}

