class Node  
{ 
    int data; 
    Node left, right; 
   
    Node(int item)  
    { 
        data = item; 
        left = right = null; 
    } 
} 
   
class q4  
{ 
    Node root1, root2; 
    boolean identicalTrees(Node a, Node b)  
    { 
        
        if (a == null && b == null) 
            return true; 
              
        if (a != null && b != null)  
            return (a.data == b.data 
                    && identicalTrees(a.left, b.left) 
                    && identicalTrees(a.right, b.right)); 
        return false; 
    } 
  
    public static void main(String[] args)  
    { 
        q4 tree = new q4(); 
   
        // 1st Tree
        tree.root1 = new Node(13); 
        tree.root1.left = new Node(60); 
        tree.root1.right = new Node(137); 
        tree.root1.left.left = new Node(34); 
        tree.root1.left.right = new Node(65); 
        tree.root1.right.left = new Node(85);
		tree.root1.right.right = new Node(77);
		
		//2nd Tree
        tree.root2 = new Node(15); 
        tree.root2.left = new Node(10); 
        tree.root2.right = new Node(37); 
        tree.root2.left.left = new Node(49); 
        tree.root2.left.right = new Node(56);
        tree.root2.right.left = new Node(53);
		tree.root2.right.right = new Node(87);		
   
        if (tree.identicalTrees(tree.root1, tree.root2)) 
            System.out.println("Both trees are Equal"); 
        else
            System.out.println("Trees are not Equal"); 
   
    } 
} 