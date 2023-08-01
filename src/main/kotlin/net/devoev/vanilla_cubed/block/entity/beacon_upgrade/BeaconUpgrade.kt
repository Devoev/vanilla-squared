package net.devoev.vanilla_cubed.block.entity.beacon_upgrade

import net.devoev.vanilla_cubed.block.entity.ModBeaconBlockEntity
import net.minecraft.block.BlockState
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World


/**
 * A beacon upgrade stage. Modifies the [ModBeaconBlockEntity.tick] function by injecting the [invoke] method.
 */
fun interface BeaconUpgrade {

    operator fun invoke(world: World, pos: BlockPos, state: BlockState, blockEntity: ModBeaconBlockEntity)

    /**
     * Creates a composed [BeaconUpgrade] that first runs this and then [after].
     */
    infix fun andThen(after: BeaconUpgrade): BeaconUpgrade = BeaconUpgrade { world, pos, state, blockEntity ->
        this(world, pos, state, blockEntity)
        after(world, pos, state, blockEntity)
    }

    companion object {

        /**
         * The default [BeaconUpgrade] that does nothing.
         */
        val EMPTY = BeaconUpgrade { _, _, _, _ ->  }
    }
}