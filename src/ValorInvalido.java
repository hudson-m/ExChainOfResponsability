
public class ValorInvalido extends PedidoEmprestimoAbstrato{
	public ValorInvalido() {
		super(null);
	}
	@Override
	public void tratarValor(ValorSolicitado valorSolicitado) {
		System.out.println("O valor solicitado de " + valorSolicitado.getValor() + " é invalido!");
	}
}
