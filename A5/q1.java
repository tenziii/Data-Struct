class q1
{
static class Node
{
int key;
Node left, right;
}

static Node insert(int key)
{
Node node = new Node();
node.key = key;
node.left = node.right = null;
return (node);
}

static int Sum(Node root)
{
if (root == null)
return 0;
return (root.key + Sum(root.left) +
Sum(root.right));
}

public static void main(String args[])
{
Node root = insert(20);
root.left = insert(18);
root.right = insert(31);
root.left.left = insert(448);
root.left.right = insert(55);
root.right.left = insert(665);

int sum = Sum(root);
System.out.println("Sum of elements is: "+ sum);
}
}