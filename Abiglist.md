# LISTS

## ALIGNMENT

### Morality

- Evil
- Good
- Neutral

### Order

- Chaotic
- Lawful
- True

## LANGUAGES

- Common
- Elvish

## Notes from RevUp Discord

Yes, **.put()** updates a key's value if it already exists in the HashMap

On the other hand, **.replace()** will only replace keys that exist, i.e. if you use **.replace()** and pass a key that doesn't exist in the HashMap, it won't be added; (unlike **.put()**) *but it won't throw an error* either.

There's also **.putIfAbsent()** which adds a key-value pair if the key doesn't exist, unlike **.put()** which replaces the key's value.

If it does exist, it will not be updated, also unlike **.put()**.

