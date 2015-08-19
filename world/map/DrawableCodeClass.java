package org.terasology.codecity.world.map;

import org.terasology.codecity.world.structure.CodeClass;
import org.terasology.codecity.world.structure.scale.CodeScale;

public class DrawableCodeClass implements DrawableCode {
    private CodeClass base;

    /**
     * This class represent a Class that can be drawed in the map
     * 
     * @param codeClass
     *            Base CodeClass
     */
    public DrawableCodeClass(CodeClass codeClass) {
        base = codeClass;
    }
    
    /**
     * Get the CodeClass which is the base of the drawable representation.
     * @return base of the DrawableCodeClass class.
     */
    public CodeClass getBase() {
        return base;
    }

    @Override
    public int getSize(CodeScale scale, CodeMapFactory factory) {
        return scale.getScaledSize(base.getVariableNumber(), 1);
    }

    @Override
    public int getHeight(CodeScale scale, CodeMapFactory factory) {
        return scale.getScaledSize(base.getClassLength(), 1);
    }

    @Override
    public CodeMap getSubmap(CodeScale scale, CodeMapFactory factory) {
        return new CodeMapNull();
    }

	@Override
	public int getWidth(CodeScale scale, CodeMapFactory factory) {
		return scale.getScaledSize(base.getVariableNumber(),1);
	}
}
