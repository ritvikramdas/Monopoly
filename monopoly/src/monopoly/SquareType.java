// Ritvik Ramdas

package monopoly;

// Can be made by person creating one class for properties, jail block, etc...
public abstract class SquareType 
{
	private String name;	// Name of the tile
	private String tileType;	// eg. Utility / Taxes / Land
	private int owner;	// To determine who owns it. 0 neutral, 1 for player 1... etc.
	private int pos;
	
	public SquareType ( String a , String b , int c , int d )
	{
		name = a;
		tileType = b;
		owner = c;
		pos = d;
	}
	
	public SquareType()
	{
		name = "null";
		tileType = "null";
		owner = 0;
		pos = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String name )
	{
		this.name = name;
	}
	
	public String getTileType()
	{
		return tileType;
	}
	
	public void setTileType ( String tileType )
	{
		this.tileType = tileType;
	}
	
	public int getOwner()
	{
		return owner;
	}
	
	public void setOwner ( int owner )
	{
		this.owner = owner;
	}
	
	public int getPos()
	{
		return pos;
	}
	
	public void setPos ( int pos )
	{
		this.pos = pos;
	}
}