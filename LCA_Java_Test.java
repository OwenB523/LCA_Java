import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LCA_Java_Test {

	@Test
	public void test_RegularTree()
	{
      LCA_Java tree = new LCA_Java();
      tree.root = new Node(1);
      tree.root.left = new Node(2);
      tree.root.right = new Node(3);
      tree.root.left.left = new Node(4);
      tree.root.left.right = new Node(5);
      tree.root.right.left = new Node(6);
      tree.root.right.right = new Node(7);

      assertEquals( 2, tree.findLCA(4,5));
      //2 should be the lowest common ancestor of 4 and 5//

    }

	@Test
	public void testNullTree()
	{
		LCA_Java tree = new LCA_Java();
		tree.root = null;
		assertEquals( -1, tree.findLCA(4,5));
		//The output should be -1 since the tree is empty//
  	}

	@Test
	public void testTwoNodesNotPresent()
	{
		LCA_Java tree = new LCA_Java();
		tree.root = new Node(1);
		assertEquals( -1, tree.findLCA(4,5));
		//The output should be -1 both nodes are missing//
	}

	@Test
	public void testOneNodeNotPresent()
	{
		LCA_Java tree = new LCA_Java();
		tree.root = new Node(1);
		tree.root.left = new Node(4);
		assertEquals( -1, tree.findLCA(4,5));
		//The output should -1 since one of the nodes is missing//
	}


}
