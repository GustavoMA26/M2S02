package list_m02s02.Ex2;

public class PessoaFisica {
    private String cpf;
    private String nome;
    private String sobrenome;
    private String dataDeNascimento;
    public PessoaFisica (String cpf){
        //this.cpf = cpf;
        setCpf(cpf);
    }

    private boolean validaCpf(String cpf) {
        return cpf.length() == 11;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf) {
        if (validaCpf(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("O CPF é inválido!");
        }
    }


}