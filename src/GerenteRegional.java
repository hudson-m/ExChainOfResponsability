
public class GerenteRegional extends PedidoEmprestimoAbstrato{
	public GerenteRegional(PedidoEmprestimoAbstrato proximo) {
		super(proximo);
	}
	@Override
	public void tratarValor(ValorSolicitado valorSolicitado) {
		if(valorSolicitado.getValor() >= 10001 && valorSolicitado.getValor() <= 50000) {
			System.out.println("Empréstimo de R$"+ valorSolicitado.getValor() +" reais aprovado pelo gerente regional do banco!");
		}else {
			proximo.tratarValor(valorSolicitado);
		}
	}
}
