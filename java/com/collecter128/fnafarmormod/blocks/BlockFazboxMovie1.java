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

public class BlockFazboxMovie1 extends Block{
	public static final DirectionProperty FACING = HorizontalBlock.FACING;

	public BlockFazboxMovie1(Properties p_i48440_1_) {
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
	    	  ItemStack itemstack1 = new ItemStack(ItemInit.fnaf1Freddy_Head.get());
	    	 ItemStack itemstack2 = new ItemStack(ItemInit.fnaf1Freddy_Body.get());
	    	 ItemStack itemstack3 = new ItemStack(ItemInit.fnaf1Freddy_Legs.get());
	    	 ItemStack itemstack4 = new ItemStack(ItemInit.fnaf1Freddy_Boots.get());
	    	 ItemStack itemstack5 = new ItemStack(ItemInit.Fnaf1FreddyMicrophone.get());
	    	 
	    	 Random random = new Random();
	    	 int RandomInt = random.nextInt(8);
	    	 
	    	 switch(RandomInt) {
	    	 	case 0: 
	    	 		itemstack1 = new ItemStack(ItemInit.fnaf1Freddy_Head.get());
	    	 		itemstack2 = new ItemStack(ItemInit.fnaf1Freddy_Body.get());
	   	    	 	itemstack3 = new ItemStack(ItemInit.fnaf1Freddy_Legs.get());
	   	    	 	itemstack4 = new ItemStack(ItemInit.fnaf1Freddy_Boots.get());
	   	    	 	itemstack5 = new ItemStack(ItemInit.Fnaf1FreddyMicrophone.get());
	    	 		break;
	    	 	case 1: 
	    	 		itemstack1 = new ItemStack(ItemInit.fnaf1Bonnie_Head.get());
	    	 		itemstack2 = new ItemStack(ItemInit.fnaf1Bonnie_Body.get());
	   	    	 	itemstack3 = new ItemStack(ItemInit.fnaf1Bonnie_Legs.get());
	   	    	 	itemstack4 = new ItemStack(ItemInit.fnaf1Bonnie_Boots.get());
	   	    	 	itemstack5 = new ItemStack(ItemInit.Fnaf1BonnieGuitar.get());
	    	 		break;
	    	 	case 2: 
	    	 		itemstack1 = new ItemStack(ItemInit.fnaf1Chica_Head.get());
	    	 		itemstack2 = new ItemStack(ItemInit.fnaf1Chica_Body.get());
	   	    	 	itemstack3 = new ItemStack(ItemInit.fnaf1Chica_Legs.get());
	   	    	 	itemstack4 = new ItemStack(ItemInit.fnaf1Chica_Boots.get());
	   	    	 itemstack5 = new ItemStack(ItemInit.Fnaf1Cupcake.get());
	    	 		break;
	    	 	case 3: 
	    	 		itemstack1 = new ItemStack(ItemInit.fnaf1Foxy_Head.get());
	    	 		itemstack2 = new ItemStack(ItemInit.fnaf1Foxy_Body.get());
	   	    	 	itemstack3 = new ItemStack(ItemInit.fnaf1Foxy_Legs.get());
	   	    	 	itemstack4 = new ItemStack(ItemInit.fnaf1Foxy_Boots.get());
	   	    	 	itemstack5 = null;
	    	 		break;
	    	 	case 4: 
	    	 		itemstack1 = new ItemStack(ItemInit.movie1GoldenFreddy_Head.get());
	    	 		itemstack2 = new ItemStack(ItemInit.fnaf1GoldenFreddy_Body.get());
	   	    	 	itemstack3 = new ItemStack(ItemInit.fnaf1GoldenFreddy_Legs.get());
	   	    	 	itemstack4 = new ItemStack(ItemInit.fnaf1GoldenFreddy_Boots.get());
	   	    	 	itemstack5 = null;
	    	 		break;
	    	 	case 5: 
	    	 		itemstack1 = new ItemStack(ItemInit.fnaf3Springtrap_Head.get());
	    	 		itemstack2 = new ItemStack(ItemInit.fnaf3Springtrap_Body.get());
	   	    	 	itemstack3 = new ItemStack(ItemInit.fnaf3Springtrap_Legs.get());
	   	    	 	itemstack4 = new ItemStack(ItemInit.fnaf3Springtrap_Boots.get());
	   	    	 	itemstack5 = null;
	    	 		break;
	    	 	case 6: 
	    	 		itemstack1 = new ItemStack(ItemInit.movie1Sparky_Head.get());
	    	 		itemstack2 = new ItemStack(ItemInit.movie1Sparky_Body.get());
	   	    	 	itemstack3 = new ItemStack(ItemInit.movie1Sparky_Legs.get());
	   	    	 	itemstack4 = new ItemStack(ItemInit.movie1Sparky_Boots.get());
	   	    	 	itemstack5 = null;
	    	 		break;
	    	 	case 7: 
	    	 		itemstack1 = new ItemStack(ItemInit.fnaf3SpringBonnie_Head.get());
	    	 		itemstack2 = new ItemStack(ItemInit.fnaf3SpringBonnie_Body.get());
	   	    	 	itemstack3 = new ItemStack(ItemInit.fnaf3SpringBonnie_Legs.get());
	   	    	 	itemstack4 = new ItemStack(ItemInit.fnaf3SpringBonnie_Boots.get());
	   	    	 	itemstack5 = null;
	    	 		break;
	    	 		
	    	 	default:
	    	 		itemstack1 = new ItemStack(ItemInit.fnaf1Freddy_Head.get());
	    	 		itemstack2 = new ItemStack(ItemInit.fnaf1Freddy_Body.get());
	   	    	 	itemstack3 = new ItemStack(ItemInit.fnaf1Freddy_Legs.get());
	   	    	 	itemstack4 = new ItemStack(ItemInit.fnaf1Freddy_Boots.get());
	   	    	 	itemstack5 = new ItemStack(ItemInit.Fnaf1FreddyMicrophone.get());
	    	 }
	    	  
	    	 worldIn.playSound((PlayerEntity)null, pos, SoundEvents.FIREWORK_ROCKET_LAUNCH, SoundCategory.BLOCKS, 1.0F, 0.8F + worldIn.random.nextFloat() * 0.4F);
	    	//player.inventory.add(itemstackIn);
	         popResource(worldIn, pos, itemstack1);
	         popResource(worldIn, pos, itemstack2);
	         popResource(worldIn, pos, itemstack3);
	         popResource(worldIn, pos, itemstack4);
	         if(itemstack5 != null) {
	        	 popResource(worldIn, pos, itemstack5);
	         }
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
