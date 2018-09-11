
public class ValorIndisponivel extends PedidoEmprestimoAbstrato {
	public ValorIndisponivel(PedidoEmprestimoAbstrato proximo) {
		super(proximo);
	}
	@Override
	public void tratarValor(ValorSolicitado valorSolicitado) {
		if(valorSolicitado.getValor() > 100000) {
			System.out.println("Empréstimo de R$"+ valorSolicitado.getValor() +" reais vai além do permitido pelo banco!");
		}else {
			proximo.tratarValor(valorSolicitado);
		}
	}
}
