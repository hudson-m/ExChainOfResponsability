
public class GerenteGeral extends PedidoEmprestimoAbstrato{
	public GerenteGeral(PedidoEmprestimoAbstrato proximo) {
		super(proximo);
	}
	@Override
	public void tratarValor(ValorSolicitado valorSolicitado) {
		if(valorSolicitado.getValor() >= 50001 && valorSolicitado.getValor() <= 100000) {
			System.out.println("Empréstimo de R$"+ valorSolicitado.getValor() +" reais aprovado pelo gerente geral do banco!");
		}else {
			proximo.tratarValor(valorSolicitado);
		}
	}
}
