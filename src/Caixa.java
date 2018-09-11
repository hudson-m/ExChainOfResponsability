
public class Caixa extends PedidoEmprestimoAbstrato{
	public Caixa(PedidoEmprestimoAbstrato proximo) {
		super(proximo);
	}
	@Override
	public void tratarValor(ValorSolicitado valorSolicitado) {
		if(valorSolicitado.getValor() <= 500) {
			System.out.println("Empréstimo de R$"+ valorSolicitado.getValor() +" reais aprovado pelo caixa do banco!");
		}
		else {
			proximo.tratarValor(valorSolicitado);
		}
	}

}
