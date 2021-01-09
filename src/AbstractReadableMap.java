public abstract class AbstractReadableMap<K, V> implements ReadableMap{
    private final Entry<K,V>[] entries;
    public AbstractReadableMap() { this.entries=GenericArrayHelper.newEntryArrayOfSize(10); }
    public AbstractReadableMap(Entry<K,V>[] entries) {
        this.entries=GenericArrayHelper.copyArray(entries);
    }

    @Override
    public V getOrThrow(K key) throws UnknownKeyException{
        for(Entry entry:entries) {
            if (!key.equals(null)) {
                return entry.getValue();
            }
        }
    }
}
