
public class CustomHashmap<k,v> {

	private Entity<k, v>[] table;
	private int capacity = 5;
	
	public CustomHashmap() {
		table = new Entity[capacity];
	}
	
	static class Entity<k ,v>
	{
		k Key;
		v Value;
		Entity<k ,v> next;
		
        public Entity(k key, v value, Entity<k,v> next){
            this.Key = key;
            this.Value = value;
            this.next = next;
        }
	}
	
	
	public void put(k newkey , v value)
	{
		if( newkey == null )
			return;
		
		int hash = Math.abs(newkey.hashCode() % capacity);
		
		Entity<k, v> newEntity = new Entity<k, v>(newkey, value, null);
		
		if(table[hash] == null)
		{
			table[hash] = newEntity;
		}
		else
		{
			Entity<k, v> previouskey = null;
			Entity<k, v> currentkey = table[hash];
			
			while (currentkey != null ) {
				
				if( currentkey.Key.equals(newkey))
				{
					if(previouskey == null )
					{
						newEntity.next = currentkey.next;
						table[hash] = newEntity;
						return;
					}
					else
					{
						newEntity.next = currentkey.next;
						previouskey.next = newEntity;
						return;
					}
				}
				previouskey  = currentkey;
				currentkey = currentkey.next;
			}
			
			previouskey.next = newEntity;
		}
	}
	
	public v get( k key )
	{
		int hash = Math.abs(key.hashCode() % capacity);
		
		if(table[hash] == null )
		{
			return null;
		}
		else
		{
			Entity<k, v> temp = table[hash];
			
			while (temp != null) {
				if( temp.Key.equals(key))
				{
					return temp.Value;
				}
				
				temp = temp.next;
			}
			
			return null;
		}
		
	}
	
	public void display()
	{
		for( int i = 0 ; i < capacity ; i++)
		{
			if(table[i] != null )
			{
				Entity<k, v> entity = table[i];
				while (entity != null ) {
					System.out.println("key = "+entity.Key+" value = "+entity.Value );
					entity = entity.next;
				}
			}
		}
	}
	
	
}
