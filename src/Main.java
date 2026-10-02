public class Main {
    public static void main(String[] args) {
        Armwrestler amateur = new AmateurArmwrestler(new TopRollTechnique());
        amateur.performTechnique();

        System.out.println();

        Armwrestler professional = new ProfessionalArmwrestler(new HookTechnique());
        professional.performTechnique();

        System.out.println();

        professional = new ProfessionalArmwrestler(new PressTechnique());
        professional.performTechnique();
    }
}
