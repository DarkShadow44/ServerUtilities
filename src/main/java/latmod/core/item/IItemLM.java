package latmod.core.item;

public interface IItemLM
{
	public String getItemID();
	public void onPostLoaded();
	public void loadRecipes();
}