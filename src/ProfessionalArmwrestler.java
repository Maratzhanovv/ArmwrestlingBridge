public class ProfessionalArmwrestler extends Armwrestler {
    public ProfessionalArmwrestler(TechniqueStyle techniqueStyle) {
        super(techniqueStyle);
    }
    @Override
    public void performTechnique() {
        System.out.println("Professional armwrestler:");
        techniqueStyle.useTechnique();
    }
}
