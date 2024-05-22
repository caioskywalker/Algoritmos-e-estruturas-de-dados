package listaEncadeada;

public class No<Integer> {
	
	private Integer algarismo;
	private No<Integer> proximo;
	
	
	public No(Integer algarismo, No<Integer> proximo) {
		super();
		this.algarismo = algarismo;
		this.proximo = proximo;
	}
	
	public No(Integer algarismo) {
		this.algarismo = algarismo;
		this.proximo = null;
	}
	
	public No() {
		// TODO Auto-generated constructor stub
	}
	public Integer getAlgarismo() {
		return algarismo;
	}
	public void setAlgarismo(Integer algarismo) {
		this.algarismo = algarismo;
	}
	public No<Integer> getProximo() {
		return proximo;
	}
	public void setProximo(No<Integer> proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "No [algarismo=" + algarismo + ", proximo=" + proximo + "]";
	}


	
	
}
