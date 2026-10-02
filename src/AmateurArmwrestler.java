public class AmateurArmwrestler extends Armwrestler {
    public AmateurArmwrestler(TechniqueStyle techniqueStyle) {
        super(techniqueStyle);
    }
    @Override
    public void performTechnique() {
        System.out.println("Amateur armwrestler:");
        techniqueStyle.useTechnique();
    }
}
