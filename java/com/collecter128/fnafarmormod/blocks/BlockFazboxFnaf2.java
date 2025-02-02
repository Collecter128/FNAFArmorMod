package com.collecter128.fnafarmormod.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.collecter128.fnafarmormod.core.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
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

public class BlockFazboxFnaf2 extends Block{
	public static final DirectionProperty FACING = HorizontalBlock.FACING;

	public BlockFazboxFnaf2(Properties p_i48440_1_) {
		super(p_i48440_1_);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}
	
	/**
	    * Called before the Block is set to air in the world. Called regardless of if the player's tool can actually collect
	    * this block
	    */
	   public void playerDestroy(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity p_180657_5_, ItemStack p_180657_6_) {
	   //public void onRemove(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
	      if (!worldIn.isClientSide) {
	    	  ItemStack itemstack1 = new ItemStack(ItemInit.fnaf2ToyFreddy_Head.get());
	    	 ItemStack itemstack2 = new ItemStack(ItemInit.fnaf2ToyFreddy_Body.get());
	    	 ItemStack itemstack3 = new ItemStack(ItemInit.fnaf2ToyFreddy_Legs.get());
	    	 ItemStack itemstack4 = new ItemStack(ItemInit.fnaf2ToyFreddy_Boots.get());
	    	 ItemStack itemstack5 = null;
	    	 
	    	 Random RandomArmorChance = new Random();
	    	 int RareArmorChance = 0;
	    	 RareArmorChance = RandomArmorChance.nextInt(100);
	    	 
	    	 Random random = new Random();
	    	 int RandomInt = random.nextInt(5);
	    	 
	    	 switch(RandomInt) {
	    	 	case 0: 
	    	 		itemstack1 = new ItemStack(ItemInit.fnaf2ToyFreddy_Head.get());
	    	 		itemstack2 = new ItemStack(ItemInit.fnaf2ToyFreddy_Body.get());
	   	    	 	itemstack3 = new ItemStack(ItemInit.fnaf2ToyFreddy_Legs.get());
	   	    	 	itemstack4 = new ItemStack(ItemInit.fnaf2ToyFreddy_Boots.get());
	   	    	 	itemstack5 = null;
	    	 		break;
	    	 	case 1: 
	    	 		itemstack1 = new ItemStack(ItemInit.fnaf2ToyBonnie_Head.get());
	    	 		itemstack2 = new ItemStack(ItemInit.fnaf2ToyBonnie_Body.get());
	   	    	 	itemstack3 = new ItemStack(ItemInit.fnaf2ToyBonnie_Legs.get());
	   	    	 	itemstack4 = new ItemStack(ItemInit.fnaf2ToyBonnie_Boots.get());
	   	    	 	itemstack5 = null;
	    	 		break;
	    	 	case 2: 
	    	 		if(RareArmorChance < 10) {
	    	 			itemstack1 = new ItemStack(ItemInit.fnaf2ToyChica_HeadBeakless.get());
	    	 		}
	    	 		else
	    	 			itemstack1 = new ItemStack(ItemInit.fnaf2ToyChica_Head.get());
	    	 		itemstack2 = new ItemStack(ItemInit.fnaf2ToyChica_Body.get());
	   	    	 	itemstack3 = new ItemStack(ItemInit.fnaf2ToyChica_Legs.get());
	   	    	 	itemstack4 = new ItemStack(ItemInit.fnaf2ToyChica_Boots.get());
	   	    	 	itemstack5 = null;
	    	 		break;
	    	 	case 3: 
	    	 		itemstack1 = new ItemStack(ItemInit.fnaf2RWQ_Head.get());
	    	 		itemstack2 = new ItemStack(ItemInit.fnaf2RWQ_Body.get());
	   	    	 	itemstack3 = new ItemStack(ItemInit.fnaf2RWQ_Legs.get());
	   	    	 	itemstack4 = new ItemStack(ItemInit.fnaf2RWQ_Boots.get());
	   	    	 	itemstack5 = null;
	    	 		break;
	    	 	case 4: 
	    	 		itemstack1 = new ItemStack(ItemInit.fnaf2Puppet_Head.get());
	    	 		itemstack2 = new ItemStack(ItemInit.fnaf2Puppet_Body.get());
	   	    	 	itemstack3 = new ItemStack(ItemInit.fnaf2Puppet_Legs.get());
	   	    	 	itemstack4 = new ItemStack(ItemInit.fnaf2Puppet_Boots.get());
	   	    	 	itemstack5 = null;
	    	 		break;
	    	 		
	    	 	default:
	    	 		itemstack1 = new ItemStack(ItemInit.fnaf2ToyFreddy_Head.get());
	    	 		itemstack2 = new ItemStack(ItemInit.fnaf2ToyFreddy_Body.get());
	   	    	 	itemstack3 = new ItemStack(ItemInit.fnaf2ToyFreddy_Legs.get());
	   	    	 	itemstack4 = new ItemStack(ItemInit.fnaf2ToyFreddy_Boots.get());
	   	    	 	itemstack5 = null;
	    	 }
	    	  
	    	 worldIn.playSound((PlayerEntity)null, pos, SoundEvents.FIREWORK_ROCKET_LAUNCH, SoundCategory.BLOCKS, 1.0F, 0.8F + worldIn.random.nextFloat() * 0.4F);
	    	//player.inventory.add(itemstackIn);
	         popResource(worldIn, pos, itemstack1);
	         popResource(worldIn, pos, itemstack2);
	         popResource(worldIn, pos, itemstack3);
	         popResource(worldIn, pos, itemstack4);
//	         if(itemstack5 != null) {
//	        	 popResource(worldIn, pos, itemstack5);
//	         }
	    	 //player.inventory.addItemStackToInventory(itemstackIn);
	      }

	   }//End of Player Destroy
	
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
