public class Sala {
    
    
    private String descricao;
    private String localizacao;
    private int quantidade_cadeiras;
    private String tipo_tela;

    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;

    }

    public String getLocalizacao(){
        return this.localizacao;
    }
    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

    public int getQuantidade_cadeiras(){
        return this.quantidade_cadeiras;
    }
    public void setQuantidade_cadeiras(int quantidade_cadeiras){
        this.quantidade_cadeiras = quantidade_cadeiras;
    }

    public String getTipo_tela(){
        return this.tipo_tela;
    }
    public void setTipo_tela(String tipo_tela){
        this.tipo_tela = tipo_tela;     

    }

}

