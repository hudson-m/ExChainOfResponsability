
public abstract class PedidoEmprestimoAbstrato {
	protected PedidoEmprestimoAbstrato proximo;
	public PedidoEmprestimoAbstrato(PedidoEmprestimoAbstrato proximo) {
		this.proximo = proximo;
	}
	public PedidoEmprestimoAbstrato getProximo() {
		return proximo;
	}
	public void setProximo(PedidoEmprestimoAbstrato proximo) {
		this.proximo = proximo;
	}
	public abstract void tratarValor(ValorSolicitado valorSolitado);

}
