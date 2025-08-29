package net.revivelf.teleportaize.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class MonolithBlock extends Block {

    public MonolithBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.union(
                VoxelShapes.cuboid(0f, 0f, 0f, 1f, 0.06f, 1f),
                VoxelShapes.cuboid(0.12f, 0.06f, 0.12f, 0.88f, 0.12f, 0.88f),
                VoxelShapes.cuboid(0.18f, 0.12f, 0.18f, 0.82f, 0.24f, 0.82f),
                VoxelShapes.cuboid(0.30f, 0.24f, 0.30f, 0.70f, 1.8f, 0.70f)
        );
    }
}
