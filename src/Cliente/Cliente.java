package Cliente;

public class Cliente {
    private String nome;
    private int idade;
    private double renda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    public String classificarIdade()
    {
        String retorno;
        
        if (this.idade >= 18)
        {
            retorno = "Cliente maior de idade!";
        }
        else
        {
            retorno = "Cliente menor de idade!";
        }
        
        return retorno;
    }
    
    public String classificarRenda()
    {
        String retorno;
        
        if (this.renda > 15000)
        {
            retorno = "È rico!";
        }
        else
        {
            retorno = "Não é rico!";
        }
        
        return retorno;
    }
    
}
