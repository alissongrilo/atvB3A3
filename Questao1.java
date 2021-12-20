public class Questao1 {
	private String nome;
	private String pai;
	private String mae;
	
	public Questao1(String nome, String pai, String mae) { 
	      this.nome = nome;
	      this.pai = pai;
	      this.mae = mae;
	   }
	public Questao1(String nome) { 
		 this.nome = nome; 
	   }
	
	public void SetNome(String nome) {
		this.nome = nome;
	}

	public void SetPai(String nome) {
		this.pai = nome;
	}

	public void SetMae(String nome) {
		this.mae = nome;
	}
	
	public String GetNome() {
		return (this.nome);
	}

	public String GetPai() {
		return (this.pai);
	}
	
	public String GetMae() {
		return (this.mae);
	}
	
	public void Verify(Questao1 alguem) {
		if(this.pai == alguem.pai || this.mae == alguem.mae){
			System.out.println("São Irmãos!");
		} else {
			System.out.println("Não são irmãos!");
		}
	}
	
	public void VerifyAncestor(Questao1 alguem) {
		if(alguem.nome == this.pai || alguem.nome == this.mae) {
			System.out.println("Grau de parentesco confirmado!");
		} else {
			System.out.println("Grau de parentesco negado!");
		}
	}
}