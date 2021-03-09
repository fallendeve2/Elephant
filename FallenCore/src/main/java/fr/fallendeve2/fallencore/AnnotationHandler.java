package fr.fallendeve2.fallencore;

import fr.fallendeve2.fallencore.annotations.FallenPlugin;

public class AnnotationHandler {
    public void checkAnnotation(Object object) {
        Class clazz = (Class) object;
        if (clazz.isAnnotationPresent(FallenPlugin.class)) {
            
        }
    }
}
