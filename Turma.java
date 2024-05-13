class Turma {
    private String curso;
    private String disciplina;

    // Construtor
    public Turma(String curso, String disciplina) {
        this.curso = curso;
        this.disciplina = disciplina;
    }
    public String getCurso() {
        return curso;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void exibirTurma() {
        System.out.println("Curso: " + curso);
        System.out.println("Disciplina: " + disciplina);
    }
}
