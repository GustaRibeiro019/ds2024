import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Aluno {
    private String nome;
    private String curso;
    private String disciplina;
    private int bimestre;
    private String mencao;
    
    //costrutor de classe, esse codigo obriga a sempre pedir nome e curso
    public Aluno(String nome, String curso){
        this.nome = nome;
        this.curso = curso;
    }
    

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }


    public void setCurso(String curso){
      this.curso = curso;
    }
    public String getCurso(){
      return this.curso;
    }


    
    public void setDiciplina(String disciplina){
        this.disciplina = disciplina;
    }
    public String getDiciplina(){
        return this.disciplina;
    }
      
    
        
    public void setBimestre (int bimestre){
        this.bimestre = bimestre;
    }
    public int getBimestre(){
        return this.bimestre;
    }



    public void setMencao (String Mencao){
        this.mencao = mencao;
    }
    public String getMencao(){
        return this.mencao;
    }

    
}
