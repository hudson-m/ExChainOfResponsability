import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Deseja fazer um emprestimo? (s/n)");
		char r = sc.next().charAt(0);
		PedidoEmprestimoAbstrato pedidoCaixa = new Caixa(null);
		PedidoEmprestimoAbstrato pedidoGerenteLocal = new GerenteLocal(pedidoCaixa);
		PedidoEmprestimoAbstrato pedidoGerenteRegional = new GerenteRegional(pedidoGerenteLocal);
		PedidoEmprestimoAbstrato pedidoGerenteGeral = new GerenteGeral(pedidoGerenteRegional);
		PedidoEmprestimoAbstrato pedidoIndisponivel = new ValorIndisponivel(pedidoGerenteGeral);
		while(r == 's') {
			System.out.println("Valor do emprestimo desejado: ");
			int valor = sc.nextInt();
			ValorSolicitado valorSolicitado = new ValorSolicitado(valor);
			pedidoIndisponivel.tratarValor(valorSolicitado);		
			
			System.out.println("Deseja fazer um emprestimo? (s/n)");
			r = sc.next().charAt(0);
		}
		System.out.println("Fim!");
		sc.close();
	}

}
