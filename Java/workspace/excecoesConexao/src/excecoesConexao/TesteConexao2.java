package excecoesConexao;

public class TesteConexao2 {
	
	public static void main(String[] args) {
		
		Conexao con = null;
		
		try {
			con = new Conexao();
			con.leDados();
		} finally {
			con.close();
		}
		
		
	}

}
