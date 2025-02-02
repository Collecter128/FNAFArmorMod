package com.collecter128.fnafarmormod.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.collecter128.fnafarmormod.core.BlockInit;
import com.collecter128.fnafarmormod.core.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BreakableBlock;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FnafBannerLuckyBlock extends BreakableBlock{
	public static final DirectionProperty FACING = HorizontalBlock.FACING;
	
	public FnafBannerLuckyBlock(Properties p_i48382_1_) {
		super(p_i48382_1_);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	/**
	    * Called before the Block is set to air in the world. Called regardless of if the player's tool can actually collect
	    * this block
	    */
	   public void playerDestroy(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity p_180657_5_, ItemStack p_180657_6_) {
	   //public void onRemove(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
	      if (!worldIn.isClientSide) {
	    	 ItemStack itemstackIn = new ItemStack(ItemInit.BlankBannerPattern.get());
	    	 Random random = new Random();
	    	 int RandomInt = random.nextInt(5);
	    	 
	    	 //if(RandomInt <= 40) {
	    		 itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(RandomInt).get());
//	    	 }
//	    	 else {
//	    		 itemstackIn = new ItemStack(BlockInit.BannerLuckyBlock.get());
//	    	 }
	    	 
//	    	 switch(RandomInt) {
//	    	 	case 0: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(0).get());
//	    	 		break;
//	    	 	case 1: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(1).get());
//	    	 		break;
//	    	 	case 2: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(2).get());
//	    	 		break;
//	    	 	case 3: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(3).get());
//	    	 		break;
//	    	 	case 4: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(4).get());
//	    	 		break;
//	    	 	case 5: 
//	    	 		itemstackIn = new ItemStack(ItemInit.PATTERN_ITEMS.get(5).get());
//	    	 		break;
	    	 	
	    	 		
	    	 	//default:
	    	 	//	itemstackIn = new ItemStack(BlockInit.BannerLuckyBlock.get());
	    	 //}
	    	  
	    	 worldIn.playSound((PlayerEntity)null, pos, SoundEvents.FIREWORK_ROCKET_LAUNCH, SoundCategory.BLOCKS, 1.0F, 0.8F + worldIn.random.nextFloat() * 0.4F);
	         //player.inventory.add(itemstackIn);
	         popResource(worldIn, pos, itemstackIn);
	    	 //player.inventory.addItemStackToInventory(itemstackIn);
	      }

	   }//end of Player Destroy
	
	   public BlockState getStateForPlacement(BlockItemUseContext context) {
		      return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
		   }
		   
		   /**
		    * Returns the blockstate with the given rotation from the passed blockstate. If inapplicable, returns the passed
		    * blockstate.
		    * @deprecated call via {@link IBlockState#withRotation(Rotation)} whenever possible. Implementing/overriding is
		    * fine.
		    */
		   public BlockState rotate(BlockState state, Rotation rot) {
		      return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
		   }

		   /**
		    * Returns the blockstate with the given mirror of the passed blockstate. If inapplicable, returns the passed
		    * blockstate.
		    * @deprecated call via {@link IBlockState#withMirror(Mirror)} whenever possible. Implementing/overriding is fine.
		    */
		   public BlockState mirror(BlockState state, Mirror mirrorIn) {
		      return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
		   }

		   protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
		      builder.add(FACING);
		   }
}
