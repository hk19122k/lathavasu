
public class dsa_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LINKED LIST:

			public class Linkedlist {
			    node head; 
			    class node{
			    int d;
			    node next;  ///this is reference to node like pointers
			    node(int f){
			      d =f;
			      next = head;  
			    }
			}
			   public void insertatbeg(int f)
			   {
			      node newnode = new node(f);         
			      if(head == null)
			      {
			        head = newnode;                              ////creating node and inserting it
			      }
			      else{
			         newnode.next= head;
			         head = newnode;
			    }

			   }

			   public void display()
			   {
			       node t = head;      ///based on rules display start from head , assign temp variable fro printing datas
			       while( t != null)
			       {
			        System.out.println(t.d + " ");
			        t = t.next;
			       }
			   }

			   public void insertvalues(int pos, int f)       ///insert at any position
			      {
			        if(pos == 0)
			        {
			            insertatbeg(f);
			            return;
			        }
			        node newnode = new node(f);
			        node t = head;
			        for(int i =1;i<pos;i++)
			        {
			             t = t.next;
			        }
			             newnode.next = t.next;
			             t.next = newnode;
			      }     
			       public void deleteatpos(int pos)
			       {
			        node t = head;
			        node pre = null;
			        if(pos == 0)
			        {
			          head = head.next;
			          return;
			        }
			        for(int i =1;i<=pos;i++)
			        {
			           pre = t;
			           t = t.next;
			        }
			        pre.next = t.next;     ///delete at any position

			       }

			       public boolean search(int f)
			       {
			        node t = head;
			        while(t != null)
			        {
			            if(t.d == f)
			            { System.out.println("true"); }
			            t = t.next;
			        }
			        return false;
			      }
			}

			public class dem {
			    public static void main(String[]args)
			    {
			        Linkedlist list = new Linkedlist();
			        list.insertatbeg(10);
			        list.insertatbeg(3);
			        list.insertatbeg(9);
			        list.insertvalues( 2,29);
			        list.deleteatpos(0);
			        list.search(3);
			        list.display();
			    }
			}


//			STACK:

			public class stack {
			   int a[] = new int[5];
			   int top;
			   stack()
			   {
			    int top = -1;
			   }
			   public void push(int s)
			   {
			      if(top >= 5)
			      {
			        System.out.println("stack overflow");
			      }
			      else{
			           a[++top] =s;     ///post incrementing so it will change top -1 to 0; 
			      }
			   }

			   int pop()
			   {
			    if(top < 0)
			    {
			        System.out.println("stack under -1");
			   }
			   return a[top--];
			}
			}

			public class stackdemo {
			    public static void main(String[]args)
			    {
			        stack s1 = new stack();
			        s1.push(3);
			        s1.push(4);
			        s1.push(5);
			        s1.push(8);

			        System.out.println(s1.pop());
			    }
			}


//			QUEUE:

			public class queue {
			    int h[] = new int[4];
			    int f;
			    int r;
			    queue()
			    {
			        f = -1;
			        r = -1;
			    }
			    public void enqueue(int a)
			    {
			        if(f == -1)
			        {
			            f++;
			        }
			        h[++r] = a;
			    }
			    public int dequeue()
			    {
			        if(f == -1 || f>r)
			        {
			          throw new IndexOutOfBoundsException("Queue empty");
			        }
			        return h[f++];
			    }
			    public void display(){
			        for(int c : h)
			        {
			            System.out.println("queue" + c);
			        }
			    }
			}
			public class queuemain {
			    public static void main(String args[]) 
			    {
			        queue x = new queue();
			        x.enqueue(9);
			        x.enqueue(5);
			        x.enqueue(7);
			        x.enqueue(8);
			        x.display();
			        System.out.println(x.dequeue());
			        System.out.println(x.dequeue());
			        System.out.println(x.dequeue());
			        System.out.println(x.dequeue());
			        System.out.println(x.dequeue());}}
	}

}
