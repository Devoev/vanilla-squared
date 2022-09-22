package net.devoev.vanilla_cubed.item.tool

import net.devoev.vanilla_cubed.item.behavior.Behaviors
import net.devoev.vanilla_cubed.item.behavior.InventoryTickParams
import net.devoev.vanilla_cubed.item.behavior.PostHitParams
import net.devoev.vanilla_cubed.item.behavior.PostMineParams
import net.devoev.vanilla_cubed.item.tool.data.ToolData
import net.minecraft.block.BlockState
import net.minecraft.entity.Entity
import net.minecraft.entity.LivingEntity
import net.minecraft.item.*
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World


open class ModSwordItem(data: ToolData<Int, Float>, behaviors: Behaviors<ToolItem>)
    : SwordItem(data.material, data.attackDamage, data.attackSpeed, data.settings),
    Behaviors<ToolItem> by behaviors {

    override fun inventoryTick(stack: ItemStack?, world: World?, entity: Entity?, slot: Int, selected: Boolean) {
        inventoryTickBehavior(this, InventoryTickParams(stack, world, entity, slot, selected))
        super.inventoryTick(stack, world, entity, slot, selected)
    }

    override fun postHit(stack: ItemStack?, target: LivingEntity?, attacker: LivingEntity?): Boolean {
        postHitBehavior(this, PostHitParams(stack, target, attacker))
        return super.postHit(stack, target, attacker)
    }

    override fun postMine(stack: ItemStack?, world: World?, state: BlockState?, pos: BlockPos?, miner: LivingEntity?): Boolean {
        postMineBehavior(this, PostMineParams(stack, world, state, pos, miner))
        return super.postMine(stack, world, state, pos, miner)
    }
}

open class ModShovelItem(data: ToolData<Float, Float>, behaviors: Behaviors<ToolItem>)
    : ShovelItem(data.material, data.attackDamage, data.attackSpeed, data.settings),
    Behaviors<ToolItem> by behaviors {

    override fun inventoryTick(stack: ItemStack?, world: World?, entity: Entity?, slot: Int, selected: Boolean) {
        inventoryTickBehavior(this, InventoryTickParams(stack, world, entity, slot, selected))
        super.inventoryTick(stack, world, entity, slot, selected)
    }

    override fun postHit(stack: ItemStack?, target: LivingEntity?, attacker: LivingEntity?): Boolean {
        postHitBehavior(this, PostHitParams(stack, target, attacker))
        return super.postHit(stack, target, attacker)
    }

    override fun postMine(stack: ItemStack?, world: World?, state: BlockState?, pos: BlockPos?, miner: LivingEntity?): Boolean {
        postMineBehavior(this, PostMineParams(stack, world, state, pos, miner))
        return super.postMine(stack, world, state, pos, miner)
    }
}

open class ModPickaxeItem(data: ToolData<Int, Float>, behaviors: Behaviors<ToolItem>)
    : PickaxeItem(data.material, data.attackDamage, data.attackSpeed, data.settings),
    Behaviors<ToolItem> by behaviors {

    override fun inventoryTick(stack: ItemStack?, world: World?, entity: Entity?, slot: Int, selected: Boolean) {
        inventoryTickBehavior(this, InventoryTickParams(stack, world, entity, slot, selected))
        super.inventoryTick(stack, world, entity, slot, selected)
    }

    override fun postHit(stack: ItemStack?, target: LivingEntity?, attacker: LivingEntity?): Boolean {
        postHitBehavior(this, PostHitParams(stack, target, attacker))
        return super.postHit(stack, target, attacker)
    }

    override fun postMine(stack: ItemStack?, world: World?, state: BlockState?, pos: BlockPos?, miner: LivingEntity?): Boolean {
        postMineBehavior(this, PostMineParams(stack, world, state, pos, miner))
        return super.postMine(stack, world, state, pos, miner)
    }
}

open class ModAxeItem(data: ToolData<Float, Float>, behaviors: Behaviors<ToolItem>)
    : AxeItem(data.material, data.attackDamage, data.attackSpeed, data.settings),
    Behaviors<ToolItem> by behaviors {

    override fun inventoryTick(stack: ItemStack?, world: World?, entity: Entity?, slot: Int, selected: Boolean) {
        inventoryTickBehavior(this, InventoryTickParams(stack, world, entity, slot, selected))
        super.inventoryTick(stack, world, entity, slot, selected)
    }

    override fun postHit(stack: ItemStack?, target: LivingEntity?, attacker: LivingEntity?): Boolean {
        postHitBehavior(this, PostHitParams(stack, target, attacker))
        return super.postHit(stack, target, attacker)
    }

    override fun postMine(stack: ItemStack?, world: World?, state: BlockState?, pos: BlockPos?, miner: LivingEntity?): Boolean {
        postMineBehavior(this, PostMineParams(stack, world, state, pos, miner))
        return super.postMine(stack, world, state, pos, miner)
    }
}

open class ModHoeItem(data: ToolData<Int, Float>, behaviors: Behaviors<ToolItem>)
    : HoeItem(data.material, data.attackDamage, data.attackSpeed, data.settings),
    Behaviors<ToolItem> by behaviors {

    override fun inventoryTick(stack: ItemStack?, world: World?, entity: Entity?, slot: Int, selected: Boolean) {
        inventoryTickBehavior(this, InventoryTickParams(stack, world, entity, slot, selected))
        super.inventoryTick(stack, world, entity, slot, selected)
    }

    override fun postHit(stack: ItemStack?, target: LivingEntity?, attacker: LivingEntity?): Boolean {
        postHitBehavior(this, PostHitParams(stack, target, attacker))
        return super.postHit(stack, target, attacker)
    }

    override fun postMine(stack: ItemStack?, world: World?, state: BlockState?, pos: BlockPos?, miner: LivingEntity?): Boolean {
        postMineBehavior(this, PostMineParams(stack, world, state, pos, miner))
        return super.postMine(stack, world, state, pos, miner)
    }
}