public class TesteTurma {
    public static void main(String[] args) {
        Turma turma1 = new Turma("MAC", "POO");
        Turma turma2 = new Turma("CC", "Algoritmos");

        System.out.println("Turma 1:");
        turma1.exibirTurma();
        System.out.println("\nTurma 2:");
        turma2.exibirTurma();

        turma1.setCurso("Engenharia de Software");
        turma1.setDisciplina("Engenharia de Requisitos\n");

        System.out.println("\nTurma 1 (modificada): ");
        turma1.exibirTurma();
    }
}