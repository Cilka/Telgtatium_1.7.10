package com.hexopygate.Telgttatium.blockarchtype;

import static net.minecraftforge.common.util.ForgeDirection.NORTH;
import static net.minecraftforge.common.util.ForgeDirection.SOUTH;

import java.util.HashMap;

import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class TelGlassFrame extends BlockPane {

	protected enum Position {
		None, Center, Top, Bottom, Left, Right, TopRight, TopLeft, BottomRight, BottomLeft, CenterFull,
		CenterWalledHorizontal, CenterWalledVertical, BottomWalled, TopWalled, RightWalled, LeftWalled
	}
 

	String FaceTex;
	static String RimText = "Glass_Trim";
	String name = this.getClass().getSimpleName();
	private Position position;
	IIcon currentIcon;
	protected HashMap <String,IIcon> textures = new HashMap<String,IIcon>() ;
	public TelGlassFrame(String faceTexture, String rimTexture) {

		super("tel:" + faceTexture, "tel:" + rimTexture, Material.glass, true);
		// TODO Auto-generated constructor stub
		position = Position.None;
		FaceTex = faceTexture;
		
		this.setBlockName(name).setBlockTextureName("tel:" + name);
		//GameRegistry.registerTileEntity(TEGlassFrame.class, "tel:" +this.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
	}

	public TelGlassFrame(String texture) {
		this(texture, RimText);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass() {
		return 1;
	}
	

	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z,EntityLivingBase base, ItemStack itemstack ) {

		this.position = Position.None;
		System.out.println("Initial Position: " + this.position);
		HashMap<String, Block> neighboringBlocks = new HashMap<String, Block>();
		
		neighboringBlocks.put("north", world.getBlock(x, y + 1, z));
		neighboringBlocks.put("south", world.getBlock(x, y - 1, z));
		
		  boolean flag  = this.paneIsOnAxis(world, x, y, z - 1, NORTH);
	        boolean flag1 = this.paneIsOnAxis(world, x, y, z + 1, SOUTH);
		if((flag || flag1) )
		{
			System.out.println("Set Neighboring Blocks on Z axis");

			neighboringBlocks.put("east", world.getBlock(x, y, z+1));
			neighboringBlocks.put("west", world.getBlock(x, y, z-1));
			SetPosition(neighboringBlocks, z, y);
		}
		else
		{
			System.out.println("Set Neighboring Blocks on X axis");
			neighboringBlocks.put("east", world.getBlock(x + 1, y, z));
			neighboringBlocks.put("west", world.getBlock(x - 1, y, z));
			SetPosition(neighboringBlocks, x, y);
		}
		
		System.out.println("postiion for " + FaceTex + " is " +this.position + " at " + String.format("(%s,%s ,%s)", x,y,z));
		String texName =  "tel:"+FaceTex;
		switch(position)
		{
		case Top:
		texName +="_Top_Frame";
			break;
		case Bottom:
			texName +="_Down_Frame";
			break;
		case BottomLeft:
			texName +="_Down_Left_Frame";
			break;
		case BottomRight:
			texName +="_Down_Right_Frame";
			break;
		case BottomWalled:
			texName +="_Down_Single_Frame";
			break;
		case Center:
			texName +="_Middle_Frame";
			break;
		case CenterFull:
			texName +="_Full_Frame";
			break;
		case CenterWalledHorizontal:
			texName +="_Horizontal_Middle_Single_Frame";
			break;
		case CenterWalledVertical:
			texName += "_Vertical_Middle_Single_Frame";
			break;
		case Left:
			texName +="_Left_Frame";
			break;
		case Right:
			texName +="_Right_Frame";
			break;
		case TopLeft:
			texName +="_Top_Left_Frame";
			break;
		case TopRight:
			texName +="_Top_Right_Frame";
			break;
		case TopWalled:
			texName +="_Top_Single_Frame";
			break;
		case RightWalled:
			texName += "_Right_Single_Frame";
			break;
		case LeftWalled:
			texName += "_Left_Single_Frame";
			break;
		default:
			break;
		}
		System.out.println("Texture name is " + texName);
		//this.blockIcon = icons.get(texName);
		
			
			world.setBlock(x, y, z, GameData.getBlockRegistry().getObject(texName));
	
	}
	   @SideOnly(Side.CLIENT)
	   @Override 
	   public IIcon func_150097_e()
	    {
	        return this.blockIcon;
	    }
	   @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister registry)
	    {
		  
		   this.blockIcon =  registry.registerIcon("tel:"+FaceTex+"_Full_Frame");
		   
	    }
 
	private void SetPosition(HashMap<String, Block> neighbors, int x, int y) {
		if (this.position != Position.None) {
			return;
		}
		if( !(neighbors.get("north") instanceof TelGlassPane)  && !(neighbors.get("north") instanceof BlockAir)&&
				!(neighbors.get("south") instanceof TelGlassPane)	&&!(neighbors.get("south") instanceof BlockAir)&&
				!(neighbors.get("east") instanceof TelGlassPane) &&!(neighbors.get("east") instanceof BlockAir)&&
				!(neighbors.get("west") instanceof TelGlassPane) && !(neighbors.get("west") instanceof BlockAir))
		{
			position = Position.CenterFull;
			return;
		}
		else if(!(neighbors.get("south") instanceof TelGlassPane)	&&!(neighbors.get("south") instanceof BlockAir)&&
				!(neighbors.get("east") instanceof TelGlassPane) &&!(neighbors.get("east") instanceof BlockAir)&&
				!(neighbors.get("west") instanceof TelGlassPane) && !(neighbors.get("west") instanceof BlockAir))
		{
			position = Position.BottomWalled; 
			return;
		}
		else if(!(neighbors.get("north") instanceof TelGlassPane)	&&!(neighbors.get("north") instanceof BlockAir)&&
				!(neighbors.get("east") instanceof TelGlassPane) &&!(neighbors.get("east") instanceof BlockAir)&&
				!(neighbors.get("west") instanceof TelGlassPane) && !(neighbors.get("west") instanceof BlockAir))
		{
			position =Position.TopWalled;
			return;
		}
		else if(!(neighbors.get("south") instanceof TelGlassPane)	&&!(neighbors.get("south") instanceof BlockAir)&&
				!(neighbors.get("north") instanceof TelGlassPane) &&!(neighbors.get("north") instanceof BlockAir)&&
				!(neighbors.get("west") instanceof TelGlassPane) && !(neighbors.get("west") instanceof BlockAir))
		{
			position = Position.LeftWalled;
			return;
		}
		else if(!(neighbors.get("south") instanceof TelGlassPane)	&&!(neighbors.get("south") instanceof BlockAir)&&
				!(neighbors.get("north") instanceof TelGlassPane) &&!(neighbors.get("north") instanceof BlockAir)&&
				!(neighbors.get("east") instanceof TelGlassPane) && !(neighbors.get("east") instanceof BlockAir))
		{
			position = Position.RightWalled;
			return;
		}
		else if(!(neighbors.get("south") instanceof TelGlassPane)	&&!(neighbors.get("south") instanceof BlockAir)&&
				!(neighbors.get("north") instanceof TelGlassPane) &&!(neighbors.get("north") instanceof BlockAir))
		{
			position = Position.CenterWalledHorizontal;
			return;
		}
		else if(!(neighbors.get("east") instanceof TelGlassPane)	&&!(neighbors.get("east") instanceof BlockAir)&&
				!(neighbors.get("west") instanceof TelGlassPane) &&!(neighbors.get("west") instanceof BlockAir))
		{
			position = Position.CenterWalledVertical;
			return;
		}
	
		else if(!(neighbors.get("south") instanceof TelGlassPane)	&&!(neighbors.get("south") instanceof BlockAir)&&
				!(neighbors.get("west") instanceof TelGlassPane) &&!(neighbors.get("west") instanceof BlockAir))
		{
			position = Position.BottomLeft;
			return;
		}
		else if(!(neighbors.get("south") instanceof TelGlassPane)	&&!(neighbors.get("south") instanceof BlockAir)&&
				!(neighbors.get("east") instanceof TelGlassPane) &&!(neighbors.get("east") instanceof BlockAir))
		{
			position = Position.BottomRight;
			return;
		}
		else if(!(neighbors.get("north") instanceof TelGlassPane)	&&!(neighbors.get("north") instanceof BlockAir)&&
				!(neighbors.get("east") instanceof TelGlassPane) &&!(neighbors.get("east") instanceof BlockAir))
		{
			position = Position.TopRight;
			return;
		}
		else if(!(neighbors.get("north") instanceof TelGlassPane)	&&!(neighbors.get("north") instanceof BlockAir)&&
				!(neighbors.get("west") instanceof TelGlassPane) &&!(neighbors.get("west") instanceof BlockAir))
		{
			position = Position.TopLeft;
			return;
		}
		else if(!(neighbors.get("south") instanceof TelGlassPane)	&&!(neighbors.get("south") instanceof BlockAir))
		{
			position = Position.Bottom;
			return;
		}
		else if(!(neighbors.get("north") instanceof TelGlassPane)	&&!(neighbors.get("north") instanceof BlockAir))
		{
			position = Position.Top;
			return;
		}
		else if(!(neighbors.get("east") instanceof TelGlassPane)	&&!(neighbors.get("east") instanceof BlockAir))
		{
			position = Position.Right;
			return;
				}
		else if(!(neighbors.get("west") instanceof TelGlassPane)	&&!(neighbors.get("wast") instanceof BlockAir))
		{
			position = Position.Left;
			return;
		}
		position =  Position.Center;
	}
	 public boolean paneIsOnAxis(World world, int x, int y, int z, ForgeDirection dir)
	    {
	        return canPaneConnectToBlock(world.getBlock(x, y, z)) || 
	                world.isSideSolid(x, y, z, dir.getOpposite(), false);
	    }

	
}
