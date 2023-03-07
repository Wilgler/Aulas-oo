public class Principal {

    public static void main(String[] args) {
        
        Filme filme1 = new Filme();
        filme1.setTitulacao("Era do Gelo");
        filme1.setDuracao(120);
        filme1.setAno(2008); 
        filme1.setSinopse("sem comentarios");

               
        System.out.println(filme1.getTitulacao());
        System.out.println(filme1.getDuracao());
        System.out.println(filme1.getAno());
        System.out.println(filme1.getSinopse());
        
        Genero genero1 = new Genero();
        genero1.setDescricao("Aventura");

        System.out.println(genero1.getDescricao());

        Sala sala1 = new Sala();
        sala1.setDescricao("Sala 1");
        sala1.setLocalizacao("Bloco A");
        sala1.setQuantidade_cadeiras(40);
        sala1.setTipo_tela("2D");

        System.out.println(sala1.getDescricao());
        System.out.println(sala1.getLocalizacao());
        System.out.println(sala1.getQuantidade_cadeiras());
        System.out.println(sala1.getTipo_tela());




    }
    
}
