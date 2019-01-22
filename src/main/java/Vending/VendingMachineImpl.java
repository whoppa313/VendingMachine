package Vending;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendingMachineImpl implements VendingMachine

{

	private Inventory<Coin> inventoryCash = new Inventory<Coin>();
	private Inventory<Item> inventoryItem = new Inventory<Item>();
	private long salesTotal;
	private Item currentItem;
	private long currentBalance;
	
	public VendingMachineImpl() {
		initialize();
	}
	
	public void initialize()
	
	// gör så att machinen börjar med 5 coins av varje denomination
	// och 5 cans av varje Item
	
	{
		
		for(Coin c : Coin.values()) {
			inventoryCash.put(c,5);
		}
		
		for(Item i : Item.values()) {
			inventoryItem.put(i, 5);
		}
		
	}
	
	
	
	@Override
	public long itemAndPrice(Item item) 
	{
		if(inventoryItem.hasItem(item)) 
		{
			currentItem = item;
			return currentItem.getPrice();
		}
		
		throw new SoldOutExceptoin("Ut Sålt, Välj en annan vara");
	}
	
	@Override
	public Bucket<Item, List<Coin>> collectItemPlusChange()
	{
		
	}
	
}
