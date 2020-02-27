import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreewithLinkedList
{
  Node root;
  public BinaryTreewithLinkedList()
  {
    root = null;
  }

  public void insert(int val)
  {
    Node newnode = new Node(val);
    if(root == null)
    {
      root = newnode;
      return;
    }
    // Taking help of Collection frame work to implement it with queue
    // you can also use your own custorm class that contains implementation Methods of queue
    Queue<Node> q= new LinkedList<Node>();
    q.add(newnode);
    while(!q.isEmpty())
    {
        Node presentnode = q.remove();  // performing dequeue operation to remove node from queue
        if(presentnode.left== null)
        {
          presentnode.left = newnode;
          break;
        }
        else if(presentnode.right== null)
        {
          presentnode.right= newnode;
        }
        else
        {
          q.add(presentnode.left);
          q.add(presentnode.right);
        }
    }
  }

  public void levelTraversal()
  {
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty())
    {
      Node presentnode = q.remove();
      System.out.println(presentnode.data);

      if(presentnode.left != null)
      {
          q.add(presentnode.left);
      }
      if(presentnode.right!=null)
      {
        q.add(presentnode.right);
      }

    }



  }
}
