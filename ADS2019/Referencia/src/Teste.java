import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		Cliente	c = new Cliente();
		c.setNome(JOptionPane.showInputDialog("Nome"));
		c.setEmail(JOptionPane.showInputDialog("Email"));
		
		Endereco e = new Endereco();
		
		e.setCep(Integer.parseInt(JOptionPane.showInputDialog("Digite o CEP")));
		e.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro"));
		e.setNumero(JOptionPane.showInputDialog("Digite o número"));
		e.setComplemento(JOptionPane.showInputDialog("Digite o complemento"));
		e.setBairro(JOptionPane.showInputDialog("Digite o bairro"));
		e.setCidade(JOptionPane.showInputDialog("Digite a cidade"));
		e.setUf(JOptionPane.showInputDialog("Digite a UF"));
		
		c.setEndereco(e);
		
		Telefone t = new Telefone();
		
		t.setNumero(JOptionPane.showInputDialog("Digite o número"));
		t.setRamal(Integer.parseInt(JOptionPane.showInputDialog("Digite o ramal")));
		t.setOperadora(JOptionPane.showInputDialog("Digite a operadora"));
		t.setDdd(Integer.parseInt(JOptionPane.showInputDialog("Digite o DDD")));
		
		c.setFone(t);
		
		JOptionPane.showMessageDialog(null, c.getNome());
		JOptionPane.showMessageDialog(null, c.getEndereco().getLogradouro());
	}

}
