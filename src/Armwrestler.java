public abstract class Armwrestler {
    protected TechniqueStyle techniqueStyle;
    public Armwrestler(TechniqueStyle techniqueStyle) {
        this.techniqueStyle = techniqueStyle;
    }

    public abstract void performTechnique();
}
