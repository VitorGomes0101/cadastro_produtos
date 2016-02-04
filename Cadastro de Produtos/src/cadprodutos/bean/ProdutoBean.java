package cadprodutos.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import cadprodutos.dao.produtoDAO;
import cadprodutos.modelo.Produto;

@RequestScoped
@ManagedBean
public class ProdutoBean {
	
	@PostConstruct
	public void init(){
		System.out.println(" Bean executado! ");
	}
	
	public String getMessage(){
		return "Hello World JSF!";
	}
	
	//Variaveis
	private Produto produto = new Produto();
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	
	public void salvar(Produto produto){
		produtos.add(produto);
		
		new produtoDAO().salvar(produto);
		
	}
	


}
