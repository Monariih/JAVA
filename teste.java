
package exer1;

import javax.swing.JOptionPane;


public class teste {
    
    public static void main(String[] args) {
       
        Curso javinha = new Curso();
        javinha.setNome("Javinha né pai");
        javinha.setTurma("Do Professor cleber");
        javinha.setMensalidade(650);
        
        JOptionPane.showMessageDialog
                            (null, "O curso é = "+ javinha.getNome()+
                            "\npertencente da turma: "+ javinha.getTurma()+
                            "\ne paga no total = "+ javinha.getMensalidade());

        Cliente pessoa = new Cliente();
        pessoa.setNome("Monariih");
        pessoa.setRg("37.660.276-4");
        pessoa.setEndereco("Manuel cerqueira leite, 162");
        pessoa.setDataNascimento("24/09/2000");
        pessoa.setTelefone("11 91577-2398");

        JOptionPane.showMessageDialog
                            (null, "O nome é: "+ pessoa.getNome()+
                            "\nO rg é: "+ pessoa.getRg()+
                            "\nData de nascimento: "+ pessoa.getDataNascimento()+
                            "\nEndereço: "+ pessoa.getEndereco()+
                            "\nTelefone: "+ pessoa.getTelefone());

    }
}
