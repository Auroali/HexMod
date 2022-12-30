package at.petrak.hexcasting.api.mod;

import at.petrak.hexcasting.api.spell.ActionRegistryEntry;
import at.petrak.hexcasting.xplat.IXplatAbstractions;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static at.petrak.hexcasting.api.HexAPI.modLoc;

public class HexTags {
    public static final class Items {
        public static final TagKey<Item> EDIFIED_LOGS = create("edified_logs");
        public static final TagKey<Item> EDIFIED_PLANKS = create("edified_planks");
        public static final TagKey<Item> STAVES = create("staves");
        public static final TagKey<Item> PHIAL_BASE = create("phial_base");
        public static final TagKey<Item> GRANTS_ROOT_ADVANCEMENT = create("grants_root_advancement");

        public static TagKey<Item> create(String name) {
            return create(modLoc(name));
        }

        public static TagKey<Item> create(ResourceLocation id) {
            return TagKey.create(Registry.ITEM_REGISTRY, id);
        }
    }

    public static final class Blocks {
        public static final TagKey<Block> EDIFIED_LOGS = create("edified_logs");
        public static final TagKey<Block> EDIFIED_PLANKS = create("edified_planks");

        public static TagKey<Block> create(String name) {
            return TagKey.create(Registry.BLOCK_REGISTRY, modLoc(name));
        }
    }

    public static final class Entities {
        public static final TagKey<EntityType<?>> STICKY_TELEPORTERS = create("sticky_teleporters");
        public static final TagKey<EntityType<?>> CANNOT_TELEPORT = create("cannot_teleport");

        public static TagKey<EntityType<?>> create(String name) {
            return TagKey.create(Registry.ENTITY_TYPE_REGISTRY, modLoc(name));
        }
    }

    public static final class Actions {
        /**
         * Actions with this tag can't be used until the caster is enlightened and send the
         * "am I not skilled enough" message
         */
        public static final TagKey<ActionRegistryEntry> REQUIRES_ENLIGHTENMENT = create("requires_enlightenment");
        /**
         * Actions where the pattern is calculated per-world
         */
        public static final TagKey<ActionRegistryEntry> PER_WORLD_PATTERN = create("per_world_pattern");

        public static TagKey<ActionRegistryEntry> create(String name) {
            return TagKey.create(IXplatAbstractions.INSTANCE.getActionRegistry().key(), modLoc(name));
        }
    }
}