public class Musica {

    //DECLARAÇÃO DE ATRIBUTOS
    
    private String nomeMusica;
    private String nomeInterprete;
    private String  nomeCompositor;
    private String anoComposicaoMusica;

     
    public Musica(){
        // INICIANDO MÉTODO CONSTRUTOR
        nomeMusica = "";
        nomeInterprete = "";
        nomeCompositor = "";
        anoComposicaoMusica = "";
    }

    // MÉTODO CONSTRUTOR COM PARÂMETROS
    public Musica(String smusica, String sinterprete, String scompositor, String anocomposicao){
        nomeMusica = smusica;
        nomeInterprete = sinterprete;
        nomeCompositor = scompositor;
        anoComposicaoMusica = anocomposicao;


    }

    // COMPORTAMENTOS/MÉTODOS

    public void setMusica(String snomemusica){
        nomeMusica = snomemusica;

    }

    public void setInterprete(String sninterprete){
        nomeInterprete = sninterprete;

    }

    public void setCompositor(String snomecompositor){
        nomeCompositor = snomecompositor;

    }

    public void setAnoComposicao(String anoComp){
        anoComposicaoMusica = anoComp;
    }

    public String getMusica(){
        return nomeMusica; 
    }

    public String getInterprete(){
        return nomeInterprete; 
    }

    public String getCompositor(){
        return nomeCompositor; 
    }

    //SOBRECARGA DO MÉTODO: O PRIMEIRO POSSUI APENAS 1 PARAMETRO. O SEGUNDO POSSUI 4, TORNANDO MAIS FACIL A UTILIZACAO. NO PROGRAMA PRINCIPAL EU APLICO OS DOIS PARA DEMONSTRAR QUE AMBOS FUNCIONAM.

    public void setMusica(String smusica, String sinterprete, String sncompositor, String anocomposicao){
        nomeMusica = smusica;
        nomeInterprete = sinterprete;
        nomeCompositor = sncompositor;
        anoComposicaoMusica = anocomposicao;        

    }


    public String getAnoComposicao(){
        return anoComposicaoMusica; 
    }
    
}
