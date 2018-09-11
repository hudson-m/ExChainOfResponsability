
public class GerenteLocal extends PedidoEmprestimoAbstrato{
	public GerenteLocal(PedidoEmprestimoAbstrato proximo) {
		super(proximo);
	}
	@Override
	public void tratarValor(ValorSolicitado valorSolicitado) {
		if(valorSolicitado.getValor() >= 501 && valorSolicitado.getValor() <= 10000) {
			System.out.println("Empréstimo de R$"+ valorSolicitado.getValor() +" reais aprovado pelo gerente local do banco!");
		}else {
			proximo.tratarValor(valorSolicitado);
		}
	}
}
