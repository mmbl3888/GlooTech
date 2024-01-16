package GlooTech.api.damagesources;

import net.minecraft.util.DamageSource;

public class GlooTechDamageSources {

    private static final DamageSource SUFFOCATION = new DamageSource("suffocation").setDamageBypassesArmor();
    private static final DamageSource TOXIC_ATMOSPHERE = new DamageSource("toxic_atmosphere").setDamageBypassesArmor();
    private static final DamageSource HIGH_PRESSURE = new DamageSource("high_pressure").setDamageBypassesArmor();
    private static final DamageSource LOW_PRESSURE = new DamageSource("low_pressure").setDamageBypassesArmor();


    public static DamageSource getSuffocationDamage() {
        return SUFFOCATION;
    }

    public static DamageSource getToxicAtmosphereDamage() {
        return TOXIC_ATMOSPHERE;
    }

    public static DamageSource getHighPressureDamage() {
        return HIGH_PRESSURE;
    }

    public static DamageSource getLowPressureDamage() {
        return LOW_PRESSURE;
    }


}