import java.util.zip.CRC32
import java.nio.ByteBuffer

import com.jimjh.merkle.spec.UnitSpec
import com.jimjh.merkle._

/** Spec for [[com.jimjh.merkle.MerkleTree]].
  *
  * This spec was left outside the package on purpose to verify the public interface.
  *
  * @author Jim Lim - jim@jimjh.com
  */
class UsageSpec extends UnitSpec {

  it should "construct a new Merkle Tree" in {
    val blocks = Array(Seq[Byte](0, 1, 2, 3), Seq[Byte](4, 5, 6))
    MerkleTree(blocks, crc32)
  }

  def crc32(b: Block) = {
    val digest = new CRC32()
    digest.update(b.toArray)

    val buffer = ByteBuffer.allocate(8)
    buffer.putLong(digest.getValue)
    buffer.array
  }
}
