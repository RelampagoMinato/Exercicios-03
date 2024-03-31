public class Estudante {
    private double notaLaboratorio;
    private double notaAvaliacaoSemestral;
    private double notaExameFinal;

    public Estudante(double notaLaboratorio, double notaAvaliacaoSemestral, double notaExameFinal) {
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
        this.notaExameFinal = notaExameFinal;
    }

    public double getNotaLaboratorio() {
        return notaLaboratorio;
    }

    public double getNotaAvaliacaoSemestral() {
        return notaAvaliacaoSemestral;
    }

    public double getNotaExameFinal() {
        return notaExameFinal;
    }
}
