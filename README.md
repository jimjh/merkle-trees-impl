# merkle-trees-impl

A practice implementation of merkle trees in Scala. I was inspired by the
Dynamo paper.

## Usage

Construct a new Merkle tree using

```scala
val tree = MerkleTree(data, digest)
```

- `tree#hash` - returns `Array[Byte]`
- `tree#left` - returns `MerkleTree`
- `tree#right` - returns `MerkleTree`

```scala
- findDifference(left, right): Node # lowest node
```

## Developing

TBD

## Testing

TBD
