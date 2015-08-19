package org.terasology.codecity.world.map;

import org.terasology.codecity.world.structure.scale.CodeScale;

/**
 * This class represent a object in the map
 */
public class MapObject {
    private DrawableCode object;
    private int x;
    private int z;
    private boolean isOrigin;

    /**
     * Create a new Object in map
     * 
     * @param object
     *            Object to be represented
     * @param x
     *            The position of the object in the x coordinate
     * @param z
     *            The position of the object in the z coordinate
     */
    public MapObject(DrawableCode object, int x, int z, boolean isOrigin) {
        this.object = object;
        this.x = x;
        this.z = z;
        this.isOrigin = isOrigin;
    }

    /**
     * @return The position of the object in the x coordinate
     */
    public int getPositionX() {
        return x;
    }

    /**
     * @return The position of the object in the z coordinate
     */
    public int getPositionZ() {
        return z;
    }

    /**
     * Get the height of the object
     * 
     * @param scale
     * @param factory
     * @return
     */
    public int getHeight(CodeScale scale, CodeMapFactory factory) {
        return object.getHeight(scale, factory);
    }
    
    /**
     * Get the width of the object
     * 
     * @param scale
     * @param factory
     * @return
     */
    public int getWidth(CodeScale scale, CodeMapFactory factory){
    	return object.getWidth(scale, factory);
    }

    /**
     * @return The object that is represented
     */
    public DrawableCode getObject() {
        return object;
    }
    
    public boolean isOrigin() {
        return isOrigin;
    }
}
