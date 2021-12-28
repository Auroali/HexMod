package at.petrak.hex.common.casting.operators

import at.petrak.hex.common.casting.CastingContext
import at.petrak.hex.common.casting.SpellDatum
import at.petrak.hex.common.casting.SpellOperator.Companion.getChecked
import at.petrak.hex.common.casting.SpellOperator.Companion.spellListOf
import net.minecraft.world.entity.Entity

object OpEntityLook : SimpleOperator {
    override val argc = 1

    override fun execute(args: List<SpellDatum<*>>, ctx: CastingContext): List<SpellDatum<*>> {
        val e: Entity = args.getChecked(0)
        return spellListOf(e.lookAngle)
    }
}