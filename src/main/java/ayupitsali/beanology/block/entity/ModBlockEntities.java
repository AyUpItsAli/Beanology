package ayupitsali.beanology.block.entity;

import ayupitsali.beanology.Beanology;
import ayupitsali.beanology.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Beanology.MOD_ID);

    public static final RegistryObject<BlockEntityType<SolarConvergenceAltarBlockEntity>> SOLAR_CONVERGENCE_ALTAR =
            BLOCK_ENTITIES.register("solar_convergence_altar", () ->
                    BlockEntityType.Builder.of(SolarConvergenceAltarBlockEntity::new,
                            ModBlocks.SOLAR_CONVERGENCE_ALTAR.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
