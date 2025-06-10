package segundaunidade.Heranca.Delegacao;

public class RegistroAcademico {
    private String mat;
   private  String nome;
    private String curso;

    public RegistroAcademico(String curso, String mat, String nome) {
        this.curso = curso;
        this.mat = mat;
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RegistroAcademico: ");
        sb.append("mat=").append(mat);
        sb.append(", nome=").append(nome);
        sb.append(", curso=").append(curso);
        // sb.append('}');
        return sb.toString();
    }

}
