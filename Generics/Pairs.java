package generics;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Pairs<K extends Number, V> {
	private final Set<Pair<K, V>> itens = new HashSet<>();

	public void add(K key, V value) {
		if(key == null) return;
		
		Pair<K, V> aPair = new Pair<K, V>(key, value);
		if(itens.contains(aPair)) 
			itens.remove(aPair);
		
		itens.add(new Pair<K, V>(key, value));
	}
	
	public V getValue(K key) {
		if(key == null) return null;
		
		Optional<Pair<K,V>> optionalPair = itens.stream()
				.filter(pair -> key.equals(pair.getKey()))
				.findFirst();
		
		return optionalPair.isPresent() ? optionalPair.get().getValue() : null;
	}
}
