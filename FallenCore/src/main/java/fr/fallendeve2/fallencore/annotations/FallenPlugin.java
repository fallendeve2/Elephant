package fr.fallendeve2.fallencore.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FallenPlugin {
    String name() default "";
    String version() default "";
    String author()default "";
    String core() default "FallenCore";
}
