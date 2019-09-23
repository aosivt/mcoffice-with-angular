export interface ReadOnlyMap<TKey, TValue> {
    get(key: TKey): TValue;
}