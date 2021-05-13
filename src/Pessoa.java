public class Pessoa {
    private String CPF;
    private String nome;
    private String endereco;
    private String telefone[];
    private String email;
    private char sexo;
    private String estadoCivil;
    private String profissao;
    private String nomeFiador;
    private String cpfFiador;


    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String[] getTelefone() {
        return telefone;
    }

    public void setTelefone(String[] telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNomeFiador() {
        return nomeFiador;
    }

    public void setNomeFiador(String nomeFiador) {
        this.nomeFiador = nomeFiador;
    }

    public String getCpfFiador() {
        return cpfFiador;
    }

    public void setCpfFiador(String cpfFiador) {
        this.cpfFiador = cpfFiador;
    }
}
