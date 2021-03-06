package xbony2.huesodewiki.infobox.parameters;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import xbony2.huesodewiki.api.infobox.IInfoboxParameter;

public class FlammableParameter implements IInfoboxParameter {

	@Override
	public boolean canAdd(ItemStack itemstack){
		if(itemstack.getItem() instanceof BlockItem){
			Block block = ((BlockItem) itemstack.getItem()).getBlock();
			
			try {
				return block.isFlammable(block.getDefaultState(), null, null, null);
			}catch(Exception e){
				return false;
			}
		}
		return false;
	}

	@Override
	public String getParameterName(){
		return "flammable";
	}

	@Override
	public String getParameterText(ItemStack itemstack){
		return "Yes";
	}
}
